package generalcodes;
import java.util.*;
import java.lang.*;

public class BinayToDecimal {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int binary=input.nextInt();
	int i=0;
	int dec=0;
	while (binary>0)
	{
		int lastdigit=binary%10;
		dec=dec+lastdigit* (int) Math.pow(2, i);
		i++;
		binary/=10;
		
	}
	System.out.println(dec);
	}

}
