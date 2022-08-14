package polymorphsim;

class Calculator1{
	int a;
	int b;
	public Calculator1() {
		System.out.println("object initilized with default values");
		a=10;
		a=12;
	}
	public Calculator1(int a,int b) {
		System.out.println("obkect initilized wuth custom values");
		this.a=a;
		this.b=b;
	}
}
public class OverloadingConstructors {
	public static void main(String args[]) {
		Calculator1 c= new Calculator1();
		Calculator1 c2= new Calculator1(10,20);
	}
}
//