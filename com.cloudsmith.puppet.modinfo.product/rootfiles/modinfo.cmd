@echo off
rem ----------------------------------------------------------------
rem This script will launch the Equinox framework
rem
rem usage:
rem   <script name> [ -vm <java binary> ] <command> <command opts> [ -vmargs <vmargs> ]
rem
rem Alternatively, you bypass this script and instead use:
rem   <java binary> <vmargs> -jar <equinox launcher jar> <command> <command opts>
rem ----------------------------------------------------------------

if [%OS%] == [WINNT] goto winnt
if [%OS%] == [Windows_NT] goto winnt
set EXE_DIR=.\
goto goon

:winnt
setlocal
set EXE_DIR=%~dp0

:goon
rem ----------------------------------------------------------------
rem Get path to equinox launcher jar
rem ----------------------------------------------------------------
for /f "delims= tokens=1" %%c in ('dir /B /S /OD "%EXE_DIR%"\plugins\org.eclipse.equinox.launcher_*.jar') do set EQUINOXJAR=%%c

set VM=java
set ARGS=
set VMARGS=

rem ----------------------------------------------------------------
rem Split the arguments into vm, vmargs and common args
rem ----------------------------------------------------------------
:loop
	if [%1] == [] goto endloop
	if [%1] == [-vm] goto vm
	if [%1] == [-vmargs] goto vmargs
	set ARGS=%ARGS% %1
	shift
	goto loop
:vm
	shift
	set VM=%1
	shift
	goto loop

:vmargs
	shift
:vmargs_loop
	if [%1] == [] goto endloop
	set VMARGS=%VMARGS% %1
	shift
	goto vmargs_loop

:endloop

%VM% %VMARGS% -jar "%EQUINOXJAR%" %ARGS%
