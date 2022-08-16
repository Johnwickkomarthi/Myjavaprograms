package generalcodes;

public class DecimalToOctal {

	public static void main(String[] args) {
		int decimalNumber=167;
		int octal=0;
		int power=0;
		while(decimalNumber>0)
		{
			int rem=decimalNumber%8;
			octal=octal+rem*(int) Math.pow(10,power);
			power++;
			decimalNumber/=8;
		}
		System.out.println(octal);
	}

}
