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

## Arrays and ArraysList

### Arrays

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

### Arrays List (documentation taken from W3School for Arrays List)
- The ArrayList class is a resizable array, which can be found in the java.util package. The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

- To add an element in the lsit we use .add():
```java
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
```

- To add an element at a specific position:
```java
cars.add(0, "Mazda");
```

- .get(position) - gets an item from the desired index
- .set(index number, <data type>) - changes the element at a specific index
- .remove(index) - removes an element from a specific position
- .clear() - empties the array
- .size() - tells the size of the array (how many elements in the array, starts from 1)
- .sort() - sorts the array; u need to import collection as well:
```java
import java.util.Collections;
Collections.sort(cars);
```

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
# Object Oriented Language/Programming
(It's a concept which explain a way to do programming)
- So basically OOP means making a big function and having sub functions in that function... (dk why google makes it so complicated)

## Proper Defination:
- OOPS tries to map code instructions with real world making the code and easier to understand

## Class
- Class => Object Instantiation => Object
Instantiation means: creating a spcific example or instance of something

## Object
- An object is an instantiation of a class. When a class is defined, a template (info) is defined. Memory is allocated only after object instantiation.

### Object VS Class
#### Class
- A class is like a blueprint or template. It defines the properties (also called fields or attributes) and behaviors (methods) that the objects created from this class will have. However, a class itself is not an actual instance of an object—it's just the structure.

For example, you might create an Employee class that has properties like name and id, and behaviors like setName and getName. But the class itself doesn’t represent any specific employee—it’s just the design.

#### Object
An object is a specific instance of a class. When you create an object, you're using the class as a blueprint to build something concrete. Each object has its own copy of the properties defined in the class, and it can use the methods defined by the class.
```java
Employee raza = new Employee();
```
- Employee is the class (the blueprint).
- raza is an object of the Employee class (an actual instance with its own name, id, etc.).
- instance and object are the same thing

In a nutshell an Object is the variable which has the properties of a Class.

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
## Access Modifiers & Constructors

### Access Modifiers
- Specific where a property/method is accessible. There are 4 types of access modifiers in Java:
1. Private
2. Default 
3. Protected
4. Public
 - [See this](https://github.com/Shayan-Mazahir/Java-Learning/blob/main/My-Notes/Screenshot%202024-08-20%20at%2015-35-28%20Controlling%20Access%20to%20Members%20of%20a%20Class%20(The%20Java%E2%84%A2%20Tutorials%20Learning%20the%20Java%20Language%20Classes%20and%20Objects).png)

### Getters and Setters
- Getters -> Returns the value (accessors)
- Setters -> Sets/Updates the value (mutators)
- Basically what it means is you need to have a set value and a get value... Thats it, a sub-class to get and to set... 

Example:

```java
class Employee {

    private int id;
    private  String name;

    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return this.id;
    }
}
```
### Private
- The "private" in a class basically means you're making that specific variable or function limited to a specific class/function. [private means current class scope access only](https://canary.discord.com/channels/244230771232079873/244238304613105664/1275531659772559492)

### Constructors
//Need more clarification
- In a single package there can not be more than one Class with the SAME name.
- A member function used to initialize an object while creating it. So, instead of writing:
- File name and constructor name should match
```java
Employee name = new MyEmployee();
ahmed.setName("Ahmed Mustafa");
```
We can simply just make a function in our class and use that instead of writing the same thing again and again.
```java
class MyEmployee{
    //other stuff
    public MyEmployee(){ //we can even have parameters if we want to
        name = "Your-Name";
        id = 99;
        //and so on
    }
}
```
And to use it in the code, we can simply:
```java
MyEmployee ahmed = new MyEmployee2("Ahmed", 20);
System.out.println(ahmed.getId());
//something like that
```
## Inheritance
- It's an extension of the class, which can include "modifying"
- In a nutshell its like a new class getting the features of an old class without having to change the old class to match the new class (for some reason that makes sense)

### Syntax
```java
public Transformers(String name, String color, int weapons, boolean mask, int age) {
    this.name = name;
    this.color = color;
    this.weapons = weapons;
    this.mask = mask;
    this.age = age;
}
```
- Inherited Class
```java
public Autobots(String name, String color, int weapons, boolean mask, int age) {
    super(name, color, weapons, mask, age);  // Calls the constructor of Transformers
}
```
- The super keyword in Java is used to call the constructor of the superclass (in this case, Transformers) from a subclass (like Autobots). It allows the subclass to inherit and initialize the properties defined in the superclass. When you create an instance of Autobots, the super(...) in the Autobots constructor essentially says, “Let Transformers (the mother class) handle setting up its own attributes, since Autobots inherits those.”