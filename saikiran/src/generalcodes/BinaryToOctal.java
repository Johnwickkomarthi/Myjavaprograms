package generalcodes;

public class BinaryToOctal {

	public static void main(String[] args) {
		int octal=0;
		int binary=11110,power=0,decimal=0;
		while (binary>0)
		{
			int rem=binary%10;
			decimal=decimal+rem*(int) Math.pow(2,power);
			power++;
			binary/=10;
		}
		power=0;
		while (decimal>0)
		{
			int rem=decimal%8;
			octal=octal+rem*(int) Math.pow(10,power);
			power++;
			decimal/=8;
		}
		System.out.println(octal);
	}

}
