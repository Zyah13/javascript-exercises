/* 
 4.Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
Sample output: 
Repairing a vehicle
Repairing a car
Name: Jieya Lingaolingao
Course: BSIT 2-2
*/

//Baseclass(parentclass)
class Vehicle{

   //drive method in a baseclass
   void  drive(){
     System.out.println("Repairing a vehicle");
   }
}
//extend keyword to extend inheritance
//Subclass(childclass)
 class Car extends Vehicle {
   //overrides the drive() method in subclass
    @Override 
    void drive(){
        System.out.print("Repairing a car");
    }
   
    //Main function
    public static void main(String args[]){
    
        Vehicle vehicle = new Vehicle();  //create a vehicle object 
        Car car = new Car();       // create a car object
           vehicle.drive(); //inherited from Vehicle class
           car.drive();


    }

}
