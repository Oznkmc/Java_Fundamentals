# Java\_\_Fundamentals

## IF-ELSE Structure

`if-else` is a decision-making mechanism. When we need to perform different actions based on conditions — such as "if" something is true or "else" if it is not — we use the `if-else` structure.

1. **`if`**: Executes a block of code if the condition is true.  
2. **`else`**: Executes a block of code if the condition is false.  
3. **`else if`**: Used when checking multiple conditions.

---

## SWITCH-CASE Structure

The `switch-case` structure is used to perform actions based on multiple possible values of a variable.  
It provides a cleaner and more readable alternative to using multiple `if-else` conditions.  
The `switch` structure allows you to check one expression against several possible cases.

1. **`switch`**: The expression or value to be evaluated is written here.  
2. **`case`**: A block of code is executed if the value matches this case.  
3. **`default`**: A block of code is executed if no case matches.

## 🔁 Loops

Loops allow repeated execution of code blocks based on conditions or counts. Java offers four main types:

### 1. `for` Loop  
Used when the number of iterations is known. Consists of initialization, condition, and update expressions. Executes the loop body while the condition is true.

### 2. `while` Loop  
Executes the loop body repeatedly **while** the condition is true. Condition is checked before each iteration. Suitable when iteration count is unknown.

### 3. `do-while` Loop  
Similar to `while` but guarantees the loop body runs at least once. Condition is checked **after** executing the loop body.

### 4. `for-each` Loop  
Simplified loop for iterating over arrays or collections. Automatically traverses each element without using an index.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## 🔧 Methods in Java

Methods are reusable blocks of code that perform specific tasks. They help organize code, reduce repetition, and improve readability.

### What is a Method?  
A method is a set of statements that performs a task and can optionally return a result. Methods are defined once and can be called (invoked) multiple times.

### Key Components of a Method:
- **Return Type**: Specifies the type of value the method returns. Use `void` if no value is returned.
- **Method Name**: The identifier used to call the method.
- **Parameters**: Optional inputs passed to the method for use within its body.
- **Method Body**: The block of code that runs when the method is called.

### Types of Methods:
- **Void Methods**: Perform an action but do not return a value.
- **Return Methods**: Perform an action and return a result of a specific type.
- **Parameterized Methods**: Accept input values (parameters) to perform operations based on them.
- **Static Methods**: Belong to the class, not to instances; called using the class name.
- **Instance Methods**: Belong to objects; require an instance of the class to be called.

