Singleton Pattern:

    very rare usage. Its also called anti-pattern as its painful if not used correctly
    Usecase:    Database adapter instance, loggers
    Allows only 1 instance of a class. 

Thread Safety:
if 2 threads call the getInstance() at the same time they create 2 different instances which defeats
the point of singleton
solution: make the class enum as its always thread safe

Summary:

    primary reason to use a singleton pattern is to ensure only one instance of a class exists, 
    useful for resources like database connections
    
    PrintSpooler class constructor made private when implementing the singleton pattern
    - to prevent instantiation from outside the class and ensure only one instance is created