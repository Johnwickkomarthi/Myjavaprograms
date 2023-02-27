package geca20;

public class Customer {
	int cID;
	String cName;
	double bill;
	public Customer(int cID, String cName, double bill) {
		this.cID = cID;
		this.cName = cName;
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [cID=" + cID + ", cName=" + cName + ", bill=" + bill + "]";
	}
	
	
	
}
