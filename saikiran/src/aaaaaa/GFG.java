package aaaaaa;

import java.util.*;


class GFG
{
	public static void main (String[] args)
	{
		int n=100,first=0,second=1,nextTerm=0;
		System.out.print(first+" ");
		System.out.print(second+" ");
		while(true) {
			nextTerm=first+second;
			if(nextTerm>n)
				break;
			System.out.print(nextTerm+" ");
			first=second;
			second=nextTerm;
			
		}
	}
	

}


	