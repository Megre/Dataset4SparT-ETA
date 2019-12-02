Online Appendixes and Data Package for: Distinguishing Similar Design Patterns Instances through Temporal Behavior Analysis
======================================================================================

<a href=".">Structure</a>
--------------------------
### 1. <a href="1. Appendixes">Appendixes</a>
- <a href="1. Appendixes/Appendix A. Language constructs and relations.pdf">Appendix A. Language constructs and relations.pdf</a>
- <a href="1. Appendixes/Appendix B. Argument decision algorithm.pdf">Appendix B. Argument decision algorithm.pdf</a>
- <a href="1. Appendixes/Appendix C. Allen's interval-based temporal relations.pdf">Appendix C. Allen's interval-based temporal relations.pdf</a>
- <a href="1. Appendixes/Appendix D. State transition of the State pattern.pdf">Appendix D. State transition of the State pattern.pdf</a>
- <a href="1. Appendixes/Appendix E. Test scripts and behavior specifications.pdf">Appendix E. Test scripts and behavior specifications.pdf</a>
- <a href="1. Appendixes/Appendix F. Detection results, benchmarks, and discussion of disagreed instances.pdf">Appendix F. Detection results, benchmarks, and discussion of disagreed instances.pdf</a>
- <a href="1. Appendixes/Appendix G. A comparison of related approaches.pdf">Appendix G. A comparison of related approaches.pdf</a>

### 2. <a href="2. Target Systems (Source Code, Bytecode, and Libraries)">Target Systems</a> (Source Code, Bytecode, and Libraries)
- source code, bytecode, and available libraries of the six target systems

### 3. <a href="3. Automatically Generated Test Data">Automatically Generated Test Data</a>
 - `.java` files: automatically generated test cases
 - `.log` files: trace logs generated by the Trace Agent, each of which corresponds to the test case with the same name

### 4. <a href="4. Static and Temporal Facts">Static and Temporal Facts</a>
 - <a href="4. Static and Temporal Facts/Static Facts">`Static Facts`</a>: `.owl` files that contain the ontologies generated by the Ontology Generator with respect to each of the six target systems
 - <a href="4. Static and Temporal Facts/Temporal Facts">`Temporal Facts`</a>: `.owl` files that contain the ontologies transformed from the trace logs, which accord with the behavior specification

### 5. <a href="5. Trace Agent (with a Double-click-to-run Example)">Trace Agent</a> (with a Double-click-to-run Example)
 - <a href="5. Trace Agent (with a Double-click-to-run Example)/example">`example`</a>: java code and bytecode that correspond to the paper
 - <a href="5. Trace Agent (with a Double-click-to-run Example)/x64">`x64`</a>: the Trace Agent (TraceAgent.dll) that is deployed as a Dynamic Link Library (.dll) (currently for Windows x64 platform)
 - <a href="5. Trace Agent (with a Double-click-to-run Example)/trace.log">`trace.log`</a>: the full version of the trace log presented in the paper
 - <a href="5. Trace Agent (with a Double-click-to-run Example)/tracing-test.bat">`tracing-test.bat`</a>: a usage example of the Tracing Agent, which generates "trace.log" by a double-click in Windows x64 platform

Viewing Files
-----------------------------
### File Extensions ###
 - `.owl` files. The `.owl` files are text files saved as RDF/XML syntax. They can be opened with **[Protégé](https://protege.stanford.edu)**, **RDF viewer**, or your favorite **text viewer**.

        Note: Please stop the reasoner when opening ".owl" files using Protégé, since it may slow down your computer.
- `.java` files. The `.java` files can be opened with your favorite **text viewer**.
 - `.log` files. The `.log` files are plain text files, thus can be opened with your favorite **text viewer**.
 - `.bat` files. The `.bat` files are batch files running on the Windows platform. They can be executed by a double-click or through the **command line**. They are created with plain text and can be opened with your favorite **text viewer**.


More Details
------------------------------
### Inferring Temporal Relations ###
The temporal ontologies contain the facts corresponding to trace logs, but do not contain the facts relevant to temporal relations. Instead of directly saving temporal relations (e.g., *t:contains*) to ontologies, the inference of temporal relations is built inside DPDT based on [property functions](http://jena.apache.org/documentation/query/extension.html#property-functions) in order to provide additional indexing mechanism. 

### Command-Line Options of the Trace Agent ###
The command line to use the Trace Agent (TraceAgent.dll) is:

    java -classpath CLASS_PATH "-agentpath:AGENT_PATH=[method=REGEX][#field=REGEX][#log=LOG_PATH]" CLASS

The options are explained as follows:
    
- `CLASS_PATH`: the search path of bytecode
- `AGENT_PATH`: the path of TraceAgent.dll
- `REGEX`: the regular expression to match with the [JNI (Java Native Interface) signature](https://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html) of the method or field
- `LOG_PATH`: the path to save the trace log
- `CLASS`: the class to be executed

An example is as follows to generate the trace log presented in the paper:

    java -classpath example\classes "-agentpath:%agent%=method=^Lexample/#field=^Lexample/#log=%logFile%" example.Door

`%agent%` is the agent path and `%logFile%` is the log path. Both are variables defined in <a href="5. Trace Agent (with a Double-click-to-run Example)/tracing-test.bat">`tracing-test.bat`</a>. The regular expression `^Lexample/` represents a method or field whose JNI signature starts with `Lexample/` (corresponding to the fully qualified name that starts with `example.`).