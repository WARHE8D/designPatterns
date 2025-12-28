# Structural Patterns

As code gets bigger, it gets messy. Structural patterns are like **blueprints** that help us organize classes and
objects so they stay easy to manage.

There are two main ways to organize these structures:

---

## 1. Class Patterns (The "Is-A" Rule)

This is about **what a thing is**. It uses **inheritance** to build a hierarchy.

* **Relationship:** A Car **is a** Vehicle.
* **How it works:** You create a parent class (Vehicle) and a child class (Car) inherits all its traits.
* **Key Detail:** This is "set in stone" once you write the code. You can't change what a Car is while the program is
  running.

---

## 2. Object Patterns (The "Has-A" Rule)

This is about **what a thing has**. It uses **composition** (plugging objects into each other).

* **Relationship:** A Car **has an** Engine.
* **How it works:** Instead of the Car being an Engine, it just holds an Engine inside it.
* **Key Detail:** This is flexible. You can "swap" the engine (e.g., from Gas to Electric) while the program is running
  without changing the Car class itself.

| Pattern                    | Brief                                                                                                      |
|:---------------------------|:-----------------------------------------------------------------------------------------------------------|
| **Adapter (Object-based)** | Lets two incompatible objects work together by using a "wrapper."                                          |
| **Bridge**                 | Splits a large class into two hierarchies (Abstraction and Implementation) so they can vary independently. |
| **Composite**              | Lets you treat individual objects and groups of objects the same way (like files in a folder).             |
| **Decorator**              | Dynamically adds new responsibilities to an object without changing its code.                              |
| **Facade**                 | Provides a single, simple entry point to a complex system of many classes.                                 |
| **Flyweight**              | Saves memory by sharing common parts of state between multiple similar objects.                            |
| **Proxy**                  | Provides a placeholder for another object to control access, reduce cost, or add security.                 |

---

### Key Difference

* **Class Patterns:** Deal with the **Relationship** between classes (Static/Fixed).
* **Object Patterns:** Deal with the **Collaboration** between objects (Flexible/Dynamic).