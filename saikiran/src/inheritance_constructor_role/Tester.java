package inheritance_constructor_role;



class Account {
	private String customerName;
	private long accountNumber;
	private double balance;
	
	public Account() {
		balance =1000;
		System.out.println("default consructor of account class is invoked");
	}
	public void displayAccountDetails() {
		System.out.println("Customer name is: "+customerName);
		System.out.println("account number is "+accountNumber);
		System.out.println("balance is: "+balance);
	}
}
class LoanAccount extends Account{
private double loanAmount;

public LoanAccount() {
	System.out.println("default consructor of loanAccount class is invoked");
}
public void payEMI(double amt) {
	loanAmount = loanAmount-amt;
}
}

public class Tester {

	public static void main(String[] args) {
		LoanAccount loanAccount = new LoanAccount();

	}

}
//default consructor of account class is invoked
//default consructor of loanAccount class is invoked
// bcz the the child class constructor calls the parent constructor impilsitly



