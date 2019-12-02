@echo off

set agent=x64\TraceAgent.dll
set logFile=

:: Usage
:: java -classpath CLASS_PATH "-agentpath:AGENT_PATH=[method=REGEX][#field=REGEX][#log=LOG_PATH]" CLASS

:: CLASS_PATH: the search path of bytecode
:: AGENT_PATH: the path of this agent
:: REGEX: the regular expression to match with the signature of the method or field
:: LOG_PATH: the path to save the trace log
:: CLASS: the class to be executed by java

java -classpath example\classes "-agentpath:%agent%=method=^Lexample/#field=^Lexample/#log=%logFile%" example.Door

echo.
echo.
echo Trace log path: %cd%\trace.log
