
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



  
