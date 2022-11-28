package practice_level1;

import java.util.*;

public class StringQNethaji {
	public static void main (String [] args)
	{
		 StringBuilder s= new StringBuilder("abcdeabfabcd");
		 String a= new String("ab");
		 String b= new String("cd");
		 String c= new String("e");
		 
		 StringQNethaji obj= new StringQNethaji();
		 while(s.length()!=0) {
			 int l=obj.indexOfString(a,s);
			 int m=obj.indexOfString(b, s);
			 int n=obj.indexOfString(c, s);
			 if (l==-1 && m==-1 && n==-1)
					 break;
			 /** for delete method you need both start and end index so I add length to index value which is returned from IndexOfString method
			 */
			 if(l>-1)
			 s.delete(l, l+a.length());
			 
			 else if(m>-1)
			 s.delete(m, m+b.length());
			 else if(n>-1)
			 s.delete(n, n+c.length());
		 }
		 
		System.out.println(s.length());
	}
	// created a method to get the index of either a,b,c strings given in the input 
	//it will return -1 if the string is not found in the main string
	int indexOfString(String a,StringBuilder s) {
		int idx=-1;
		idx=s.indexOf(a);
		return idx;
	}
}
/**
delete the a,b,c strigs from the main string and print the least possible length from the remining string 
*/