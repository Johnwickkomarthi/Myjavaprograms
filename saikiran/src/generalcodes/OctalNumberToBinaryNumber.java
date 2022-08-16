package generalcodes;
import java.util.*;
import java.lang.*;

public class OctalNumberToBinaryNumber {

	public static void main(String[] args) {
		int decimalnumber=0,i=0,octalNumber=67;
		long binary=0;
		
		while(octalNumber!=0)
		{
			int rem=octalNumber%10;
			decimalnumber=decimalnumber+rem*(int) Math.pow(8,i);
			i++;
			octalNumber=octalNumber/10;
		}
		i=1;
		while(decimalnumber!=0)
		{
			int rem=decimalnumber%2;
			binary=binary+rem*i;
			i=i*10;
			decimalnumber/=2;
		}
		System.out.println(binary);
	}

}
