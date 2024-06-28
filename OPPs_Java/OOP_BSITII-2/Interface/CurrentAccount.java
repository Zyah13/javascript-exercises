package Interface;

public class CurrentAccount implements Account { // Current Account class implements to Account Interface

    double balance;         // Declare balance variable to store balance
    double OverdraftLimit;  // Declare OverdraftLimit to store  overdraft limit of money amount  allowed to withdraw


// Constructor method to initialize InitialDeposit and OverdraftLimit
    public CurrentAccount(double InitialDeposit, double OverdraftLimit){ 
        this.balance = InitialDeposit;
        this.OverdraftLimit = OverdraftLimit;
    }

// Deposit method to add amount to the balance of Current Account
    public void Deposit(double amount){  
        balance += amount;
        System.out.println("Now Deposite P" +amount+ " to Current Account");
    }

// Withdraw method to subtract amount from  the  balance of Current Account
    public void Withdraw(double amount){  
         // Check if the balance + Overdraft limit value is sufficient to withdraw
         if (balance + OverdraftLimit >= amount){
            balance -= amount;
            System.out.println("Withdraw P" +amount+ " from Current Account");
         }
         else{
            System.out.println("The balance is insufficient to withdraw from  Current Account");
           }    
    }

//  getting balance method that allow us  to view Balances of Savings and Current Accounts
    public double get_balance(){  
        return balance;
    }  
    
// overdraftLimit setter 
   public void set_OverdraftLimit(double OverdraftLimit){
          this.OverdraftLimit = OverdraftLimit;
   }

// Print Initial Deposit and Interset rate value added in Bank System
   public void displayCurrent(){
    System.out.println("\n\nCurrent Account:");
    System.out.println("Initial Deposit: P" + balance);
    System.out.println("OverdraftLimit : P" + OverdraftLimit);
}
}


