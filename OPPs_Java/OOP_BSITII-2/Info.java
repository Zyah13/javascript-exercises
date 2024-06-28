//extends keyword  to perform inheritance
//Subclass(Child class)
class Info extends Myname{
    
    int age = 21;
    String course = "BSIT";
    int year = 2;

    //Main Function
    public static void main(String args[]){
        //creat a self object
        Info self = new Info();
        System.out.println("Name:" +self.name);
        System.out.println("Course & Year: " + self.course+" "+self.year);
        System.out.print("Age: " + self.age + " years old");
    }
}

