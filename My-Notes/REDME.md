# Java Programming Notes

_Had to make an md cause i was getting lost in the txt one 💀💀_

## Naming Conventions
1. For classes, use Pascal Convention:
   - First and subsequent characters from a word are capital letters (uppercase).
   - Examples: `Main`, `MyScanner`, `MyEmployee`, `CodeWithHarry`

2. For functions and variables, use camelCase Convention:
   - First character is lowercase, and subsequent characters are uppercase.
   - Examples: `myScanner`, `myMarks`, `codeWithHarry`

3. Snake case can be used, though it's not recommended.

## Data Types and Literals
4. Differences between float and double:
   - `double` is 64 bits
   - `float` is 32 bits

5. Integer Limits:
    - `Integer.MAX_VALUE`: The maximum value an int can store.
    - `Integer.MIN_VALUE`: The minimum value an int can store.

6. Adding `L` or `f` for literals is a Java-specific practice. (refer to convo in [Programmers hangout](https://canary.discord.com/channels/244230771232079873/244238304613105664/1256643829444902955).)

## Input/Output
7. `new Scanner` for input creates a copy of the Scanner object/template.

8. Variable name for the scanner can be anything.

9. Input methods:
   - `next()` only reads words before a space
   - `nextLine()` reads everything

10. `printf` for formatted output:
   - Use `\n` for new line (there's no `printlnf`)
   - Format specifiers:
     - `%d`: integer
     - `%f`: float and double (use `%.15f` for decimal places)
     - `%c`: character
     - `%s`: string

## Operators
11. `%`: Modulo (gives remainder)
12. `&&`: AND operator
13. `||`: OR operator

## Type Conversions
14. Conversion results:
    - byte + short -> integer
    - short + integer -> integer
    - long + float -> float
    - integer + float -> float
    - character + integer -> integer
    - character + short -> integer
    - long + double -> double
    - float + double -> double

## Strings
15. Java reads input as String, not Character. Use `charAt()` to access characters.

16. String methods:
    - `.trim()`: Remove whitespaces
    - `.substring(start, end)`: Extract substring
    - `.replace(char1, char2)`: Replace characters
    - `.startsWith("string")`: Check string start
    - `.endsWith("string")`: Check string end
    - `.charAt(index)`: Get character at index
    - `.indexOf("char", startIndex)`: Find index of character/string
    - `.lastIndexOf("string", startIndex)`: Find last occurrence
    - `.equals("string")`: Check equality
    - `.equalsIgnoreCase()`: Check equality ignoring case

## Control Structures
17. Switch case types:
    - Enhanced: 
    ```java
        case 9 -> System.out.println("Number is 9");
    ```
    - Normal:
    ```java
        case 9:
            System.out.println("Number is 9");
    ```

18. Do-while loop executes at least once, even if condition is false.

19. For-loop syntax:
    ```java
    for (<start>; <end>; <increment>) {
        // code
    }
    ```

20. `continue`: Skips current iteration
21. `break`: Exits the loop

## Arrays

# With arrays; when uding a built-in function like `.length`, make sure that the function "counting" starts from 0 and not 1. If they do -1 from it. See example below:
```java
int [] array = {1, 2, 3, 4, 5, 6};
System.out.print(array.length) 
```
# This would print 6 as the answer; meaning it counts from `1`. So, when using the function in a loop we would:
```java
int [] array = {1, 2, 3, 4, 5, 6};
System.out.print(array.length - 1)
```
# To ensure this will work as we intend it to.

22. Array indexing starts at 0. Meaning the `counting` starts from 0.

23. Array declaration methods:
    ```java
    int[] marks = new int[5]; // Declare + Memory allocation
    int[] marks; marks = new int[5]; // Separate declaration and allocation
    int[] marks = {100, 80, 70, 30, 10}; // Declare + Initialize
    ```

24. For-each loop:
    ```java
    for (int element : arrayName) {
        // code
    }
    ```

25. Multidimensional arrays:
    ```java
    int[][] flats = new int[2][3]; // 2 rows, 3 columns
    ```
26. Using for-each for a 2-D array: (Chapter-6 Question 4)
    We need to use an [i] in a for-each loop while accessing any 2-D or more array.
    ```java
    for (int i = 0; i < array_1.length; i++) {
        for (int j = 0; j < array_1[i].length; j++) {}
    }
    ```
    This is ensuring that the code is running through EACH row and COLUMNS in the code.
