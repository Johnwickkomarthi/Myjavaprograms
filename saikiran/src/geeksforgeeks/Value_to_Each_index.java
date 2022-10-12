package geeksforgeeks;
import java.util.*;
import java.io.*;
public class Value_to_Each_index {

	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc =Integer.parseInt(br.readLine().trim());
		while(tc-- >0)
		{
			String [] inputLine;
			int n= Integer.parseInt(br.readLine().trim());
			int arr[] =new int [n];
			inputLine= br.readLine().trim().split(" ");
			for ( int i=0;i<n;i++)
			{
				arr[i]=Integer.parseInt(inputLine[i]);
			}
		
			ArrayList<Integer> ans = new Value_to_Each_index_Solution().valueEqualToIndex(arr,n);
			if (ans.size()==0)
			{
				System.out.println("Not Found");
			}
			else
			{
				for(Integer x:ans)
				{
					System.out.println(x+" ");
				}
				System.out.println();
			}
		}
		

	}

}

class Value_to_Each_index_Solution{
	ArrayList<Integer> valueEqualToIndex(int arr[], int n){
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		for (int i=0;i<n;i++)
		{
			if (arr[i]==i+1)
			arr2.add(arr[i]);
		}
		return(arr2);
		
		
	}
}
class ghkjfgjsfbgSolution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] arr = new int [2*n];
        for (int i=0;i<n;i++)
        {
            arr[i]=nums[i];
            arr[n+i]=nums[i];
        }
        return arr;
    }
}


/**
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:

Input: 
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] and n as parameters and returns an array of indices where the given conditions are satified. When there is not such element exists then return an empty array of length 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Note: There can be more than one element in the array which have same value as their index. You need to include every such element's index. Follows 1-based indexing of the array.

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
*/