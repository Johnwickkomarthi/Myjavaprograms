package geeksforgeeks;
import java.util.*;
import java.io.*;
import java.lang.*;

public class KadanesAlogorithm {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for (int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			System.out.println(new Solution().smallestSumSubarray(arr,n));
		}
		
	}
	

}
class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {int sum=0;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<size;i++)
        {
            sum+=a[i];
            if (sum<min)
            {
                min=sum;
            }
            if (sum>0)
            {
                sum=0;
            }
            
        }
        return min;
    }
}


//QUESTION
/*Given an array arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the minimum sum and return its sum.*/

/*Example 1:

Input: 
arr[] = {3,-4, 2,-3,-1, 7,-5}
Output: -6
Explanation: sub-array which has smallest 
sum among all the sub-array is {-4,2,-3,-1} = -6*/

/*Example 2:

Input:
arr[] = {2, 6, 8, 1, 4}
Output: 1
Explanation: sub-array which has smallest
sum among all the sub-array is {1} = 1

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/






/*Kaden's Algorithms is used for max sum but here we used it for the min-sum so it's just the opposite of Kaden's Algorithm.
-> Take a variable sumTill and maintain the minimum value of sum so far if sumTill is greater than the zero
then set back it to zero and if it is less than the answer then update the answer*/