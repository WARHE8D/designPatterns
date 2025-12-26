## Abstract Pattern

    The Abstract Factory pattern is used when a system should not depend on how its objects are created. 
    It creates factories for each group of related objects (like a blue UI factory or red UI factory) that 
    make the different parts of the system. This hides the details of object creation and makes sure that 
    related objects work well together, making the system more organized and easier to test.

### Example: PC Factory Using Abstract Factory Pattern

- **PcFactory** (abstract) defines methods like `createCPU()` and `createGPU()`.
- **HighEndPcFactory** and **LowEndPcFactory** implement these methods differently.
- **Client code** just asks for a PC via `PcFactory`, without worrying about specific CPU or GPU types.

