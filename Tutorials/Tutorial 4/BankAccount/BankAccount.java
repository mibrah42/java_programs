public class BankAccount {
    private double account = 0;
    
    public BankAccount(){
    }

    public BankAccount(double initialAmount){
        // add initial amount to local variable
        account += initialAmount;
    }
    public void withdraw(double amount){
        
        if(checkAmount(amount)){
            // withdraw from account
            account -= amount;
            System.out.println("Account remaining: " + getBalance());
        }
        else{
            System.out.println("I'm sorry, you do not have enough funds.");
        }
    }
    private boolean checkAmount(double withdrawAmount){
        // write check to see if bank account can withdraw 
        if(withdrawAmount > account){
            return false;
        } else {
            return true;
        }
    }
    public void deposit(double amount){
        // write adition of amount to internal amount
        account += amount;
    }
    public double getBalance(){
        // return the local amount
        return account;
    }
    public static void main(String[] args){
        // create empty account
        BankAccount mohamed = new BankAccount();
        System.out.println("Value of blank bank account: " + mohamed.getBalance());
        // create account with 25 as starting amount
        BankAccount sachin = new BankAccount(25);
        System.out.println("Value of existing bank account: " + sachin.getBalance());
        // attempt withdrawal of 5 from first account here
        mohamed.withdraw(5);
	// attempt withdrawal of 5 from second account here
        sachin.withdraw(5);
    }
}