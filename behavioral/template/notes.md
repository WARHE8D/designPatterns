# Template Method Pattern

## Idea

All isekai stories follow the same flow, but the MC’s skill is different.

---

## Explanation

- **Base class (Isekai)** defines the story flow:
    - Real world
    - Truck event
    - Reincarnation
    - Skill
- This flow is the **template method**
- **Subclasses** only change the **skill part**

---

## Why it works

- Flow stays the same
- Only unique parts are overridden
- No duplicate code

---

## In short

Template Method fixes the algorithm structure (isekai story) while allowing subclasses to change specific steps (MC’s
skill).
