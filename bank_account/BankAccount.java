public class BankAccount{

	private double balance;


	public BankAccount(){
		balance = 0.0;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}

	public void deposit(double amount){
		this.balance += amount;
	}

	public void withdraw(double amount){
		this.balance -= amount;
	}


	public static void main(String[] args) {
		BankAccount mike = new BankAccount();
		System.out.println(mike.getBalance());
		BankAccount sarah = new BankAccount(100.0);
		sarah.deposit(25.0);
		sarah.withdraw(12.0);
		System.out.println(sarah.getBalance());
		BankAccount emily = sarah;
		System.out.println(emily.getBalance());
	}


	// private double balance;

	// public void deposit(double amount){
	// 	balance += amount;
	// }

	// public void withdraw(double amount){
	// 	balance -= amount;
	// }

	// public double getBalance(){
	// 	return balance;
	// }
}

