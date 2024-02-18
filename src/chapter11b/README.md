# Interface
An interface is similar to an abstract class, exempt in an abstract class they can be some methods that are not implemented, but in an interface, all abstract methods must be implemented.

Interfaces are implemented and not extended, any class that implements an interface must implement all of its methods or declare itself as an abstract class
## Implementing a single interfaces
```java
public class Book implements Product {
    
}
```

## Implementing multiple interfaces
To implement multiple interfaces, the class header must specify a com-delimited list of names of all the interfaces that they would like to implement.
If a class declares that it would implement multiple interfaces, then it must provide all the methods specified by all the interfaces.
```java
public class Book implements Product, KinldeItem {
    
}
```
## Key Points

### Not for instantiation
Interfaces are not for instantiation

### Implement
Interfaces are implemented not extended

### Abstract if not implemented
Any class that implements an interface, must implement all of it methods, or it must declare itself abstract

### Abstract methods
Methods in an interface must be abstract (no explicit declaration needed) or default