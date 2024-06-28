package AbstractionOne;

public class Main {

    public static void main(String args[]){

        //Concrete idea
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();

        d.setName("Doggy");
        c.setName("Catty");
        
        d.Showname();
        c.Showname();
    }
}
