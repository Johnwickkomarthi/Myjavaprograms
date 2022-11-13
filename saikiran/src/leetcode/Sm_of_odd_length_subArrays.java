package leetcode;
import java.util.*;
public class Sm_of_odd_length_subArrays {

	public static void main(String[] args) {
		Sm_of_odd_length_subArrays_Solution1 obj =new Sm_of_odd_length_subArrays_Solution1();
		int arr[]= {1,4,2,5,3};
		System.out.println(obj.sumOddLengthSubarrays(arr));

	}

}
class Sm_of_odd_length_subArrays_Solution1 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
    	
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i;j<arr.length;j++) {

    			
    			for(int k=i;k<=j;k++)
    			{
    				if(Arrays.copyOfRange(arr, i, j).length%2==0)
    				{
    					sum+=arr[k];
    				
    				System.out.print(arr[k]+" ");
    				}
    			}
    			System.out.println();
    		}
    	}
    	
    	return sum;
    }
}

class Sm_of_odd_length_subArrays_Solution2 {
	public int sumOddLengthSubarrays(int[] arr) {
	int sum = 0;
     for (int i = 0; i < arr.length; i++)
         sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
     return sum;
}
}
/**
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
Example 3:

Input: arr = [10,11,12]
Output: 66
 

Constraints:

1 <= arr.length <= 100
1 <= arr[i] <= 1000
*/