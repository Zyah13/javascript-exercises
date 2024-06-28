import java.util.Scanner;
/*
 * 2. Write a Java method that accepts three integers 
 * and checks whether they are consecutive or not. Returns true or false.
 * Name: Jieya Lingaolingao
 * Sec & Year: BSIT 2-2
 */

public class isConsecutive {  //isConsecutive as Main Class
    public static void main(String args[]){
        try (Scanner eya = new Scanner(System.in)) {
          System.out.print("Input first number: ");
          int num1 = eya.nextInt();  //input first number
          System.out.print("Input Second number: ");
          int num2 = eya.nextInt(); //input second number
          System.out.print("Input third number: ");
          int num3 = eya.nextInt();  //input third number

          //Display output
          System.out.println(num1 +" "+num2+" and "+ num3+ " is consecutive ?\nAnswer: " + check(num1,num2,num3));
        }
    }
      //method to check if it's consecutive that will return boolean(true of false)
      public static boolean check(int n1,int n2, int n3){
        return (n1 - n2 == 1) && (n2 - n3 == 1) || (n2 - n1 == 1) && (n3 - n2 == 1); 
      }
    }
    

