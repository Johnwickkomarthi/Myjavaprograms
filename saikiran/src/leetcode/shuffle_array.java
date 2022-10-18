package leetcode;

public class shuffle_array {

	public static void main(String[] args) {
		
		int n=3;
		int arr[]= {2,4,51,1,6,7};
		shuffle_array_Solution obj= new shuffle_array_Solution();
		arr=obj.shuffle(arr, n).clone();
		for (int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
class shuffle_array_Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp=0,m=2*n;
        int arr[] = new int[m];
        int j=0;
        for (int i=0;i<m;i++)
        {
            if (i%2==0)
            {
                arr[i]=nums[j];
                j++;
            } 
                
            else
                arr[i]=nums[n+j-1];
        }
        return arr;
    }
    
    public int[] shuffle2(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
            res[idx++] = nums[i];
            res[idx++] = nums[j];
        } 
        return res;
    }
}

/**
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 

Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
*/