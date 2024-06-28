package Interface;
import java.util.ArrayList;
import java.util.List;


public class Bank {  // BankName Class

    private List <Account> accounts;  // declare accounts variable as private to store accounts

// Constructor of List Accounts
    public Bank(){
        accounts = new ArrayList<>();
    }

// Adding Accounts method to the list  accounts
   public void Add_Account(Account a){
       accounts.add(a);
   }


// Deposit method in to  Accounts
    public void Deposit(Account a, double amount){
    a.Deposit(amount);
   }


//Withdraw method from Accounts
    public void Withdraw(Account a,double amount){
    a.Withdraw(amount);
   }


//  Balance  Method in  all Accounts in the Bank
     public void View_Balance(){
        for (Account a : accounts){
            System.out.println("Account balance: P" + a.get_balance());
        }
     }
}
