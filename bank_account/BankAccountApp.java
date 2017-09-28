public class BankAccountApp {

	public static void main(String[] args) {
			BankAccount mohamedChecking = new BankAccount();
			System.out.println(mohamedChecking.getBalance());
			mohamedChecking.deposit(500);
			System.out.println(mohamedChecking.getBalance());
			mohamedChecking.withdraw(200);
			System.out.println(mohamedChecking.getBalance());
	}
	
}

