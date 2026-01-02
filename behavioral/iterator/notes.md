# Iterator Pattern in Java

The **Iterator Pattern** allows sequential access to elements of a collection without exposing its underlying
representation.
It is commonly used with **Collections** in Java.

Implementing the `Iterable` interface allows an object to be used in a **for-each loop**, making iteration simple and
consistent.
You can also create **custom iteration logic** by implementing the `Iterator` interface.

---

### Key Points

- Iterable allows an object to be iterated using a for-each loop.
- Iterator defines how to traverse elements.
- You can customize iteration logic (e.g., only return MARKSMAN or MAGE types in the example).
- Helps encapsulate collection traversal, keeping your code clean and maintainable.
