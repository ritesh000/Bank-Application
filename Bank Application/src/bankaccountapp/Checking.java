package bankaccountapp;

public class Checking extends Account {
	// list properties specifies to check account
	int debitCardNumber;
	int debitCardPIN;

	// construct to set base properties and initializes the account
	public Checking(String name, String sSn, double initdeposit) {
		super(name, sSn, initdeposit);
		accountNumber = "2" + accountNumber;
		/*
		 * System.out.println("Account Number " + this.accountNumber);
		 * System.out.println("NEW CHECKING ACCOUNT");
		 */
		setDebitCard();
	}

	public void setRate() {
		rate = getBaseRate() * .15;

	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

	}

	// list any method specifies to the check account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Account features " + "\nDebit Card : " + debitCardNumber + "\nDebit PIN : " + debitCardPIN);
	}
}
