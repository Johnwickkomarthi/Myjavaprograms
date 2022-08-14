package inheritance_constructor_role;


class Accounts {
	private String customerName;
	private long accountNumber;
	private double balance;
	
	public Accounts(String customerName, long accountNumber, double balance) {
		
		System.out.println("default consructor of account class is invoked");
		this.customerName=customerName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void displayAccountDetails() {
		System.out.println("Customer name is: "+customerName);
		System.out.println("account number is "+accountNumber);
		System.out.println("balance is: "+balance);
	}
}
class LoanAccounts extends Accounts{
private double loanAmount;

public LoanAccounts (double loanAmount) {
	super("",0,0);
	System.out.println("default consructor of loanAccount class is invoked");
	this.loanAmount=loanAmount;
}
public void payEMI(double amt) {
	loanAmount = loanAmount-amt;
}
}


public class Tester2 {

	public static void main(String[] args) {
		LoanAccounts loanAccount = new LoanAccounts(1202.0);
		System.out.println("");
		loanAccount.displayAccountDetails();
		

	}

}
//child class's default and parameterised constructor implicitly invokes parent class's default constructor
//if the parent class is having just a parameterised constructor then, from child class's constructr explicitly invoke the parent class's constructor using super() with parameters,
//super() should be the first statement in the constructor