package aaaaaa;

import java.util.*; 
class GFG
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int a=input.nextInt();
		
		System.out.println(power(a));
	}
	public static int power(int a) {
		int n=0,m=a,product=1;// here i'm storing the value of a in m so i can use it to count the digits in the m.
		while(m!=0) {
			m/=10;
			n++;
		}
		for (int i=1;i<=n;i++) {
			product*=a;
		}
		return product;
	}
}
	

	

	




	