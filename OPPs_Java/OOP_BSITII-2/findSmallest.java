import java.util.Scanner;
/*
1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
*/

public class findSmallest{

    public static void main(String args[]){
       try (Scanner jieya = new Scanner (System.in)) {
        System.out.print("Input the first number: ");
        int num1 = jieya.nextInt();
        System.out.print("Input the Second number: ");
        int num2 = jieya.nextInt();
        System.out.print("Input the third number: ");
        int num3 = jieya.nextInt();
        System.out.println("The smallest Value is:" + smallest(num1,num2,num3));
    }

    }
    public static int smallest(int x,int y,int z){

            return Math.min(Math.min(x,y),z);
    }
}