import java.util.Scanner;
/*
 * Write a Java method to compute the average of three numbers.
 */


public class ComputeAve {
    public static void main(String args[]){
     try (Scanner jieya = new Scanner(System.in)) {
        System.out.print("Input first number: ");
         int num1 = jieya.nextInt();
         System.out.print("Input Second number: ");
         int num2 = jieya.nextInt();
         System.out.print("Input third number: ");
         int num3 = jieya.nextInt();
         System.out.println("The average value is:"+average(num1,num2,num3));
    }

    }
    public static double average(double x, double y,double z){
        return (x + y + z)/ 3;
    }
}



