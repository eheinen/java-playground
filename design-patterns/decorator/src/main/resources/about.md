# Design Pattern - Decorator (Structural)


### About

Sources:
 - https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
 - https://sourcemaking.com/design_patterns/decorator

Decorator design pattern is used to modify the functionality of an object at runtime.
At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.
Decorator design pattern is one of the structural design pattern (such as Adapter Pattern, Bridge Pattern,
Composite Pattern) and uses abstract classes or interface with composition to implement.

#### Intent

 - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
 - Client-specified embellishment of a core object by recursively wrapping it.
 - Wrapping a gift, putting it in a box, and wrapping the box.

#### Problem
 - You want to add behavior or state to individual objects at run-time. Inheritance is not feasible because it is static and applies to an entire class.


![alt text](./structure.png)