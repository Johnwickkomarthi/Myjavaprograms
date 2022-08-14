package inheritance;

public class Account {
private String customerName;
private long accountNumber;
private double balance;
public void displayAccountDetails() {
	System.out.println("Customer name is: "+customerName);
	System.out.println("account number is "+accountNumber);
	System.out.println("balance is: "+balance);
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
