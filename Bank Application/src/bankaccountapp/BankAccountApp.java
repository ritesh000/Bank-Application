package bankaccountapp;
import java.util.*;
import java.util.LinkedList;
public class BankAccountApp {

	public static void main(String[] args) {
		String file="H:\\myworkspace\\NewBankAccounts.csv";
		/*Checking chkac1 = new Checking("tom wilson", "321456879", 1500);
		Savings savacc1 = new Savings("rich love", "123456789", 2500);*/
		/*savacc1.showInfo();
		System.out.println("************************");
		chkac1.showInfo();
		//savacc1.deposit(5000);
		//savacc1.withdraw(200);
		//savacc1.transfer("Brokerage", 3000);
		savacc1.compound();*/
		
		List<Account>accounts=new LinkedList<Account>();
		// Read a csv file created new account base on the data
       List<String[]>newAccountHolders=utilties.CSV.read(file);
       for(String [] accountHolder: newAccountHolders){
    	   String name =accountHolder[0];
    	   String sSn=accountHolder[1];
    	   String accountType=accountHolder[2];
    	    double initDeposit=Double.parseDouble(accountHolder[3]);
              if(accountType.equals("Savings")){
    	    	accounts.add(new Savings(name,sSn,initDeposit));
    	    }else if(accountType.equals("Checking")){    	    	
    	    	accounts.add(new Checking(name,sSn,initDeposit));
    	    }else
    	    {
    	    	System.out.println("Error Reading Account Type");	
    	    }
       }
	for(Account acc:accounts){
		System.out.println("******************************************");
			acc.showInfo();
		}
		
	}

}
// System.out.println("name :"+name+"SSN: "+sSn+"  Account Type:"+accountType+"  Init Deposit:$"+initDeposit);
//	System.out.println("OPEN A Saving Account");
////System.out.println("OPEN A Checking Accountg");