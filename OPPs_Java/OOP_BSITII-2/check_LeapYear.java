import java.util.Scanner;   // importing scanner to allow user to prompt

/* Problem: Design a program that will accept a year from the user and then the program will check if the given year by the user is a leap year or not a leap year using Object Oriented Programming.
/* @checkYear.java
/*Author: Jieya O. Limgaolingao
/* Year & Sec.: BSIT 2-2
 */

public class check_LeapYear      //check_LeapYear  as Main class
{

    public static void main(String[] args)
    {
        try (Scanner jieya = new Scanner(System.in)) {
          System.out.println("Leap Year Checker Using OOP\n");
          System.out.print("Enter Year: ");  
          int year = jieya.nextInt();            //  Input a Year to check if the given year by the user is a leap year or not 

             Check_aYear(year);  // calling Method Check_aYear with pass year value
        }
         
    }
       public static void  Check_aYear(int y)       //Method Header with No return type
       {

            System.out.println("--------------------- Display ---------------------");

             if(y % 4 == 0 && y % 100 != 0 || y % 100 == 0 && y % 400 == 0)  // if condition is true the body method will be executed
               {
                  System.out.println( y +" is a LEAP year");   // Method body, action to be perform if  true
               }
             else                                                  //else body method will be executed
               {
                 System.out.println( y +" is NOT a LEAP year");  // Method body, else action to be perform as false
               }
       }
}
