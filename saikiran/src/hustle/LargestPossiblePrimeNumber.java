package hustle;
import java.util.*;
public class LargestPossiblePrimeNumber {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		    String n=input.nextLine();
		    int[] arr=new int[n.length()];
		    int num=Integer.parseInt(n);
		    int i=n.length()-1;
		    while(i>=0)
		    {
		      arr[i]=num%10;
		      num=num/10;
		      i--;
		    }
		    Arrays.sort(arr);
		    int temp=arrtoint(arr);
		    
		    if(checkprime(temp))
		    {
		    	System.out.println(temp);
		    }
		    
		    
	}
	public static boolean checkprime(int n)
	{
	  int count=0;
	  for (int i=1;i<=n;i++)
	  {
	    if (n%i==0)
	    {
	      count++;
	    }
	    
	  }
	  if (count==2)
	  return true;
	  else 
	  return false;
	}
	
	
	
	public static int arrtoint(int [] arr)
	{
		int num=0;
		for (int i=0;i<arr.length;i++)
		{
			num=num*10+arr[i];
		}
		return num;
	}
	}


/*Given a positive integer N having D digits, write a program to print the largest possible prime number which can be formed by using the same set of digits as N. Print -1 if it is not possible to form a prime number.

Input Format

A single line containing the positive integer N. Read the input from standard input

Constraints

N >0
Output Format

Print the largest possible prime number. Print -1 if prime number cannot be formed. Print the output to standard output stream*/
//sample input = 7259
//sample output=9257