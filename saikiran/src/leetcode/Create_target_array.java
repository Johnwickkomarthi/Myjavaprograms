package leetcode;
import java.util.*;
public class Create_target_array {

	public static void main(String[] args) {
		
		int nums[]= {0,1,2,3,4};
		int index[]= {0,1,2,2,1};
		Create_target_array_Solution1 obj= new Create_target_array_Solution1();
		for (int i:obj.createTargetArray(nums, index))
		{
			System.out.print(i+" ");
		}
	}

}


class Create_target_array_Solution1 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]= new int[nums.length];
        
        for (int i=0;i<nums.length;i++)
        {
             
                 for (int j=target.length-1;j>index[i];j--)
                    {
                        target[j]=target[j-1];
                    }
                    target[index[i]]=nums[i];
            
        }
        
        return target;
        
    }
    }

class Create_target_array_Solution2 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
}

/**
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
 

Constraints:

1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
*/