package AbstractionTwo;

public class Main {
    public static void main (String args[]){

        //CONCRETE
        Dog d = new Dog();
        Frog f = new Frog();
        Bird b = new Bird();

        d.makeSound();
        f.makeSound();
        b.makeSound();


    }
}
