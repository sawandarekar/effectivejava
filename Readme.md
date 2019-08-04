# Effective Java 

#### Coding Practice Rules:
1. Code should be reused rather than copied.
2. The dependencies between components should be kept to a minimum. 
3. Errors should be detected as soon as possible after they are made, ideally at compile time.

#### Chapter 2: Creating and Destroying the Objects
- Item 1: Consider static factory method instead of constructors
- Item 2: Consider Builder when faced with many constructor parameters
- Item 3: Enforce the singleton property with a private constructor or an `enum` type
- Item 4: Enforce non insatiability with a private constructor
- Item 5: Prefer dependency injection to hardwiring resources
- Item 6: Avoid creating unnecessary objects e.g. `String s = new String("created first"); //DON'T DO THIS!`
- Item 7: Eliminate obsolete object references. e.g. `elements[size] = null; // Eliminate obsolete reference`
- Item 8: Avoid finalizers and cleaners
- Item 9: Prefer try-with-resources to try-finally

#### Chapter 3: Methods common to all objects
- Item 10: Obey general contract when overriding `equals` 
    - Reflexive: `x.equals(x)` must return `true` 
    - Symmetric: `x.equals(y)` must return `true` if and only if `y.equals(x)` is true
    - transitive: `x.equals(y)` returns `true` and `y.equals(z)` returns `true`, then `x.equals(z)` must return `true`
    - Consistent: for multiple invocations `x.equals(y)` must return consistently true or false
- Item 11: Always override `hashCode` when you override `equals`
- Item 12: Always override `toString
- Item 13: Override clone judiciously
- Item 14: Consider implementing comparable

#### Chapter 4: Classes and Interfaces
- Item 15: Minimize the accessibility of classes and members
- Item 16: In public classes, use accessor methods, not public fields
- Item 17: Minimize mutability : To make class immutable follow these 5 rules
    - Don't provide methods that modify object state
    - Ensure that class cant be extended, mark as final
    - make all fields final and private
    - Ensure exclusive access to any mutable components
- Item 18: Favor composition over inheritance : composition and forwarding approach
- Item 19: Design and document for inheritance or prohibit it


GOTO -> page 93
  
  
  
  
  