package leetcode;
import java.util.*;
public class Decompress_runlength_encoded_list {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		Decompress_runlength_encoded_list_Solution1 obj= new Decompress_runlength_encoded_list_Solution1();
		
		for (int i:obj.decompressRLElist(arr))
		{
			System.out.print(i+" ");
		}

	}

}

class Decompress_runlength_encoded_list_Solution1 {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;									// this is used to traverse the result array 
        for (int i = 0; i < nums.length; i += 2) {
        	
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);// here we can fill the array elements with a single value using "Arrays.fill"
            startIdx += nums[i];
        }
        return result;
    }
}


class Decompress_runlength_encoded_list_Solution2 {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
                
        int[] res = new int[size];
        
        for (int i = 1, k = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                res[k++] = nums[i];
            }
        }
        
        return res;
    }
}

/**
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
Example 2:

Input: nums = [1,1,2,3]
Output: [1,3,3]
 

Constraints:

2 <= nums.length <= 100
nums.length % 2 == 0
1 <= nums[i] <= 100
*/