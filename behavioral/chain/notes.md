# Chain of Responsibility Pattern

### Genshin Impact Domain Resin Example

## Intent of the Pattern

The **Chain of Responsibility (CoR)** pattern lets a request pass through a chain of handlers.
Each handler:

1. Decides whether it can handle the request
2. Handles it **or**
3. Forwards it to the next handler in the chain

The sender does **not** need to know which handler will process the request.

---

## Mapping the Pattern to Genshin Impact

### The Request

**Request:** *Spend enough resin to claim domain rewards for one run.*

The request flows through the chain until one handler can fulfill it.

---

### The Handlers

Each resin type is a **handler** with a single responsibility:

- **Condensed Resin Handler**
    - Handles the request if condensed resin is available
- **Fragile Resin Handler**
    - Handles the request if fragile resin is available
- **Original Resin Handler**
    - Handles the request if original resin is available
- **End of Chain**
    - No resin available → request fails or exits

---

## Player Context (Example Data)

- 5 Condensed Resin
- 1 Fragile Resin (worth 40 Original Resin)
- 200 Original Resin
- Conversion rule: **60 Original Resin = 1 Condensed Resin**

The player wants to **spend resin in priority order** without manually choosing every time.

---

## Resin Spending Priority Chain

    Condensed Resin Handler
              ↓
    Fragile Resin Handler
              ↓
    Original Resin Handler
              ↓
    End (no handler can process the request)

## Summary

- This example demonstrates Chain of Responsibility by:

- Defining a clear request

- Assigning one responsibility per handler

- Passing the request through a priority-ordered chain

- Keeping the sender decoupled from resource logic