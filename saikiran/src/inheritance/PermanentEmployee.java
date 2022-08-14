package inheritance;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
		public PermanentEmployee (double basicPay,double hra,int experience)
		{
			this.basicPay=basicPay;
			this.experience=experience;
			this.hra=hra;
			
			
		}
	public void calculateSalary() {
		Employee employee= new Employee();
		double variablepay=0;
		if (experience<3)
			variablepay=0;
		else if(experience>=3 && experience<5)
			variablepay=0.05*basicPay;
		else if (experience>=5 && experience<10)
			variablepay=0.07*basicPay;
		else if (experience>=10)
			variablepay=0.12*basicPay;
		
		employee.setSalary(basicPay+hra+variablepay);		
		System.out.println("Permanent Employee : Your salary is :"+employee.getSalary());
	}
	

}
