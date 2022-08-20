package staticUsage;

public class Testerr {

	public static void main(String[] args) {
		Student student1 =new Student();
		System.out.println("counter after student1:"+student1.getCount());//output is 1 without static
		Student student2 =new Student();
		System.out.println("counter after student1:"+student2.getCount());//output is 1 without static
		Student student3=new Student();
		System.out.println("counter after student1:"+student3.getCount());//output is 1 without static


	}

}
//need not to create object to invoke static method
// static methods can be invoked by using the name of the class or class reference
//static methods can access only static variables
//non static methods can access both static and non static variables
// in the static block we can perfome logic like if else switch etc so the value can be fixed