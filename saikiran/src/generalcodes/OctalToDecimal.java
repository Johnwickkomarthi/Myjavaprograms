package generalcodes;

public class OctalToDecimal {

	public static void main(String[] args) {
		int octalNumber=167;
		int decimalNumber=0;
		
		int power=0;
		while(octalNumber>0)
		{
			int rem=octalNumber%10;
			decimalNumber=decimalNumber+rem*(int) Math.pow(8, power);
			power++;
			octalNumber/=10;
		}
		
		System.out.println(decimalNumber);
	}

}
