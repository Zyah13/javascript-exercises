package Interface;

public class SavingsAccount implements Account { // SavingsAccount class implements to Account Interface
    
    double balance;       // Declare balance variable  to store balance
    double InterestRate;   // Declare InterestRate variable  to store Interest rate


// Constructor method to initialize InitialDeposit and InterestRate
    public SavingsAccount(double InitialDeposit,double InterestRate){  
        this.balance = InitialDeposit;
        this.InterestRate = InterestRate;
    }


// Deposit method to add amount to the balance of Savings Account
    public void Deposit(double amount){   
        balance += amount;
        System.out.println("Now Deposite P" +amount+ " to Savings Account");
    }



// Withdraw method to subtract amount from  the  balance of Savings Account
    public void Withdraw(double amount){   
        // Check if the balance is sufficient to withdraw
        if (balance >= amount){
        balance -= amount;
        System.out.println("Withdraw P" +amount+ " from Savings Account");
        }
        else{
            System.out.println("The balance is insufficient to withdraw from  Savings Account");
        }
    }

 // Computing the Interest applying in Savings Account method and return value
    public double calculateInterest(){  
        balance += balance * (InterestRate/100);
        return balance;
    }


//  getting balance method that allow us  to view Balances of Savings and Current Accounts
    public double get_balance(){  
        return balance;
    }  
    
// Print Initial Deposit and Interset rate value added in Bank System
     public void displaySavings(){
        System.out.println("\nSavings Account:");
        System.out.println("Initial Deposit: P" + balance);
        System.out.println("Interest Rate  : " + InterestRate+ "%");
   }

}
