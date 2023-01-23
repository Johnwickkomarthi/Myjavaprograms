package aaaaaa;

public class Tester {

	public static void main(String[] args) {
		System.out.println(product(5));
	}
	public static int product(int n) {
		if(n==0)
			return 1;
		return product(n-1)*n;
	}
}
