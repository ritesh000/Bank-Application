package bankaccountapp;

public class Savings extends Account {
	// List properties specific to the saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;

	// constructor to initialize sitting for saving properties
	public Savings(String name, String sSn, double initdeposit) {
		super(name, sSn, initdeposit);
		accountNumber = "1" + accountNumber;
		// System.out.println("Account Number " + this.accountNumber);
		// System.out.println("New Saving Account");
		setSafeytyDepositbox();
	}

	public void setRate() {
		rate = getBaseRate() - .25;

	}

	private void setSafeytyDepositbox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list any method specific to saving account
	public void showInfo() {

		System.out.println("Account type : Saving");
		super.showInfo();
		System.out.println("your saving Account Features " + "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\nSafety Deposit BoxKey :" + safetyDepositBoxKey);
	}

}
