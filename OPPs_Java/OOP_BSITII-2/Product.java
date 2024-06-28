/*
 * Problem: 1. Design a program that will accept two numbers and then it will compute the product 
 * of the numbers using GETTERS and SETTERS in Object-Oriented Programming. 
 * Name: Jieya Lingaolingao
 * Year&Sec.: BSIT 2-2
 */
import java.util.Scanner;

public class Product{
 
    //declare variables as private in the class
    //private field
    private int n1;
    private int n2;
   
    //Apply the public getter method for each private 
    // Private fields  accessed only inside in public method.
    public int getum1() //getter method to retrieve the number 1
    {
      return n1;
    }
    public int getnum2()  // getter method to retrieve the number2
    {
      return n2;
    }

    // Apply the public setter method for each private variable.
    public void setnum1(int n1) //setter method to set the number 1
    {
       this.n1 = n1;
    }
    public void setnum2(int n2) // setter method to set the number 2
    {
      this.n2 = n2;
    }
    public int computeProduct(){  // Method to compute Product using return value
         return n1 * n2;
    }
  

    public static void main (String[] args){
        try (Scanner jieya = new Scanner(System.in)) {
          //create an object of the class Product
          Product num = new Product();
          
            //Input first num using setter
            
            System.out.print("Enter First number: ");
            int n1 = jieya.nextInt();
            num.setnum1(n1);
            // Input second num using setter
            System.out.print("Enter Second number: ");
            int n2 = jieya.nextInt();
            num.setnum2(n2);
            
            //print out using calling a method compute product to perform the product computation 
            System.out.println("The Product of " + n1 + " * " + n2 + " = " + num.computeProduct());
        }
    }

}