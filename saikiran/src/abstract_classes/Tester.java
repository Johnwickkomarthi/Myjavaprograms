package abstract_classes;

public class Tester {

	public static void main(String[] args) {
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setAllowance(100);
		permanentEmployee.setBasicSalary(12000);
		permanentEmployee.computeTotalSalary();
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setAmountPerHour(100);
		contractEmployee.setNumberOfHoursWorked(12);
		contractEmployee.computeTotalSalary();

	}

}
// abstarct classes can exploit the overriding 
/*these cannot do abstarct usage like constrcutor, fianl methods, static methods, private methods */
