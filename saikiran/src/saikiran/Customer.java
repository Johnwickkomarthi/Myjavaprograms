package saikiran;

public class Customer {
private String customerName;
private String phoneNUmber;
public void payBill(double bill)
{
	BillpaymentUtlity billpaymentutlity = new BillpaymentUtlity();
	billpaymentutlity.payBill(bill);
}
public Customer (String customerName,String phoneNUmber)
{
	this.customerName=customerName;
	this.phoneNUmber=phoneNUmber;
}

public static  void main(String []args)
{
	Customer customer = new Customer("scoot", "1344516565");
	customer.payBill(1200);
}
}
//this is weak relation, where one class creates the method and invokes the methods of the other class,it is alo called as ASSOCIATION.