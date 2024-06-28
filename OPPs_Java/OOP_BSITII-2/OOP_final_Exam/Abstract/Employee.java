/*
 * Problem: Using abstraction concept on superclass: 
   write a program for employee class contains the variable (ID, name, mobile-no and salary) do the following operations
 * Name: Jieya O Lingaolingao
 * Grade&Sec.: BSIT 2-2
 * @Employee.java
 * #Abstraction
 */

package Abstract;
//Abstract  superclass Employee
abstract class Employee{
    //Private initialize instances variables
    private int id;
    private String name, mobile_no;
    private float salary; 

    //Constructor to initialize Employee Properties
        public Employee (int id, String name, String mobile_no, float salary){
                this.id = id;
                this.name = name;
                this.mobile_no = mobile_no;
                this.salary = salary; 
        }
    //Abstract method to implemented by subclasses
        public abstract void display();
        //getter for ID method
           public int  get_id(){
              return id;
           }
        // getter method for Name method
           public String get_name(){
            return name;
           }
        // getter method for Mobile Number method
           public String get_Mobile_number(){
               return mobile_no;
           }
        // getter method for Salary method
           public float get_salary(){
             return salary;
           }
        }
class Student extends Employee{
            // Constructor to initialize student properties using the super class constructor
           public Student(int id, String name, String mobile_no, float salary){
                   super(id,name,mobile_no,salary);
               }
               @Override   // Override the display method from the Employee superclass
               public void display(){
                   // Condition to check if the name is Ahmad before displaying Information
                   if (get_name().equals("Ahmad")){
                       System.out.println("Employee ID: " +get_id() + "\nName: " + get_name());
                       System.out.println("Mobile Number: " +get_Mobile_number() + "\nSalary: $"+get_salary()+"\n");
                   }   
               }
           }
class Main {
         public static void main (String args[]){
                // Initial values for 4 Employees using Student class part timer
                   Student e1 = new Student(1234, "Sarah", "09124384321",30000);
                   Student e2 = new Student(2143, "Ahmad", "09124231221",70000);
                   Student e3 = new Student(3421, "Eyah", "09424388332",100000);
                   Student e4 = new Student(4123, "Xandie", "09122266864",20500);
             // Display Employee Information  with the name Ahmad
               System.out.println("=====Display Employee Name Ahmad =====");
               e1.display();
               e2.display();
               e3.display();
               e4.display();
             }
 }
      
 /*
OUTPUT
=====Display Employee Name Ahmad =====
Employee ID: 2143
Name: Ahmad
Mobile Number: 09124231221
Salary: $70000.0
*/

   