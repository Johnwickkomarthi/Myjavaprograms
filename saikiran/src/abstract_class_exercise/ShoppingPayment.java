package abstract_class_exercise;

public class ShoppingPayment extends RRPaymentServices{

public ShoppingPayment(double balance, int customerId) {
		super(balance, customerId);
		
	}


private int counter;
private String paymentID;
public int getCounter() {
	return counter;
}
public void setCounter(int counter) {
	this.counter = counter;
}
public String getPaymentID() {
	return paymentID;
}
public void setPaymentID(String paymentID) {
	this.paymentID = paymentID;
	
}


public void payBill(double amount)
{
	paymentID="S1001";
	
	if (amount==getBalance())
	{
		System.out.println("Congratulations! Your payment of"+amount+"is successful with payment Id"+paymentID);
	}
	else if (amount>getBalance())
		System.out.println("Insufficient amount. Please try again.");
	else if (amount<getBalance())
		System.out.println("Entered excess amount. Please try again.");
}
	

}
