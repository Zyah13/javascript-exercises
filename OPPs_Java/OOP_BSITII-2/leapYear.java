import java.util.Scanner;
/*
 * Write a Java method to check whether a year (integer) entered by the user is a
leap year or not.
 */


public class leapYear {
    
    public static void main (String args[]){
        try (Scanner jieya = new Scanner(System.in)) {
            System.out.print("Input a Year: ");
            int year = jieya.nextInt();

            System.out.println(year +" is a leap year = " +isleapYear(year));
        }
        
    }
     public static boolean isleapYear(int y){
         boolean a= (y % 4 == 0);
         boolean b= (y % 100 != 0);
         boolean c= (y % 100 == 0 && y % 400 == 0);
         return a && (b || c);
     }
}
