package AbstractionOne;

public abstract  class Animal {
    String name;
    
    abstract void makeSound();

    void Showname(){
        System.out.println("NAme: " + name);

    }
    void setName(String name){
        this.name = name;
    }
}
