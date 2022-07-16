// A class is a plan of how we want to represent our own custom datatype. it does nothing except showing how Objects of a class would be.

// Declaring a class:
public class Main // a class which is public must be in a file such that filename and classname are the same
// i.e. if class called 'Main' is public, it should be in a file called 'Main.java'
{
    // main method is an entry point for the program. this is were the code is
    // executed if we execute the file.
    // String[] args is to add extra data while executing -eg: 'java filename.java
    // Harry'
    // where 'Harry is passed as an argument and can be used inside the program.'
    public static void main(String[] args) {
        // Object is an occurence of class. If a class is a plan to build a building,
        // object is the building which is constructed
        // Declaring an object:
        Person p1 = new Person();
        Person p2 = new Person("Harry"); // calling a parameterized constructor
        Student s1 = new Student();
        s1.name = "Alex"; // inherited 'name' from Person class
        s1.roll_no = 34;

        // Types of variables:
        // 1. Primitive
        byte number1 = 123;
        short number2 = 12321;
        int number3 = 2212325;
        long number4 = 236986833;
        float number5 = 36923.23f;
        double number6 = 8726623289.53633;
        char my_character = 'H';
        boolean isItRaining = true;

        // 2. Non-Primitive
        String name = "Harry";
        // and all other object types.. such as Array, Class, Object

        // Constants: a variable whose value cannot be changed once assigned.
        final double PI = 3.14;
        // we generally name constant variables in Uppercase
        final int SCREEN_SIZE = 566;

        // Array
        int[] arr = new int[3]; // make an empty array
        int[] arr2 = { 1, 2, 3, 4, 5, 6 }; // make an array with values

        arr[2] = 4; // change the third element to value of 4
        System.out.println(arr[2]); // print third element

        // Control Flow Structures:
        // Alter the default order/ sequence of code execution.. (i.e from line number 1
        // to end)

        // 1. Selection
        // if-else statements
        if (3 < 4) { // supply a condition which retuens a boolean here
            System.out.println("3 is less than 4."); // this is executed only if condition is true
        }
        // switch case // similar to multiple switch statements
        char letter = 'C';
        switch(letter){
            case 'A':
                System.out.println("The letter is A");
                break; // if this case is true then exit the switch statement, or else it will execute every case..
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C':
                System.out.println("The letter is C");
                break;
            default:
                System.out.println("Wrong letter"); // default case is executed if all above cases are Wrong
        }

    // 2. Iteration / Looping
    // while
    int number = 10;
    while(number != 0) { // execute all statements within brackets if number is not equal to 0 repeatedly.
        System.out.println(number);
        number--; // decrease value of number by 1.
    }
    // for
    for (int i = 0; i <= 10 ; i++ ) { // create a new int 'i'. loop until i is less than 10. increase value of i by 1 after every loop.
        System.out.println(i);
    }
    // do-while // just a while loop which executes the loop statements without checking the condition for the very first loop.
    // it executes at least once.
    number = 10;
    do {
        System.out.println(number);
        number--;
    } while(number != 0);
    // for-each // simplified for loop 
    int [] intArray = { 10, 20, 30, 40, 50 };
       
    for( int value : intArray ) {
       System.out.println( value );
    }
    
    
    // 3. Jump
    // break // stop a loop
    for (int i = 0; i <= 10 ; i++ ) { 
        System.out.println(i);
        if (i == 5)
            break;
    }
    // continue // skip an iteration of a loop
        for (int i = 0; i <= 10 ; i++ ) { 
        System.out.println(i);
        if (i == 5) {
            continue; }
    }

    // return // return a value or no value at all and exit from a method
    // public int sum(int a, int b) {
    //     return a + b;
    // }
    }
}

// a class consists of data in two types:
// 1. Attributes (member variables)
// 2. Behaviours (member methods/functions)
class Person {

    // Attribute: a state (variable) owned by the class
    String name;

    // Behaviour: a functionality of class which is executed only when called upon
    public void walk() {
        System.out.println("I am walking");
    }

