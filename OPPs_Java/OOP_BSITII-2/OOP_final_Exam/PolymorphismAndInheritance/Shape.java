/*
 * Problem: Using polymorphism and inheritance: write a program to display the names of shapes .
   * Name: Jieya O Lingaolingao
 * Grade&Sec.: BSIT 2-2
 * @Shape.java
 * #Polymorphism and Inheritance
 */


package PolymorphismAndInheritance;

 //Baseclass representing  a generic shape
public class Shape {
    void area(){
        System.out.println("This is generic Shape");

    }
}
// Subclass representing a Square that inheriting from Shape
class Square extends Shape{
    void area(){
        System.out.println("This is Square");
    }
}
//subclass representing a Triangle that inheriting from Shape
class Triangle extends Shape{
    void area(){
         System.out.println("This is Triangle");
    }
}
//Main class to demonstrate  polymorphism and inheritance
class Main {
    public static void main(String args[]){
        //Creating an instances of Shape, Square, Triangle
        Shape a = new Shape();
        Shape s = new Square();
        Shape t = new Triangle();

        // Displaying shape names using polymorphism
        a.area();
        s.area();
        t.area();
    }
}

/*
OUTPUT:
This is generic Shape
This is Square
This is Triangle
 */