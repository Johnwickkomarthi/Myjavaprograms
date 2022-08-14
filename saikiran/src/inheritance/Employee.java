package inheritance;

class Employee {
	private int empId;
	private String name;
	private double salary;
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public static void main(String[] args) {
		PermanentEmployee pe1= new PermanentEmployee(10000,1500,6);
		pe1.calculateSalary();
		System.out.println();
		ContractEmployee pe = new ContractEmployee(500,10);
		pe.calculateSalary();
	}
	

}

