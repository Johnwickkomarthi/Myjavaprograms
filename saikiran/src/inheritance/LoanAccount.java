package inheritance;

public class LoanAccount extends Account{
private double loanAmount;
public void payEMI(double amt) {
	loanAmount = loanAmount-amt;
	
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}

}
