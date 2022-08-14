package abstract_classes;

public class ContractEmployee extends Employee {
	private int numberOfHoursWorked;
	private int amountPerHour;
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	public int getAmountPerHour() {
		return amountPerHour;
	}
	public void setAmountPerHour(int amountPerHour) {
		this.amountPerHour = amountPerHour;
	}
	public void computeTotalSalary() {
		System.out.println("contract empolyee salary is:"+""+(numberOfHoursWorked*amountPerHour));
	}

}
