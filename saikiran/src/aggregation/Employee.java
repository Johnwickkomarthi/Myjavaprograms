package aggregation;

public class Employee {
private int employeeId;
private String empolyeeName;
private Address employeeAddress;
public Employee (int employeeId,String empolyeeName,Address employeeAddress)
{
	this.employeeId=employeeId;
	this.empolyeeName=empolyeeName;
	this.employeeAddress=employeeAddress;
	
}
public void printEmpolyeeDetails()
{
	System.out.println("EmpoyeeId: "+employeeId);
	System.out.println("Empolyee name: "+empolyeeName);
	System.out.println("city :"+employeeAddress.getCity());
	System.out.println("zip code :"+employeeAddress.getZipcode());
	System.out.println("Address line:"+employeeAddress.getAddressLine());
	
}
}
// this is strong relation where one class is having the referance of other class as instance variable it is also called as AGGREGATION