## Composite Pattern — Simple TodoList Example

**Purpose:**  
The Composite Pattern lets you treat a single todo item and a todo list the same way.

---

### Idea

Both **TodoItem** and **TodoList** have an `isComplete()` method.

- **TodoItem** → complete if the item itself is done
- **TodoList** → complete only if *all* items inside it are done

---

### Structure

- **Component:** `TodoComponent`
- **Leaf:** `TodoItem`
- **Composite:** `TodoList` (can contain items or other lists)

---

### Behavior

- Calling `isComplete()` works the same on:
    - a single todo item
    - a list of todo items
    - a list of lists

---

### Key Point

You don’t need to check whether something is an item or a list —  
the Composite Pattern handles both uniformly.
