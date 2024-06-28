/* 
 Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.
Name: Jieya Lingaolingao
Course: BSIT 2-2
*/
//Baseclass(parentclass)
class Animal{
   //makeSound method in a baseclass
   void  makeSound(){
     System.out.println("The Animal make a sound");  }
}
 class Cat extends Animal  {     //extend keyword to extend inheritance   //Subclass(childclass)
   //overrides the drive() method in subclass
    @Override 
    void makeSound(){
        System.out.print("The Cat Bark");
    }
    //Main function
    public static void main(String args[]){
    
        Animal animalsound = new Animal();  //create a Animal object 
        Cat catBark = new Cat();       // create a Cat object
           animalsound.makeSound(); //inherited from Animal class
           catBark.makeSound();
    }

}

