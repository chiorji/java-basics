# ABSTRACTION
Abstraction is defined as something that exists in theory but  does not have a concrete existence.

`abstract` in Java is a non-access modify that can be used on `classes` and `methods`. It is used to define a template for a `class` or `method` but do not intend for it to be used as-is.
```java
public abstract class Shape {
    
}
```
An `abstract` class is not designed to be instantiated, rather it is designed to be extended, thus pushing the burden of implementation unto to the subclass.

```java
public abstract class Shape {
    abstract double calculateArea(){}
}
```

A shape is an `abstract` concept, it specifies the kind of behavior that perhaps all shapes can have, it serves as a parent class for more specific subclasses to extend from.

An `abstract` method has no body, only the signature of the method is defined, and is not designed to be run as-is, but to be overridden by a subclass

## Key points

### Templates
Abstract classes and methods are templates that are meant to be implemented by their subclasses.

### Reserved Word
Classes and methods are declared as abstract by using the `abstract` keyword

### Implementation required on Inheritance
If a subclass extends from an abstract class, it must implement its abstract methods or be declared abstract itself.

### Abstract classes
Abstract classes cannot be instantiated, it is only to be used as a superclass. If even one method in a class is abstract, the class must be declared abstract itself.