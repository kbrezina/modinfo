/**
 * Copyright (c) 2012 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Cloudsmith
 * 
 */
package org.cloudsmith.geppetto.pp.dsl.linking;

import java.util.List;

import org.cloudsmith.geppetto.pp.dsl.adapters.CrossReferenceAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class PPObjectAtOffsetHelper {

	/**
	 * TOOO: USE THIS
	 * 
	 * @param a
	 *            node (possibly null)
	 * @return if the given node is part of a cross reference this method returns the node pointing to the {@link CrossReference} <code>null</code> if
	 *         the passed node was a null reference or if the passed node is
	 *         not part of a cross reference.
	 * @since 2.1
	 */
	private INode findCrossReferenceNode(INode node) {
		if(node == null)
			return null;
		EObject eObj = NodeModelUtils.findActualSemanticObjectFor(node);
		List<IEObjectDescription> crossReferences = CrossReferenceAdapterFactory.eINSTANCE.get(eObj);
		if(crossReferences != null && crossReferences.size() > 0)
			return node;

		// if (node.getGrammarElement() instanceof CrossReference)
		// return node;
		while(node.getGrammarElement() != null && isElementOfDatatypeRule(node.getGrammarElement())) {
			node = node.getParent();
			eObj = NodeModelUtils.findActualSemanticObjectFor(node);
			crossReferences = CrossReferenceAdapterFactory.eINSTANCE.get(eObj);
			if(crossReferences != null && crossReferences.size() > 0)
				return node;

			// if (node.getGrammarElement() instanceof CrossReference)
			// return node;
		}
		return null;
	}

	/**
	 * TODO: USE THIS
	 * 
	 * @param node
	 *            a node with an associated {@link CrossReference} grammar element.
	 * @return the {@link EObject} referenced by this node
	 * @since 2.1
	 */
	public List<IEObjectDescription> getCrossReferencedElement(INode node) {
		EObject eObj = NodeModelUtils.findActualSemanticObjectFor(node);
		List<IEObjectDescription> crossReferences = CrossReferenceAdapterFactory.eINSTANCE.get(eObj);
		if(crossReferences == null || crossReferences.size() < 1)
			throw new IllegalArgumentException("Passed node not a pp cross reference node.");

		// if (!(node.getGrammarElement() instanceof CrossReference))
		// throw new IllegalArgumentException("Passed node not a cross reference node.");
		return resolveCrossReferencedElement(node);
	}

	/**
	 * TODO: Use this
	 * 
	 * @since 2.1
	 */
	public INode getCrossReferenceNode(XtextResource resource, ITextRegion region) {
		IParseResult parseResult = resource.getParseResult();
		if(parseResult != null && parseResult.getRootNode() != null) {
			ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), region.getOffset());
			INode crossRefNode = findCrossReferenceNode(leaf);
			// if not a cross reference position and the cursor is at the beginning of a node try the previous one.
			if(crossRefNode == null && leaf != null && region.getLength() == 0 &&
					leaf.getOffset() == region.getOffset()) {
				leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), region.getOffset() - 1);
				return findCrossReferenceNode(leaf);
			}
			else if(crossRefNode != null &&
					crossRefNode.getOffset() + crossRefNode.getLength() >= region.getOffset() + region.getLength()) {
				return crossRefNode;
			}
		}
		return null;
	}

	// protected EObject internalResolveElementAt(XtextResource resource, int offset, boolean containment) {
	// EObject crossRef = resolveCrossReferencedElementAt(resource, offset);
	// if(crossRef != null)
	// return crossRef;
	// IParseResult parseResult = resource.getParseResult();
	// if(parseResult != null && parseResult.getRootNode() != null) {
	// ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
	// if(leaf != null && leaf.isHidden() && leaf.getOffset() == offset) {
	// leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset - 1);
	// }
	// if(leaf != null) {
	// return NodeModelUtils.findActualSemanticObjectFor(leaf);
	// }
	// }
	// return null;
	// }

	/**
	 * USE THIS
	 * 
	 * @since 2.1
	 */
	protected boolean isElementOfDatatypeRule(final EObject grammarElement) {
		final AbstractRule rule = EcoreUtil2.getContainerOfType(grammarElement, AbstractRule.class);
		return GrammarUtil.isDatatypeRule(rule);
	}

	/**
	 * TODO: USE THIS
	 * 
	 * @param node
	 * @return
	 */
	protected List<IEObjectDescription> resolveCrossReferencedElement(INode node) {
		EObject referenceOwner = NodeModelUtils.findActualSemanticObjectFor(node);
		if(referenceOwner != null)
			return CrossReferenceAdapterFactory.eINSTANCE.get(referenceOwner);

		// EReference crossReference = GrammarUtil.getReference((CrossReference) node.getGrammarElement(),
		// referenceOwner.eClass());
		// if (!crossReference.isMany()) {
		// return (EObject) referenceOwner.eGet(crossReference);
		// }
		// List<?> listValue = (List<?>) referenceOwner.eGet(crossReference);
		// List<INode> nodesForFeature = NodeModelUtils.findNodesForFeature(referenceOwner, crossReference);
		// int currentIndex = 0;
		// for (INode nodeForFeature : nodesForFeature) {
		// if (currentIndex >= listValue.size())
		// return null;
		// if (nodeForFeature.getTotalOffset() <= node.getTotalOffset()
		// && nodeForFeature.getTotalEndOffset() >= node.getTotalEndOffset())
		// return (EObject) listValue.get(currentIndex);
		// currentIndex++;
		// }

		return null;
	}

	/**
	 * TODO: USE THIS
	 * 
	 * @return the cross referenced EObject under, right or left to the cursor (in that order) or <code>null</code> if there is no cross referenced
	 *         object next to the offset.
	 */
	public List<IEObjectDescription> resolveCrossReferencedElementAt(XtextResource resource, int offset) {
		INode node = getCrossReferenceNode(resource, new TextRegion(offset, 0));
		if(node != null)
			return getCrossReferencedElement(node);
		return null;
	}

	// public EObject resolveElementAt(XtextResource resource, int offset) {
	// return internalResolveElementAt(resource, offset, true);
	// }

}
