Prototype Pattern: Used to handle similar objects creation efficiently.
The Prototype Pattern allows efficient creation of multiple similar characters by cloning
a base character template instead of recreating complex objects from scratch.

Use case:

    lets take genshin impact characters prototype:
    - All characters have similar base stats (atk,crit,EM...) but when you need some slight changes to that same character
        we can use the clone method to get the same character but with a slight change
        for example we did to Jahoda:
            - when she is trained by Nefer and gets her paycheck and appropriate holiday leaves 
                she levels up to 90 with increased base atk
            - but when Nefer ignores her demands and works her overtime she evolves to evil Jahoda where she absorbs the
                abyssial powers and gains significant base atk and eventually takes over Tevayt.

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

More features to prototype (not included in this project):
- shallow and deep cloning