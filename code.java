// A class is a plan of how we want to represent our own custom datatype. it does nothing except showing how Objects of a class would be

// Declaring a class:
public class Main // a class which is public must be in a file such that filename and classname are the same
{
    // main method is an entry point for the program. this is were the code is executed if we execute the file.
    // String[] args is to add extra data while executing -eg: 'java filename.java Harry'
    // where 'Harry is passed as an argument and can be used inside the program.'
	public static void main(String[] args) { 
		// Object is an occurence of class. If a class is a plan to build a building, object is the building which is constructed
		// Declaring an object:
		Person p1 = new Person();
		Person p2 = new Person("Harry"); // calling a parameterized constructor
		Student s1 = new Student();
		s1.name = "Alex"; // inherited 'name' from Person class
		s1.roll_no = 34;
		
// 		Types of variables:

        // 1.  Primitive
        byte number1 = 123;
        short number2 = 12321;
        int number3 = 2212325;
        long number4 = 236986833;
        float number5 = 36923.23;
        double number6 = 8726623289.53633;
        char my_character = 'H';
        boolean isItRaining = true;
        
        // 2.  Non-Primitive
        String name = "Harry";
        // and all other object types.. such as Array, Class, Object
        
        // Constants: a variable whose value cannot be changed once assigned.
        final PI = 3.14;
        // we generally name constant variables in Uppercase
        final SCREEN_SIZE = 566;
        
	}
}

// a class consists of data in two types:
// 1. Attributes (member variables)
// 2. Behaviours (member methods/functions)
class Person {
    
    // Attribute: a state (variable) owned by the class
    String name;
    
    // Behaviour: a functionality of class which is executed only when called upon
    public void walk(){ 
        System.out.println("I am walking");
    }
    
    // Constructor:-
    //      1. Default Constructor:
    // it is a method which constructes an object.. it returns an object/instance of class 
    Person(){
        // code here will be executed every time a new object of Person class is created.
    }
    //      2. Parameterized Constructor:
    Person(String name){ // requires to supply 'name' value while creating object
        this.name = name; // initialize the name variable of class
    }
}

// Inheritence
class Student extends Person { 
    // now Student class has a copy of Person class Attributes and Behaviours
    // We can add extra fields for this class.. along with containing 'name' and 'walk' from Person class.
    int roll_no;
    
} 


