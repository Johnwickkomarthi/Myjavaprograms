package inheritance;

public class Tester {

	public static void main(String[] args) {
		LoanAccount loanAccount = new LoanAccount();
		loanAccount.setAccountNumber(1022);
		loanAccount.setBalance(2000.2);
		loanAccount.setCustomerName("james");
		loanAccount.setLoanAmount(2000);
		
		loanAccount.displayAccountDetails();
		System.out.println();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountNumber(1001);
		savingsAccount.setBalance(10000.0);
		savingsAccount.setCustomerName("JAck");
		savingsAccount.setMinimumbalance(20.2);
		
		savingsAccount.displayAccountDetails();

	}

}
