# MyList

## Overview

MyList is a generic list implementation in Java that provides dynamic array functionality with automatic resizing. It implements the ListADT interface, offering core list operations with efficient memory management.

## Features

- **Dynamic Resizing**: Automatically doubles capacity when needed
- **Type Safety**: Generic implementation works with any object type
- **Core Operations**: Add, get, remove, clear, and size operations
- **Bounds Checking**: Proper exception handling for invalid indices
- **Memory Efficient**: Starts with reasonable initial capacity (100 elements)

## Interface (ListADT)

The ListADT interface defines the following methods:

```java
public interface ListADT<ElementType> {
    public void add(ElementType element);          // Add element to end
    public ElementType get(int index);             // Get element at index
    public int size();                             // Get current size
    public ElementType remove(int index);          // Remove element at index
    public void clear();                           // Clear all elements
}
```

## Usage

### Basic Example

```java
MyList<String> list = new MyList<>();
list.add("Hello ");
list.add("World");
System.out.println(list.get(0) + list.get(1));  // Output: "Hello World"
```

### Creating a List

```java
MyList<Integer> numbers = new MyList<>();
MyList<String> words = new MyList<>();
MyList<CustomObject> objects = new MyList<>();
```

### Adding Elements

```java
list.add("First element");
list.add("Second element");
list.add("Third element");
```

### Accessing Elements

```java
String first = list.get(0);      // Gets first element
String last = list.get(list.size() - 1);  // Gets last element
```

### Removing Elements

```java
String removed = list.remove(1);  // Removes and returns element at index 1
```

### Clearing the List

```java
list.clear();  // Removes all elements and resets to initial capacity
```

### Checking Size

```java
int currentSize = list.size();  // Returns number of elements
```

## Performance Characteristics

- **Add Operation**: O(1) amortized (due to occasional resizing)
- **Get Operation**: O(1) constant time
- **Remove Operation**: O(n) linear time (due to element shifting)
- **Clear Operation**: O(1) constant time

## Error Handling

The implementation properly handles edge cases:

- **IndexOutOfBoundsException**: Thrown when accessing invalid indices
- **Automatic Resizing**: Handles capacity overflow gracefully
- **Null Safety**: Proper handling of array operations

## Implementation Details

- **Initial Capacity**: 100 elements
- **Resizing Strategy**: Doubles capacity when full
- **Memory Management**: Proper array copying during resizing
- **Type Safety**: Uses generic arrays with proper casting

## Example Usage Scenarios

1. **Data Collection**: Store and manage collections of objects
2. **Algorithm Implementation**: Use as building block for more complex data structures
3. **Educational Purposes**: Study dynamic array implementation
4. **Prototyping**: Quick list implementation without external dependencies

## Building and Running

Compile the Java files:

```bash
javac ListADT.java MyList.java Main.java
```

Run the example:

```bash
java Main
```

## Extending Functionality

The implementation can be extended with additional methods such as:

- `contains()`: Check if element exists
- `indexOf()`: Find index of element
- `isEmpty()`: Check if list is empty
- `toArray()`: Convert to standard array
