# Command Pattern

### Light Switch Example

## Intent of the Pattern

The **Command Pattern** encapsulates a request as an object, allowing you to:

- Decouple the object that **invokes** an operation from the object that **performs** it
- Parameterize objects with different requests
- Queue, log, or undo operations
- Extend behavior without modifying existing code

---

## Problem (Without Command Pattern)

```java
var light = new Light();
light.

turnOn();
light.

turnOff();
```

## Issues

- The caller is tightly coupled to the `Light` class
- The caller must know which method to call
- Adding undo, macros, or logging requires changing caller logic
- Behavior is hardcoded and not reusable

This approach works for simple cases but does not scale well.

---

## Applying the Command Pattern

### Core Idea

Instead of calling methods directly, **wrap each action in a command object**.

- A command represents what needs to be done
- The invoker triggers the command
- The receiver performs the actual work
- The caller never directly interacts with the receiver

---

## Pattern Roles

### Receiver

The object that knows how to perform the action.

