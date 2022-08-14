package abstract_classes;

public class PermanentEmployee extends Employee{// needs to implement al the methods in the abstract class or
												// declare the current class as abstract class
private double basicSalary;
private double allowance;
public double getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
public double getAllowance() {
	return allowance;
}
public void setAllowance(double allowance) {
	this.allowance = allowance;
}

	 public void computeTotalSalary() {
		 System.out.println("permant employee, salary is:"+(basicSalary+allowance));
	 }
}
