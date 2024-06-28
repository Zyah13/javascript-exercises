package Polymorphism;

public class Main {

    public static void main(String args[]){

        // Bird b = new Bird();
        // Snake s = new Snake();

        // b.makeSound();
        // s.makeSound();

        Animal a = new Bird();
        Animal b = new Snake();

        a.makeSound();
        b.makeSound();

    }
    
}
