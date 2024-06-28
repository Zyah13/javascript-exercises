/*
 * Problem: Using constructor and this keyword: 
   write a program for student class (roll-no, name, subject and mark) do the following operations
 * Name: Jieya O Lingaolingao
 * Grade&Sec.: BSIT 2-2
 * @Student.java
 * #this keyword
 */

class Student {
     //Private initialize instances variables
    private int rollNo, mark;
    private String name, subject;

    //Constructor to initialize Student Properties
    public Student(int rollNo, String name, String subject, int mark ){
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.mark = mark; 
    }
    //getter for roll No method
    public int get_rollNo(int rollNo){
        return rollNo;
    }
    //getter for Name method
    public String get_name(String name){
        return name;
    }
    //getter for subject method
    public String get_subject(String subject){
        return subject;
    }
    //getter for mark method
    public int get_mark(int mark){
        return mark;
    }
    //Display Information of Student with roll No 10
    public void displayInfo(){
        if (rollNo == 10){
            System.out.println("Roll No. : "+rollNo+ "\nName : "+name+ "\nSubject : "+subject+ "\nMark : "+mark);
        }
    }
    // Curve 2 marks for students with mark < 2
    public void carve2(){
        if(mark < 5){
            mark=+2;
            System.out.println("Carved 2 marks for "+name);
        }
    }
    public static void main(String[] args) {
        //Initial values for 4 students.
        Student s1 = new Student(10,"Zhian","Mathematics",9);
        Student s2 = new Student(12,"Jieya","English",3);
        Student s3 = new Student(14,"Ahmad","Science",2);
        Student s4 = new Student(16,"Jade","Physical Education",6);

       // Display the information of student who has roll-no = 10.
       System.out.println("\nInformation of student with Roll No 10:");
       s1.displayInfo();
       s2.displayInfo();
       s3.displayInfo();
       s4.displayInfo();

       // carve 2 marks for student who has mark < 5.
       System.out.println("\nCarving 2 marks for students with marks < 5:");
        s1.carve2();
        s2.carve2();
        s3.carve2();
        s4.carve2();
        
    }
}
/*
 OUTPUT:
Information of student with Roll No 10:
Roll No. : 10
Name : Zhian
Subject : Mathematics
Mark : 9

Carving 2 marks for students with marks < 5:
Carved 2 marks for Jieya
Carved 2 marks for Ahmad
 */
