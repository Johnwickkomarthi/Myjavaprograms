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
	
}
	

}
