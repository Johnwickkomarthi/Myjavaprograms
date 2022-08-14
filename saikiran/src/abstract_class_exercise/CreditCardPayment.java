package abstract_class_exercise;

public class CreditCardPayment extends RRPaymentServices {
	public CreditCardPayment(double balance, int customerId) {
		super(balance, customerId);
	}

	private int counter;
	private String paymentID;
	private double cashBack;
	private double balanceDue;
	
	
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
	public double getCashBack() {
		return cashBack;
	}
	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
	
	public void payBill(double amount)
	{
		
	}
	
	
	
}