    // Constructor:-
    // 1. Default Constructor:
    // it is a method which constructes an object.. it returns an object/instance of
    // class
    Person() {
        // code here will be executed every time a new object of Person class is
        // created.
    }

    // 2. Parameterized Constructor:
    Person(String name) { // requires to supply 'name' value while creating object
        this.name = name; // initialize the name variable of class
    }
}

// Inheritence
class Student extends Person {
    // now Student class has a copy of Person class Attributes and Behaviours
    // We can add extra fields for this class.. along with containing 'name' and
    // 'walk' from Person class.
    int roll_no;
}

// Abstract class:
// Abstraction is a way to hide implementation details and only knowing what is absolutely necessary
// abstract classes and interfaces help acheive abstraction.
abstract class Vehicle {
    String engineType;
    abstract void startVehicle(); // only necessary information is made known,
    // implementation details will be given later in a class which extends this abstract class
}

class Car extends Vehicle {
    @Override
    void startVehicle(){
        System.out.println("Car Started."); // implementation given later
    }
}

// while we can use abstract classes for abstraction, we cannot have multiple inheritence in it.
// Java does not allow multiple inheritence in classes. But it allows multiple inheritence in interfaces.
// interface is a class-like body which just like abstract classes, hold abstract methods
interface Addition {
    int add(int a, int b);
}
interface Subtraction {
    int minus(int a, int b);
}
class Calculate implements Addition, Subtraction {
    // when we implement an interface, it is mandatory to define the implementation
    // just like the abstract classes.. which we later on defined in the sub class.
    @Override
    int add(int a, int b){
        return a+b;
    }
    @Override
    int minus(int a, int b){
        return a-b;
    }
}


// Generics
// Generics includes:
// 1. Generic class
// 2. Generic interface
// 3. Generic methods

// Generic class means a class which uses a genral datatype.. meaning a datatype which represents all datatypes
// For e.g. By defining a class with generic datatype <T> we say that this class needs to define a type while creating object.
//      This type can be any Non-Primitive datatype like 'Float', 'Integer', or even any Class.

// Consider a scenario where you wish to design a Calculator.
// for every possible combination of float, int, long, double and other number datatypes you would have to design separate methods.

// Like so:
// int sum(int a, int b) {
    // return a+b;
// }
// float (float a, float b){
    // return a+b;
// }

// we can make a generic Class which can use same methods and member datatypes for both of these float and int.
// we use angle brackets '<' and '>' to say that this class uses generic datatypes.
// The generic datatype below is named 'T', however you can name it anything you wish.
// To use multiple generic datatypes in single class, we define it as: <T1, T2> 
class MyNumber<T> {
    T number; // same as saying 'int number' or 'float number'.
    void printNumber() {
        System.out.println(this.number);
    }
}


// Generic interface is nothing but an interface which uses generic datatype ( just like generic class but in interface )
interface MyNewNumber<T> {
    T add(T a, T b); // same as 'int add(int a, int b);'
    T minus(T a, T b); // you can add as many methods you like
}

// Generic methods are methods that use Generic datatype. ( again same as Generic classes and interfaces )
class Example {
    // define the generic datatype before the return type of method
    public static <E> void printAnything(E inputValue){ // we also take a 'E' input parameter
        System.out.println(E);
    } 
    // this was same as:
    public static void printSomething(int someValue){
        System.out.println(someValue);
    }
}

// Bounded Generics:
// Bounded generics just means to restrict the types allowed in a generic datatype.
// Earlier by saying <T> as generic type we were allowing possibly all kinds of datatypes to be called 'T'. 
// This can produce unwanted results if an object is created by using a generic datatype which was not intended for it.
// for e.g. if someone creates our earlier MyNumber<T> class object with a 'Void' or 'Boolean' datatype, 
// we wont be able to do Calculations such as addition, subtraction.
class A {
class MyBoundedClass <T extends A> { // now only A or subclasses of A are allowed while making object of this class
    
}
class Example2 {
    MyBoundedClass<A> obj = new MyBoundedClass<>(); // allowed
    // MyBoundedClass<Integer> obj2 = new MyBoundedClass<>(); // not allowed
}


// Lambda Expressions
// it is a way to shorten methods


