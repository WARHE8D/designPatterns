# Memento Pattern

The **Memento Pattern** allows an object to save and restore its internal state
without exposing its implementation details, thus preserving encapsulation.

It is commonly used to implement **undo/redo functionality**.

## Participants

- **Originator**: The object whose state needs to be saved (e.g., `ShopItem`)
- **Memento**: Stores a snapshot of the originator’s state (e.g., `ItemState`)
- **Caretaker**: Manages saving and restoring mementos without accessing the state directly (e.g., `main`)

## How It Works

1. The originator creates a memento representing its current state
2. The caretaker stores the memento
3. The originator can restore its state from a previously saved memento

## Pros

- Preserves encapsulation
- Simplifies undo/rollback operations

## Cons

- Can consume significant memory if the object state is large
- Managing many saved states can increase complexity

## Use Cases

- Undo/redo operations
- State rollback
- Version history
