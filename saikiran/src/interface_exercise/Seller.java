package interface_exercise;

public class Seller implements Tax{

	private String location;
	private double taxPercentage;
	Seller(String location){
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price){
		if(getLocation().equals("Canada")) {
			setTaxPercentage(22.0);
			return 22.0;
		}
		else if(getLocation().equals("Europe")) {
			setTaxPercentage(25.0);
			return 25.0;
		}
		else if(getLocation().equals("Japan")) {
			setTaxPercentage(12.0);
			return 12.0;
		}
		else {
			setTaxPercentage(15.0);
			return 15.0;
		}
	}
}
