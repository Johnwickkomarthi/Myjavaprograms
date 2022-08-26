package hustle;
import java.util.*;
public class LargestPossiblePrimeNumber {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		    String n=input.nextLine();
		    int[] arr=new int[n.length()];
		    int num=Integer.parseInt(n);
		    long []primearr=new long [n.length()];
		    int i=n.length()-1;
		    while(i>=0)
		    {
		      arr[i]=num%10;
		      num=num/10;
		      i--;
		    }
		    Arrays.sort(arr);
		    primearr[0]=arrtoint(arr);
		    int p=1;
		    while(p<n.length())
		    {int last = arr[0];
            for (int a = 0; a < n.length() - 1; a++) {
                arr[a] = arr[a + 1];
                
            }
            arr[n.length() - 1] = last;
            primearr[p]=arrtoint(arr);
		    p++;
		    }
		    boolean prime = false;
		    for (int j=n.length()-1;j>=0;j--)
		    {System.out.println(primearr[j]+"each combination");
		    if(checkprime(primearr[j]))
		    {
		    	
		    	System.out.println(primearr[j]);
		    	prime=true;
		    	//break;
		    }
		    
		    }
		    if (prime=false)
		    {
		    	System.out.print(-1);
		    }
		    
	}
	public static boolean checkprime(long primearr)
	{
	  int count=0;
	  for (int i=2;i<=primearr/2;i++)
	  {
	    if (primearr%i==0)
	    {
	      count++;
	    }
	    
	  }
	  if (count==0)
	  return true;
	  else 
	  return false;
	}
	
	
	
	public static long arrtoint(int [] arr)
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