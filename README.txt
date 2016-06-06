**PROJECT TITLE: JS2JAVA: A compiler to translate a subset of JavaScript to Java/C++

**GROUP: 1JS2JAVA
(Names, numbers, self assessment, and contribution of the members of the group according to:)
NAME1: Luis Costa, NR1: <number>, GRADE1: 0, CONTRIBUTION: -50%)
NAME2: Carlos Pereira, NR2: <number>, GRADE2: 0, CONTRIBUTION: 0%)
NAME3: Joao Pereira, NR1: <number>, GRADE3: 20, CONTRIBUTION: 150%)
NAME4: Hugo Machado, NR2: <number>, GRADE4: 0, CONTRIBUTION: 0%)

** SUMMARY: The framework developed allows the user to parse a JavaScript code snippet through JSON objects created using Esprima (http://esprima.org/demo/parse.html), 
analysing it's systax using ANTLR (Another Tool for Language Recognition);

**DEALING WITH SYNTACTIC ERRORS: The framework does not recover from syntactic errors, exiting right away;

**SEMANTIC ANALYSIS:

**INTERMEDIATE REPRESENTATIONS (IRs): The frameworks walks the tree once to determine class scopes, methods and variable definitions so that it is possible to infer semantic 
errors when the framework generates the code;

**CODE GENERATION: After defining the intermediate representation, the code generation tool analysis the tokens used in each rule processed inside the ParseTree walker, saving the 
content of the code generated into a stack of strings.

**OVERVIEW: As stated beofre

**TESTSUITE AND TEST INFRASTRUCTURE: (Describe the content of your testsuite regarding the number of examples, the approach to automate the test, etc.)

**TASK DISTRIBUTION: (Identify the set of tasks done by each member of the project.)

**PROS: It works.

**CONS: It doesn't work.
