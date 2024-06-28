package Inheritance;

// Base class (superclass) 
public class Animal {  
    
    void eat(){
        System.out.println("Eating");
    }
// Derived class (subclass) inheriting from Animal
public static class Dog extends Animal{
    void bark(){
        System.out.println("Barking ");
    }
}
//Main class
    public static void main(String[] args) {
         // Creating an instance of the derived class
        Dog dog = new Dog();
        // Using inherited method from the base class
        dog.eat();
        // Using method from the derived class
        dog.bark();
    }

}
