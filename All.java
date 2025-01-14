/*
1. Java Basics
What is Java?
Java is a high-level, object-oriented programming language designed for portability, scalability, and performance. It is platform-independent, meaning code can run on any platform that has a Java Virtual Machine (JVM).

Key Features of Java:
Object-Oriented: Java is based on object-oriented principles like inheritance, polymorphism, abstraction, and encapsulation.
Platform-Independent: Java code can run on any device with a JVM, thanks to the principle of "Write Once, Run Anywhere" (WORA).
Robust and Secure: Java has strong memory management and built-in security features.
Multithreading Support: Java provides built-in support for multithreading, allowing efficient multitasking.

2. Java File Extensions
.java: A Java source code file. This file contains human-readable Java code, and it is compiled into bytecode (i.e., .class file) before running.

.class: A compiled Java bytecode file. After a .java file is compiled, it becomes a .class file containing bytecode, which the JVM interprets and executes.

.jar: Java ARchive, a package that bundles multiple .class files and associated resources (images, libraries) into a single file. Used for distribution and execution.

.war: Web Application Archive. Used for web applications, typically includes resources like .jsp, .servlet, and other configuration files.

.ear: Enterprise Application Archive. Typically used for Java EE (Enterprise Edition) applications that include multiple modules like EJB (Enterprise JavaBeans) and web modules.

3. Basic Java Syntax
Hello World Program
A basic Java program that prints "Hello, World!" to the console:

java
Copy code
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/*
Explanation:

public class HelloWorld: Defines a class named HelloWorld. All Java programs must have at least one class.
public static void main(String[] args): The main method is the entry point of the program. The JVM looks for this method to start execution.
System.out.println("Hello, World!");: Prints the string to the console.
Basic Data Types
Java has primitive data types and objects. Here are some common primitive types:

int: Integer (e.g., 5, -10)
double: Floating-point number (e.g., 3.14, -5.67)
char: Single character (e.g., 'a', '1')
boolean: True or false (e.g., true, false)
Variables and Constants
Variables: Store data in memory.

*/

int age = 25;  // Variable
double price = 10.5;

//Constants: Use the final keyword to declare a constant value.
final double PI = 3.14159;  // Constant



//If-Else:

int age = 18;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

//Switch-Case:

int day = 2;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid day");
}

//Loops: For Loop:

for(int i = 0; i < 5; i++) {
    System.out.println(i);
}

//While Loop:

int i = 0;
while(i < 5) {
    System.out.println(i);
    i++;
}


/*
4. Object-Oriented Programming (OOP) Concepts
Classes and Objects
Class: A blueprint for creating objects. Defines the properties (fields) and methods (functions).
Object: An instance of a class.
Example:

*/
class Car {
    String color;
    String model;

    // Constructor to initialize object
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Color: " + color + ", Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car car1 = new Car("Red", "Toyota");
        car1.displayDetails();
    }
}

//Inheritance
//Inheritance allows one class to inherit properties and methods from another class.

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Outputs "Bark"
    }
}

//Polymorphism
//Polymorphism allows you to define one interface and multiple implementations.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();  // Outputs "Bark"
        myCat.sound();  // Outputs "Meow"
    }
}

//Encapsulation : Encapsulation is the concept of restricting access to certain details of an object and providing controlled access through public methods (getters and setters).

class Person {
    private String name;  // private field

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

//Abstraction: Abstraction involves hiding the complexity and only exposing the necessary details.

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Outputs "Bark"
    }
}

//5. Exception Handling: Java provides a robust mechanism for handling errors or exceptions that may occur during the execution of a program using try-catch blocks.

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
6. Collections in Java Collections are a framework in Java that provides classes and interfaces for storing and manipulating groups of objects.

List: Ordered collection (e.g., ArrayList, LinkedList).
Set: Unordered collection with unique elements (e.g., HashSet, TreeSet).
Map: Collection of key-value pairs (e.g., HashMap, TreeMap).
Example with ArrayList:
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);  // Output: [Apple, Banana]
    }
}

/*
7. Java Development Environment
Setting Up Java Development Kit (JDK)
Download the JDK from the official Oracle website or use OpenJDK.
Set up your IDE (e.g., Eclipse, IntelliJ IDEA, or VS Code with Java extensions).
Compiling and Running Java Programs
To compile a Java program:
*/
javac HelloWorld.java  # Compiles .java file to .class file

//To run the compiled Java program:
java HelloWorld  # Runs the compiled .class file

// This guide introduces to Java basics, its syntax, file extensions, OOP concepts, and key features. We can explore advanced topics like generics, streams, concurrency, and design patterns.