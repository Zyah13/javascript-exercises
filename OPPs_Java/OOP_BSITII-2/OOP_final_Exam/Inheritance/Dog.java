package Inheritance;

interface Eating{
    void eating();
}
interface Barking{
    void barking();
}

// Class implementing both interface , achieving multiple inheritance
public class Dog implements Eating, Barking{

    public void eating(){
        System.out.println("Eating...");
    }
    public void barking(){
        System.out.println("Barking...");
    }
    //Main class
    public static void main(String[] args) {
        //Creating an instance of Dog class
        Dog dog = new Dog();

        //Using method from both interfaces
        dog.eating();
        dog.barking();
    }
}