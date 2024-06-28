 //extend keyword to extend inheritance
//Subclass(childclass)
 class Car extends Vehicle {
     //overrides the drive() method in subclass
    @Override 
    void drive(){
        System.out.print("Repairing a car");
    }
    //Main Function
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle(); // create a vehicle object
        Truck car = new Truck();      // create a car object
           vehicle.drive(); // inherited from Vehicle class
           car.drive();


    }

}
