# Polymorphism
Polymorphism is the ability to take multiple forms specifically in object an oriented programming. \

Polymorphism is where a subclass can define their own unique behavior and yet share some of the behaviors of their superclass. \

```java
    Animal dog = new Dog();
```

In the above, Dog is a subclass that inherited from the Animal class, yet an animal but having its own characteristics. \

## Polymorphism Key Points
### Type vs Instance
An object can have a superclass type, and a subclass instance

### Access
Polymorphic objects can only access the methods of their type(not their instance). Casting is required in order to access the methods of their instance.

### Override Methods
If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime.

### instanceOf Operator
The instanceOf operator is used to determine if an object is an instance of a certain class.

