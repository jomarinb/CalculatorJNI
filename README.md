CalculatorJNI
=============

Calculator application which links Java GUI with C coded arithmetics.

Instructions:

1. Compile the Java code running:

  javac Arithmetics.java CalculatorForm.java
  
2. Generate header file running:
  
  javah Arithmetics

3. Mac OS X, running >= JDK 1.7, compile C library for Unix systems (.so):

  gcc -I /System/Library/Frameworks/JavaVM.framework/Versions/A/Headers -shared -o libarithmetics.so -fPIC libArithmetics.c
  
4. Execute running:

  java CalculatorForm


