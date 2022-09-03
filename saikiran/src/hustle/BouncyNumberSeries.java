package hustle;
import java.util.Scanner;
public class BouncyNumberSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long num=input.nextLong();
		int x=100;
		
		while(x<=num)
		{
			String str=String.valueOf(x);
			int arr[]= new int [str.length()];
			
			
		}
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



/*Bouncy number is a positive integer which has its digits un-ordered. 14752 is a bouncy number where 95321 is not a bouncy number. 

Given a positive number N, write a program to print the total number of bouncy numbers that exists from 0 to N (including N).

Input and Output Format :

Read the number from standard input stream and print the output to the standard output.*/

/* sample input
 * 110
 * 
 * expected 
 * 9
 * 
 * explanation
 * Bouncy Numbers are 101,102,103…109
 * */
/*sample input 
 * 121
 *  expected output 
 *  11
 *  
 *  explanation
 *  Bouncy Numbers are 101,102,103…109 and 120,121
 */ 
 