# Flyweight Pattern

    Basically used to reduce the memory.
    Creates new object only when its not in a stored map
    Allows to reuse the object instead of creating the same object multiple times.     
    Basically like a cache 

# Key points:

    Shared data (pokemon identity) is stored once
    
    Unique data (position) is passed in when used
    
    A factory manages and reuses existing objects
    
    Best for games or simulations with many repeated entities
    
    This keeps the system efficient, lightweight, and scalable.

# Summary

    The Flyweight pattern reduces memory usage by sharing common objects instead of creating many similar ones.
    In the anime example, multiple characters (like Naruto clones) reuse the same character object while keeping 
    their unique details (such as position) outside the object.
    