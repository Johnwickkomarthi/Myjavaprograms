package saikiran;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
	
	Student s1= new Student();
	Scanner input = new Scanner(System.in);
	int id=input.nextInt();
	char gen=input.next().charAt(0);
	double feez=input.nextDouble();
	s1.setStudentID(id);
	s1.setGender(gen);
	s1.setFee(feez);
	System.out.println(s1.getStudentID());
	
}
}
