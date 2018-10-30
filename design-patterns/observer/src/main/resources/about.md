# Design Pattern - Observer (Behavioral)


### About

Source: https://sourcemaking.com/design_patterns/observer

#### Intent

 - Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 - Encapsulate the core (or common or engine) components in a Subject abstraction, and the variable (or optional or user interface) components in an Observer hierarchy.
 - The "View" part of Model-View-Controller.

#### Problem

 - A large monolithic design does not scale well as new graphing or monitoring requirements are levied.

![alt text](./structure.png)