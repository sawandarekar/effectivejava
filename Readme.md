# Effective Java 

#### Coding Practice Rules:
1. Code should be reused rather than copied.
2. The dependencies between components should be kept to a minimum. 
3. Errors should be detected as soon as possible after they are made, ideally at compile time.

#### Chapter 2 : Creating and Destroying the Objects
- Item 1: Consider static factory method instead of constructors
- Item 2: Consider Builder when faced with many constructor parameters
- Item 3: Enforce the singleton property with a private constructor or an `enum` type
- Item 4: Enforce non insatiability with a private constructor
- Item 5: Prefer dependency injection to hardwiring resources
- Item 6: Avoid creating unnecessary objects e.g. `String s = new String("created first"); //DON'T DO THIS!`
- Item 7: Eliminate obsolete object references. e.g. `OutOfMemoryError`


GOTO -> page 26  
  
  
  
  
  