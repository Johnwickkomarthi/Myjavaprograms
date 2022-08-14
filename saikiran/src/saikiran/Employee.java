package saikiran;

public class Employee {
	private String name;
	private int empId;
	private String city;

	Employee() {
		this.city = "New York";
	}

	Employee(String name, int empId) {
		this();								// here i have doubt there is no city in the given constructor but city is printed after calling the employee1 object
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee("John", 101);
		Employee employee2 = new Employee();

		System.out.println(employee1.name + " " + employee1.empId + " "
				+ employee1.city);
		System.out.println(employee2.name + " " + employee2.empId + " "
				+ employee2.city);
	}
}
 // this is a quiz question the constructor overloading 