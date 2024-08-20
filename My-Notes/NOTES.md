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

### With arrays; when using a built-in function like `.length`, make sure that the function "counting" starts from 0 and not 1. If they do -1 from it. See example below:
```java
int [] array = {1, 2, 3, 4, 5, 6};
System.out.print(array.length) 
```
#### This would print 6 as the answer; meaning it counts from `1`. So, when using the function in a loop we would:
```java
int [] array = {1, 2, 3, 4, 5, 6};
System.out.print(array.length - 1)
```
### To ensure this will work as we intend it to.

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
27. We can not print any array directly. We either need to use `Arrays.toString(array)` or we can loop inside the array's index to print it out.
```java
    System.out.print(array)
```
    This woud just print the memory allocation.
```java
import java.util.Arrays;
System.out.print(Arrays.toString(array))
//or
System.out.print(array[i]) //while i being in some sort of loop
```
    This would print the element in the idnex of the array.

## Methods (functions)

- We can only return 1 variable, to return more than 1; use an array

28. Syntax for methods (functions):
 ```java
        dataType name(parameters) {
            //logic for the function
        }
        return <whatever>;
```
29. We can define a function/method without telling the type of function it has to be. i.e Static or void. But for that we would need to:
```java
    Main obj = new Main();
```
    `New` creates an instance of a class, so it has to match the class name. The public class name has to match the name of the file
30. A function will not change the value in a variable; but it will for an array.

# Method Overloading: (Duplicate functions by the same name)
31. A function can have the same name unless and until it has different parameters. This can not be done by changing the return or the type.
```java
void foo()
void foo(int a)	//Overloaded function foo
int foo(int a, int b)
```
    Like here, different parameters; same name.
32. If we want our method(function) to have infinite parameters we can use:
```java
static int sum(int ...arr){

    int result = 0;
    for (int a: arr) {
        result += a;
    }
        return result;
}
```
    This is basically making all the parameters in form of an array and then using it in that manner.
33. If we want to have a cumpulsary parameter in our function:
```java
static int sum(int x, int ...arr){

    int result = x;
    for (int a: arr) {
        result += a;
    }
        return result;
}
```
    Now, the program forces you to have a value.

## Recursion
34. We can basically use the function inside of an function:
```java
    static int factorial(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
```
## Object Oriented Language/Programming
(It's a concept which explain a way to do programming)
- So basically OOP means making a big function and having sub functions in that function... (dk why google makes it so complicated)

## Proper Defination:
- OOPS tries to map code instructions with real world making the code and easier to understand

## Class
- Class => Object Instantiation => Object
Instantiation means: creating a spcific example or instance of something

## Object
- An object is an instantiation of a class. When a class is defined, a template (info) is defined. Memory is allocated only after object instantiation.

## Modelling an OOP
- Noun -> Class -> Employee
- Adjective -> Attributes -> name, age, salary
- Verb -> Methods -> getSalary(), increment()

## Terminology
- Abstraction -> Hiding internal details
- Encapsulation -> The act of putting various componenets together (like a medicine pill)
- Inheritence -> The act of driving new things from exsisting thing.
- Polymorphism -> One entity many forms (basically one thing which has other things) e.g
    Smartphone - Phone || Smartphone - Calculator

## Custom Class
35. Syntax:
```java
class Employee {
    int id; //Attribute 1
    String name; //Attribute 2 
}
```
   There can only be one "public" class in a file.
36. We can add functions to classes as well
```java
class Employee {
    int id;
    String name;
    //function/method
    public void details() {
        //code for the function/method
    }
    public int get_salary() {
        //code for the function
    }
}
```
## How to use a Custom Class?
37. In the code make a new object:
```java
Employee ahmed = new Employee();
```
   Give it some properties (if applicable)
```java
ahmed.id = 99;
ahmed.name = "Ahmed Mustafa";
```
   Print it (SOUT); or use a function for printing
```java
System.out.print(ahmed.id);
ahmed.details();
```

