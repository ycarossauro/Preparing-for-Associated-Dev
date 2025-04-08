# Kotlin Variables Summary

- A **variable** is a container for a single piece of data.
- You **must declare a variable first** before you use it.
- Use the `val` keyword to define a variable that is **read-only** (the value cannot change once assigned).
- Use the `var` keyword to define a variable that is **mutable** or changeable.
- In Kotlin, it's preferred to use `val` over `var` when possible.

## Declaring Variables

To declare a variable:
- Start with the `val` or `var` keyword.
- Then specify the **variable name**, **data type**, and **initial value**.

**Example:**
```kotlin
val count: Int = 2
```

### Type Inference
- You can omit the data type in the variable declaration if an initial value is provided.

**Example:**
```kotlin
val name = "Kotlin"
```

## Common Kotlin Data Types
- `Int`
- `String`
- `Boolean`
- `Float`
- `Double`

## Assignment and Updates
- Use the **assignment operator (`=`)** to assign a value to a variable.
- You can only update a variable declared with `var`.

### Increment & Decrement
- Use the increment operator (`++`) to increase the value of an integer variable by 1.
- Use the decrement operator (`--`) to decrease the value of an integer variable by 1.

## String Concatenation
- Use the `+` symbol to concatenate strings together.
- You can also concatenate other data types like `Int` and `Boolean` to strings.

**Example:**
```kotlin
val age = 25
val message = "I am " + age + " years old."
```