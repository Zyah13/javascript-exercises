/*
 * 2. Create a program to calculate area of rectangle using single inheritance
 * in java that we'll be calculating area of a rectangle by inheriting, an area 
 * calculations method of a base class.
 * Name: Jieya Lingaolingao
 * Year: BSIT 2-2
 */

class Rectangle {  //superclass or baseclass (parents class)

     //area calculation method
    float areaCalculation(float width,float length){
        return (width * length);
    }
    }
    //extends keyword  to perform inheritance 
        //subclass(childclass)
    class Area extends Rectangle{

  //Main Function
    public static void main(String args[]){
        //create a area object
        Area area = new Area();
        
        // Inherited from Rectangle class
        System.out.println("\nArea of Rectangle is calculated as :" + area.areaCalculation(5,10));

    }     
    }




  



