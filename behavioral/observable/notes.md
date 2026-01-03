# Observer Pattern

The **Observer Pattern** allows objects (observers) to be notified automatically
when another object (observable) changes its state.

It is commonly used for **event handling** and **real-time updates**.

## Java Implementation

- Before Java 9, Java provided `Observable` and `Observer` classes
- These were **deprecated** because of design limitations
- Modern Java uses:
    - `PropertyChangeListener`
    - `PropertyChangeSupport`

## Core Components

- **Observable (Subject)**:  
  The object whose state changes (e.g., `Location`)
- **Observer**:  
  The object that listens for changes (e.g., `WeatherUpdates`)

## Key Classes

### PropertyChangeSupport

- Used **inside the observable**
- Manages listeners and fires change events
- Notifies observers only if `oldValue` and `newValue` are different (`equals` check)

```java
firePropertyChange(String propertyName, Object oldValue, Object newValue)
