package bankaccountapp;

public abstract class Account implements IBaseRate {
	// list common properties for saving and checking account
	private String name;
	private String sSn;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// constructor to set base properties and initialize the account
	public Account(String name, String sSn, double initdeposit) {
		this.name = name;
		this.sSn = sSn;
		balance = initdeposit;
		// System.out.println("Name : " + name + " SSN: " + sSn + " balance:" +
		// initdeposit);
		// set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}

	public void compound() {
		double accruedInterest = balance * (rate / 100);
		System.out.println("Acceured interest : $" + accruedInterest);
		printBalance();
	}

	// list comman method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit :$" + amount);
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw :$" + amount);
	}

	public void transfer(String towhere, double amount) {
		balance = balance - amount;
		System.out.println("transfer :$" + amount + " to " + towhere);
	}

	public void printBalance() {
		System.out.println("your balanceis now :$ " + balance);
	}

	public void showInfo() {
		System.out.println("Name : " + name + "\nAccount Num: " + accountNumber + "\nbalance:" + balance + "\n Rate : "
				+ rate + "%");

	}
}
