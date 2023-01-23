package aaaaaa;
import java.util.*;
public class Box {

	public static void main (String []args) {
		String str="abxxzyxxxmnxxxxxlxxxmxxx";
		int count=0;
		int count2=0;
		for(int i=0;i<str.length();i++) {
		
			
		}
		
		System.out.println((count2));
		
		for (int i=0;i<str.length()-2;i++){
			if (str.substring(i, i+2).equals("xx"))
				count++;
		}
		System.out.println(count);
	}
}
