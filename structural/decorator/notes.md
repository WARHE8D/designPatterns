## Decorator Pattern – Simple Summary

**Purpose:**  
The Decorator Pattern lets you add or change an object’s behavior **without creating many subclasses**.

**Key Idea:**  
Wrap an object with extra features (decorators) instead of modifying the original class.

---

## Example: Genshin Character Creation

A base **Character** can be enhanced using decorators:

- ⭐ **Character Rating**: 4★ or 5★
- 🌌 **Constellation Level**: C0 – C6
- ⚔️ **Weapon Refinement**: R0 – R5

Each of these can be added independently as decorators.

---

## Why Use Decorators Here?

- Avoids subclass explosion (e.g., `5StarC6R5Character`)
- Flexible combinations of upgrades
- Easy to add new enhancements later

---

## In Short

> Decorator Pattern = **Base Character + Optional Enhancements (Rating, Constellation, Weapon)**  
> Behavior changes dynamically without new subclasses
