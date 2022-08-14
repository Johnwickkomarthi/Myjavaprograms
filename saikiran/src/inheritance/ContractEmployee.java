package inheritance;

public class ContractEmployee extends Employee{
private double wages;
private int hours;
public double getWages() {
	return wages;
}
public void setWages(double wages) {
	this.wages = wages;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public ContractEmployee(double wages,int hours) {
	this.hours=hours;
	this.wages=wages;
	
}

public void calculateSalary() {
	Employee employee= new Employee();
	
	employee.setSalary(hours*wages);
	System.out.println("Contract Employee : Your salary is :"+employee.getSalary());
}
}
