package interface_exercise;

public class PurchaseDetails implements Tax{
	private String purchaseID;
	private String paymentType;
	private double taxPercentage;
	PurchaseDetails(String purchaseID,String paymentType){
		this.purchaseID=purchaseID;
		this.paymentType=paymentType;
	}
	
	public String getPurchaseID() {
		return purchaseID;
	}
	public void setPurchaseID(String purchaseID) {
		this.purchaseID = purchaseID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		if(getPaymentType().equals("Debit Card")) {
			setTaxPercentage(2.0);
			return price*1.02;
		}
		else if(getPaymentType().equals("Credit Card")) {
			setTaxPercentage(3.0);
			return price*1.03;
		}
		else {
			setTaxPercentage(4.0);
			return price*1.04;
		}
	}
}
