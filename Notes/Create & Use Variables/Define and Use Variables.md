# Define and use variables

1. Explain what it is expression, evaluate and exemplify it. 
    **Answer:**  - expression:  small unit of code that evaluates to a value. An expression can be made up of variables, function calls, and more.
    - evaluate: determining the value of an expression
    - Example: var count = 2 (count is the expression and its evaluate is 2)

2. In your words, explain the best practices to name a variable. Exemplify.  
    **Answer:**  To name a variable it's important start the world following the camel case convention, starting the first word with camel case and , if have multiple words, all other words should begin with a capital letter.    
        
    Example variable names:
    - numberOfEmails
    - cityName
    - bookPublicationDate


3. What's assignment operator?  
    **Answer:** The assignment operator, as the name says, assigns a value to the variable represented by the symbol "="

4.  What's literal values?  
    **Answer:** are fixed or constant values declared with **val**

5. What's the function of the "$" on a string?  
    The symbol "$" on a string it's a string template that have a function to call the expression's evaluated and its value gets substituted into the string.

6. What's the different abouyt val and var?
    Val is used when you expect the variable value will not change and var is used when you expect the variable value can change

7. What's concatenation in kotlin?  
    It's when you combine two strings together like the example: 
    ```kotlin
        val nextMeeting = "Next meeting:"
        val date = "January 1"
        val reminder = nextMeeting + date
        println(reminder)
    ```
8. If someone want to use quotation marks in a string what he needs to do?  
    The person needs to put a ```\"``` for example: 
     ```kotlin
        println("Say \"hello\"")
    ```
    Result: Say "hello"