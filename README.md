# Design Patterns in Java

> A curated collection of **core Object-Oriented Design Pattern implementations** in Java — organized by category (Creational, Structural, Behavioral).  
> This repository is ideal for learning and referencing **classic design patterns** by example.
> Most of them are gamified logics

---

## About

Design patterns are **reusable solutions** to common software design problems. They aren’t libraries — they are **best practices used by experienced developers** to write flexible, maintainable, and scalable code.

This project demonstrates pattern implementations in Java, grouped by their type:

| Pattern Category | Purpose |
|------------------|---------|
| **Creational**   | Object creation mechanisms |
| **Structural**   | Class/object composition |
| **Behavioral**   | Object interaction and responsibility |

---


## Repository Structure

```
designPatterns/
├── creational/       # Patterns for smart object creation
├── structural/       # Patterns for composing classes and objects
├── behavioral/       # Patterns for object communication and responsibility
└── Main.java         # Entry point — runs all pattern demos
```

---

## Pattern Categories

### Creational
Object creation mechanisms that increase flexibility and reuse of existing code.

| Pattern | Intent |
|---|---|
| **Singleton** | Ensures only one instance of a class exists |
| **Factory Method** | Lets subclasses decide which class to instantiate |
| **Abstract Factory** | Creates families of related objects without specifying concrete classes |
| **Builder** | Constructs complex objects step by step |
| **Prototype** | Creates new objects by cloning an existing one |

---

### Structural
Patterns that explain how to assemble objects and classes into larger structures while keeping them flexible and efficient.

| Pattern | Intent |
|---|---|
| **Adapter** | Makes incompatible interfaces work together |
| **Bridge** | Decouples an abstraction from its implementation |
| **Composite** | Composes objects into tree structures |
| **Decorator** | Attaches new behaviors to objects dynamically |
| **Facade** | Provides a simplified interface to a complex subsystem |
| **Flyweight** | Reduces memory cost by sharing common state |
| **Proxy** | Provides a placeholder/surrogate to control access |

---

### Behavioral
Patterns focused on communication and responsibility between objects.

| Pattern | Intent |
|---|---|
| **Chain of Responsibility** | Passes requests along a chain of handlers |
| **Command** | Encapsulates a request as an object |
| **Iterator** | Traverses elements of a collection without exposing its structure |
| **Mediator** | Reduces chaotic dependencies between objects |
| **Memento** | Captures and restores an object's state |
| **Observer** | Notifies dependents when an object state changes |
| **State** | Alters an object's behavior when its internal state changes |
| **Strategy** | Defines a family of algorithms and makes them interchangeable |
| **Template Method** | Defines a skeleton algorithm, deferring steps to subclasses |
| **Visitor** | Separates an algorithm from the object structure it operates on |

---

## Getting Started

### Prerequisites
- Java **JDK 8+** (pref JDK 17+)
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command-line tools

### Run the Demo

```bash
# Clone the repository
git clone https://github.com/WARHE8D/designPatterns.git
cd designPatterns

# Compile
javac Main.java

# Run
java Main
```

## Further Reading

- [Refactoring.Guru – Design Patterns](https://refactoring.guru/design-patterns)
- [GoF Book – Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns)

---

## Author

**Murtuza** — [@WARHE8D](https://github.com/WARHE8D)

---

## ⭐ Show Your Support

If you found this helpful, consider leaving a ⭐ on the repo!
