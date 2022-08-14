package polymorphsim;

public class Calculator {
public void divide(int a, double b)
{
	System.out.println("Division a/b is:"+a/b);
}
public void divide(double a, int b)
{
	System.out.println("Division a/b is:"+a/b);
}

	public static void main(String[] args) {
		Calculator c= new Calculator();
		//case1
		c.divide(10,2.0);
		//case2
		c.divide(10.0, 2);
		//case3
		c.divide(10,2); //c.divide((double)10,2); if we use this there is no error.
	}

}
// this is overloading methods
// this is also called compile time binding or static polymorhisim.