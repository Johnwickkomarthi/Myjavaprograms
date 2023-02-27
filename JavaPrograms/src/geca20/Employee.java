package geca20;

public class Employee {
	String name;
	String job;
	private double sal;
	public Employee(String name, String job, double sal) {
		super();
		
		this.name = name;
		this.job = job;
		if (sal>=10000.0) {
		this.sal = sal;
		}
		else
			throw new SalaryIncorrectException();
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		if (sal>=10000.0) {
		this.sal = sal;
		}
		else
			throw new SalaryIncorrectException();
	}
	
	
}
