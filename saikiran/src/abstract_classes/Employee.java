package abstract_classes;

public abstract class Employee {
	
		private int employeeNumber;
		private String name;
		private String departmentName;
		
		public void displayDetails()
		{
			System.out.println("name: "+name);
			System.out.println("employee number:"+employeeNumber);
			System.out.println("department name:"+departmentName);
		}
			public abstract void computeTotalSalary();// this is an empty class this is called abstarct class.re
			
			
			public int getEmployeeNumber() {
				return employeeNumber;
			}
			public void setEmployeeNumber(int employeeNumber) {
				this.employeeNumber = employeeNumber;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDepartmentName() {
				return departmentName;
			}
			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}
			
		
}
// we cannot create new object for the abstract cllasses