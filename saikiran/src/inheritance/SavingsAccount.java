package inheritance;

public class SavingsAccount extends Account{
	
	
private double minimumbalance;

public void credit(double bal) {
	minimumbalance=minimumbalance+bal;
}
public void debit (double bal)
{
	minimumbalance=minimumbalance-bal;
}
public double getMinimumbalance() {
	return minimumbalance;
}
public void setMinimumbalance(double minimumbalance) {
	this.minimumbalance = minimumbalance;
}

}
