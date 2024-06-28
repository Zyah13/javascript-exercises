/*
 *Problem: Create a class called Date that includes three pieces of information as instance variables—a month (typeint), a day (typeint) and a year (typeint). 
 Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct. 
 Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes(/).
  Write a test application named DateTest that demonstrates classDate’s capabilities.

 * Name :  Jieya O. Lingaolingao
 * Year&SEc.: BSIT 2-2
 *@Date.java 
 *#FinalsActivity3
 */
public class Date{
    private int month,day,year;

    // Constructor to initialize the three instances
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
//setter and getter for Month() method
    public void setMonth(int month){ //setter
        this.month = month;
    }
    public int getMonth(){ // getter
        return month;
    }
//setter and getter for Day() method
    public void setDay(int day){ //setter
        this.day = day;
    }
    public int getDay(){ // getter
        return day;
}
//setter and getter for Year() method
    public void setYear(int year){ //setter
        this.year = year;
    }
    public int getYear(){ // getter
        return year;
    }
// Method to display the date month/day/year as return value
  //Use String.format o create a formatted string with placeholder for month/day/year
    public String displayDate(){
        return String.format(month + "/" + day + "/" + year);
    }
    //Test Application  DateTest to demonstrates classDate’s capabilities
    public class DateTest{
        public static void main(String[] args) {
            Date date = new Date(06,13,2002); // Create an instance of Date class
           // Display Initial Date
           System.out.println("Initial Date: " + date.displayDate()); //Display intial Date
           //Change date using setter
           date.setMonth(04);
           date.setDay(20);
           date.setYear(2002);
           //Display Update Date
           System.out.println("Update Date: " + date.displayDate());
        }
    }
}

/*
 * OUTPUT:
 * Initial Date: 06/13/2002
 * Update Date: 04/20/2002
 */