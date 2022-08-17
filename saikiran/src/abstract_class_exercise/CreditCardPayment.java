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
		paymentID="C1001";
		if (amount==getBalance())
		{
			System.out.println("Customer ID			:"+getCustomerId());
			System.out.println("Payment ID			:"+paymentID);
			System.out.println("Previous due		:"+getBalance());
			System.out.println("REmaining due		:0");
			System.out.println("Cash back wallet balance:0");
		}
		else if (amount>getBalance())
		{
			System.out.println("Customer ID			:"+getCustomerId());
			System.out.println("Payment ID			:"+paymentID);
			System.out.println("Previous due		:"+getBalance());
			System.out.println("REmaining due		:0");
			System.out.println("Cash back wallet balance:"+(amount-getBalance()));
		}
		else
		{
			System.out.println("Customer ID			:"+getCustomerId());
			System.out.println("Payment ID			:"+paymentID);
			System.out.println("Previous due		:"+getBalance());
			System.out.println("REmaining due		:"+(getBalance()-amount));
			System.out.println("Cash back wallet balance:0");
		}
	}
	
	
	
}
