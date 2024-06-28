/*
 *Problem: Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words “is larger”. 
           If the numbers are equal, print “These numbers are equal”
 * Name :  Jieya O. Lingaolingao
 * Year&SEc.: BSIT 2-2
 *@Activity1.java
 *#FinalsActivity1
 */

import java.util.InputMismatchException;
import java.util.Scanner;  //import Scanner for the user able to input data

public class Activity1
{
    public static void main (String args[]){
        Scanner eya = new Scanner(System.in);
        int num1;
        int num2;
    
           try {
           System.out.print("Enter first integer: "); // print to Enter first Integer
             num1 = eya.nextInt();                    // initialize variable num1 w/data type integer and read num1 as inputed by user
            
            System.err.print("Enter Second integer: ");  // print to Enter Second Integer
             num2 = eya.nextInt();                       // initialize variable num2 w/data type integer and read num2 as inputed by user

            display(num1,num2); // call display() method   
           }  catch (InputMismatchException e) {  // to do hadle exception
                  System.err.println("Error! The Input should be valid integer ");
           }finally{
            eya.close();  // close the scanner to prevent resource leak
           }
    }
    
          public static void display(int n1, int n2) {  // Method to display without return  value
            if ( n1 > n2){
                System.out.println(n1 + " is larger than " + n2);  // excuted if number 1 is larger
            }
            else if (n1 < n2){
                System.out.println(n1 + " is smaller than " + n2); // excuted if number 1 is smaller
            }
            else if (n1 == n2){
                System.out.println(n1 + " is equal to " + n2);  // excuted if number 1  and number 2 is equal
            }
    }

}

/*Ouput:
 * Enter first integer: 5
 * Enetr Second integer 3
 * 5 is larger than 3
 
 * Enter first integer: 1
 * Enetr Second integer 3
 * 1 is smaller than 3
 
 * Enter first integer: 5
 * Enetr Second integer 5
 * 5 is equal to 5
 */