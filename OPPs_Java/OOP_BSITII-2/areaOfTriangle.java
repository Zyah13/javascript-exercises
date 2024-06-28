import java.util.Scanner;
/*
 * Problem: 1. Write a Java methods to calculate triangle area.
 * Name: Jieya Lingaolingao
 * Year & Sec. : BSIT 2-2
 */

public class areaOfTriangle {  // areaOfTriangle as Main Class
    public static void main (String args[]){
        try (Scanner jieya = new Scanner(System.in)) {
            System.out.print("Input the Base: "); 
            float b = jieya.nextFloat();   //input the  base number of  Triangle
            System.out.print("Input the Height :");  
            float h = jieya.nextFloat();  // input the  height number of Triangle
             
            //Display output
            System.out.println("The area of the triangle is " + computeArea(b,h) + " square units");
        }
     }
         // ComputeArea method that will return Value 
         public static double computeArea(float base, float height){
            return (base * height) / 2;

         }
    }
    

