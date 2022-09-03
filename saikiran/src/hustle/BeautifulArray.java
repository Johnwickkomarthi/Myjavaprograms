package hustle;
import java.util.Arrays;
import java.util.Scanner;
public class BeautifulArray {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		  int n= input.nextInt();
		  int l=input.nextInt();
		  int arr[]= new int[l];
		  int sortarray[]= new int[l];
		  for (int i=0; i<l;i++)
		  {
		    arr[i]=input.nextInt();
		    sortarray[i]=arr[i];
		    
		  }
		  Arrays.sort(sortarray);
		  int count=0,count2=0;
		  boolean condition =true;
		  for (int i=0;i<l;i++)
		  {
			  if (sortarray[i]==arr[i])
			  {
				  count++;
			  }
			  
			  for (int j=i+1;j<l-1;j++)
			  {
				  if (arr[i]==arr[j])
				  {
					  count2++;
				  }
			  }
		  }
		  
		 
			
			  for (int i=0;i<l;i++)
			  { if(l>1)
			  {
				  if (count==l || count2>=1) 
			 
				  { 
					  
					  condition =false; 
					  break;
				  }
			  }
			  if (1>=arr[i] && arr[i]>=n) 
			  { 
				  
				  condition =false; 
				  break;
			  }
			  
			 }
			 
		  if (condition && l>0)
			  System.out.print("True");
			  else
			  System.out.print("False");
		
		

	}

}






/*Given an array of L integers and a number N, write a program to check whether the array is beautiful or not. An array is said to be beautiful if it satisfies the following conditions:

All elements of array must lie between 1 and N (inclusive of 1 and N).
Array must be unordered
The array elements are unique.
Print True if array is beautiful, False otherwise..

Input Format

First line of input contains N.

Second line of input contains L.

Third line of input contains L elements of array separated by spaces. Read the input from standard input.

Constraints

0 < N < 10000.
0 < L < 10000.
Output Format

Print True, if array is beautiful, False otherwise. Print the output to standard output*/

/* sample input
 * 5
 * 4
 * 1 2 3 4 
 * expected output
 * False
 *
 *
 *
 *
 *sample input 
 *8
 *5
 *4 7 2 5 6
 * expected output
 * True
 * 
 */


