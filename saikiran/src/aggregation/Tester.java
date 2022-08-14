package aggregation;

public class Tester {

	public static void main(String[] args) {
		Address employeeAddres = new Address();
		employeeAddres.setAddressLine("kfsfsfkv");
		employeeAddres.setCity("komarthi");
		employeeAddres.setZipcode("5342");
		
		Employee employee = new Employee(101, "jack",employeeAddres);
		employee.printEmpolyeeDetails();

	}

}
// this is HAS-A relation