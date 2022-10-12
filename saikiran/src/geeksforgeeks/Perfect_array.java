package geeksforgeeks;
import java.io.*;
import java.util.*;

public class Perfect_array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases= Integer.parseInt(br.readLine());
		while (testcases-- >0)
		{
			int n=Integer.parseInt(br.readLine());
			int arr[]= new int [n];
			
			String line=br.readLine();
			String [] elements= line.trim().split(" ");
			
			for (int index=0;index<n;index++)
			{
				arr[index]=Integer.parseInt(elements[index]);
			}
			Perfect obj = new Perfect();
			if (obj.IsPerfect(arr,n))
				System.out.println("PERFECT");
			else
				System.out.println("NOT PERFECT");
		}

	}

}

class Perfect {
	public boolean IsPerfect(int a[],int n)
	{
		boolean cond=false;
		for (int i=0;i<n/2;i++)
		{
			if (a[i]==a[n-i-1] && n>1)
				cond=true;
			else if (n==1)
				return true;
			else
				return false;
		}
		return cond;
	}
	
}


// another solution
class Perfect2{
    
    public boolean IsPerfect(int a[], int n)
    {
        for(int i=0; i<n; i++){
            if(a[i]!= a[n-1-i]   )
                return false;}
                
                return true;
    }
    
}
/*Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".*/
/*
 * Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.

*
*
*Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT
*/

