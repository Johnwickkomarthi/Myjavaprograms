package interface_keyword;

public class Tester2 {

	public static void main(String[] args) {
		DataProvider student1=new Trainee(6000);
		student1.calcPercentage();
		DataProvider student2= new Intern(8000,500);
		student2.calcPercentage();
		

	}

}
