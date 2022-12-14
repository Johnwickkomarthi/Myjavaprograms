package leetcode;

public class Number_of_good_pairs {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1};
		
		Number_of_good_pairs_Solution1 obj= new Number_of_good_pairs_Solution1();
		System.out.println(obj.numIdenticalPairs(arr));
	}

}
class Number_of_good_pairs_Solution1 {
    public int numIdenticalPairs(int[] nums) {
         int count=0;
         for (int i=0;i<nums.length;i++)
         {
             for(int j=0;j<i;j++)
             {
                 if (nums[i]==nums[j])
                     count++;
             }
         }
         return count;
    }
}

class Number_of_good_pairs_Solution2 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for (int a: nums) {
            res += count[a]++;
        }
        return res;
    }
}


/**
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/