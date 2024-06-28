/*
 * 3. Create a Program to calculate salary of an employee using single inheritance
 *  in Java that we'll be calculating salary of a programmer. 
 * Name: Jieya Lingaolingao
 * Year: BSIT 2-2
 */
//baseclass(parentclass)
class Employee {
    //declare and initialize
    float total_sal = 0, salary = 50000;
}
//extends keyword  to perform inheritance
//Subclass(childclass)
class Programmer extends Employee {
    float bunos = 20000;
    
   // Main Function
    public static void main(String args[]){
        //creat a sal object
        Programmer sal = new  Programmer();
         //Calculating salary
         sal.total_sal = sal.salary + sal.bunos;
         System.out.print("The Total Salary of a Programmer:" +sal.total_sal);
    }

}

