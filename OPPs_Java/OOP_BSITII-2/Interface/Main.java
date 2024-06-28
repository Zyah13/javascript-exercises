/*
* Problem: Make a Java programming to create a banking system with three classes - BankName, AccountName, SavingsAccount, and CurrentAccount. 
* The bank should have a list of accounts and methods for adding them. 
* Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
* SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
* @Interface
* Programmer : Jieya Lingaolingao
* Yr & Sec.  : BSIT 2-2 
*/


package Interface;

public class Main {   // Main Class

    public static void main (String args[]){

                    //CONCRETE
    // Create  intances  of Bankname Classes
        Bank b = new Bank(); 
    // create instances of Savings Account with initializing Initial Deposite and Interest Rate.
        SavingsAccount s = new SavingsAccount(1000, 1.25); 
    // Create instances of Current account with initializing initial Deposite and Overdraft limit.
        CurrentAccount c = new CurrentAccount(5000, 1000);
        
    // Adding Saving Account and Current Account to the Bank
        b.Add_Account(s);
        s.displaySavings();  // Display Initial Balance and Interest rate 
        b.Add_Account(c);
        c.displayCurrent(); //Display Initial Balance and Overdraft Limit 


        System.out.println("\n");
    // Deposite amount in  Saving Account
        b.Deposit(s,100);
    // Deposite amount in Current Account
        b.Deposit(c,500);
    // Withdraw amount from Current Account
        b.Withdraw(s, 150);


    // Print Balance in all Accounts
    System.out.println("\n\nSavings A/c and Current A/c.:");
       b.View_Balance();

    
   // Print bAlance in all Account after applying the Calculation of Interest in Savings account for 1 Year
    System.out.println("\n\nAfter applying interest on Savings A/c for 1 year:");
    System.out.println("Savings A/c and Current A/c.:");
    s.calculateInterest();
    b.View_Balance();



    }
    
}





