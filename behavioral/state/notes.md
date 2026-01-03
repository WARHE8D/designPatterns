# State Pattern — Summary

The **State Pattern** allows an object to change its behavior when its internal state changes.  
It eliminates large `if-else` or `switch` statements by delegating behavior to state-specific classes.

---

## Problem

A single action (e.g., a media player button) behaves differently based on the current state  
(Play / Pause), leading to complex conditional logic.

---

## Solution

- Create a **State interface**
- Implement concrete state classes (`PlayState`, `PauseState`)
- The **context object** (MediaPlayer) delegates behavior to its current state
- State objects handle transitions to other states

---

## Example Flow

1. MediaPlayer starts in `PauseState`
2. Button press → delegated to current state
3. State performs action and updates MediaPlayer’s state

---

## Key Benefits

- Removes conditional logic
- Encapsulates state-specific behavior
- Easy to add new states
- Improves readability and maintainability

---

## Key Components

- **Context**: `MediaPlayer`
- **State Interface**: `MediaPlayerState`
- **Concrete States**: `PlayState`, `PauseState`

---

## In short

> The State Pattern lets an object alter its behavior when its state changes by encapsulating state-specific behavior in
> separate classes.
