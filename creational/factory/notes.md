## Factory Pattern:

    The factory method handles deciding which type of concrete class needs to be created by another class.
    we use the factoring method pattern when you have a class that's responsible for creating objects 
    of another type of class, but that class doesn't know in advance which concrete types of the class it should create.

## Use Case

A game needs to create different **character types** based on the player’s selection.

## Example Scenario

- Player selects **Tank** → create `Tank`
- Player selects **Mage** → create `Mage`
- Player selects **Marksman** → create `Marksman`

A **Character Factory** is responsible for deciding which character class to instantiate,
instead of the game logic creating objects directly.

## Why Use the Factory Pattern?

- Keeps game logic independent of specific character classes
- Centralizes object creation logic
- Makes it easy to add new character types (e.g., Bruiser, Assassin)

### New things I learned apart from patterns

    - Supplier → use if you want to return a Lane object
    - Runnable → use if you just want to run assignment logic
    Use Supplier when you need a result; use Runnable when you only need to perform an action.
    
    - static {} is called a static initialization block.
    It is used to initialize static variables or run setup code once, when the class is loaded into memory.

this was by far one of the simplest creational pattern