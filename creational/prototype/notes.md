Prototype Pattern: Used to handle similar objects creation efficiently.
The Prototype Pattern allows efficient creation of multiple similar characters by cloning
a base character template instead of recreating complex objects from scratch.

Use case:

    lets take genshin impact characters prototype:
    - All characters have similar base stats (atk,crit,EM...) but have slight variants like weapon type, element type etc

Benefits:

    - Improves performance
    - Reduces object creation cost
    - Ensures consistency across characters
    - Makes character generation fast and flexible

Key feature to implement the prototype pattern is Abstract classes and methods:

    - Use an abstract class when:
    - You want to share code between related classes
    - You want to force subclasses to implement certain methods
    - You want to define common behavior + rules