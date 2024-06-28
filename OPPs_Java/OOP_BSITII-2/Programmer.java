//extends keyword  to perform inheritance
//Subclass(childclass)
class Programmer extends Employee {
    float bunos = 20000;
    
    //Main Function
    public static void main(String args[]){
        //creat a sal object
        Programmer sal = new  Programmer();
        //calculating salary
         sal.total_sal = sal.salary + sal.bunos;
         System.out.print("The Total Salary of a Programmer:" +sal.total_sal);
    }

}
