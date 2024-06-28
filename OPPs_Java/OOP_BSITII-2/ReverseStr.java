/*
 * Problem: Write a program to reverse a string using Default Constructor. 
 * Name: Jieya Lingaolingao
 * Year&Sec.: BSIT 2-2
 */

import java.util.Scanner;

public class ReverseStr {
     //declare variables as private in the class
    //private field
    private String str;

    //Default Constructor
    public ReverseStr(){
        this.str = "";
    }
    //Apply the public getter method for each private 
    // Private fields  accessed only inside in public method.
    public String getString() //getter method to retrieve the String
    {
      return str;
    }
     // Apply the public setter method for each private variable.
     public void setString(String str) //setter method to set the String
     {
        this.str = str;
     }

     // Method to reverse a String
    public String reverser(){
        String reverseStr = "";
        for (int i = 0; i < str.length();i++){ // using a for loop to traverse each character
           char ch = str.charAt(i);     // extracts each character
        reverseStr = ch + reverseStr; // add every character in beggining of empty string revrseStr
        }
         return reverseStr;
    }
     
    

   public static void main (String[] args){
        try (Scanner jieya = new Scanner(System.in)) {
         //create an object of the class Product
           ReverseStr  rev = new ReverseStr ();

           //Input a String using Default constructor
           System.out.print("Enter a String: ");
           String s = jieya.nextLine();
           rev.setString(s);

           //Print out using calling a method of reverser to perform the string reverse
           System.out.println("Reverse String: " +s+ "   ===>   " + rev.reverser());
      }
   }

   }
