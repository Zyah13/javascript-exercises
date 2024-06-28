/*5. Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
Sample Output:                               Set new age and name:
Ean Craig is 11 years old.                   Ean Craig is now 14 years old. 
Evan Ross is 12 years old.                   Lewis Jordan is now 12 years old. 
Name: Jieya Lingaolingao      Course: BSIT 2-2
*/

 //baseclass(parentclass)
class Person {
    //declare name and age attributes 
        String name ;
        int age;
}
//extend keyword to perform inheritance
//Subclass(childclass)
class UpdatePerson extends Person{

    //constructor method
    UpdatePerson(String name,int age){
        this.name = name;
        this.age = age;
    }
           //setters
        void set_name(String name){
           this.name = name;
        }
        void set_age(int age){
           this.age = age;
        }
          //getters
        String get_name(){
           return name;
        }
        int get_age(){
           return age;
        }
        //display Person 1 and 2
        void display_person(){ System.out.println(name+" is "+age+" years old"); }
        //display set age and name of Person 1 and 2
        void diplay_person(){ System.out.println(name+" is now "+age+ " years old");}
       
        //Main Function
    public static void main(String args[]){
        UpdatePerson person1 = new UpdatePerson("Ean Craig",11);
        UpdatePerson person2 = new UpdatePerson("Evan Ross",12);
        person1.display_person();
        person2.display_person();
        
        System.out.println("\nSet new age and name:");
        person1.set_age(14 ); // set age of Person 1
          person1.diplay_person();
        person2.set_name("Lewis Jordan"); //set name of Person 2
          person2.diplay_person();
    } 
    }
