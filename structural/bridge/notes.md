# Bridge Pattern

## Problem

When we have multiple dimensions of variation (e.g., **Shape** and **Color**), using inheritance can lead to a large
number of classes.

Example:

- Shapes: Circle, Square
- Colors: Red, Blue

Using inheritance would require classes like:

- RedCircle, BlueCircle, RedSquare, BlueSquare, etc.

As more shapes or colors are added, the number of classes grows rapidly (class explosion).

---

## Solution (Bridge Pattern)

The Bridge Pattern separates the abstraction from its implementation and connects them using **composition instead of
inheritance**.

Instead of creating separate classes for each shape–color combination:

- A `Shape` **has a `Color`**
- `Shape` and `Color` are independent hierarchies

---

## Key Idea

> **Every shape has a color, but a shape is not a color**

---

## Benefits

- Avoids class explosion
- Follows **composition over inheritance**
- Shape and Color can evolve independently
- Improves flexibility and maintainability

---

## When to Use

- When multiple features vary independently
- When inheritance leads to too many subclasses
