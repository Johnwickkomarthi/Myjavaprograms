package leetcode;
import java.util.*;
public class SmallerThan_previous_element {

	public static void main(String[] args) {
		int arr[]= {8,1,2,2,3};
		SmallerThan_previous_element_Solution1 obj= new SmallerThan_previous_element_Solution1();
		System.out.println(obj.smallerNumbersThanCurrent(arr));// here we need to use loop to print the elements
		SmallerThan_previous_element_Solution2 obj2= new SmallerThan_previous_element_Solution2();
		System.out.println(obj2.smallerNumbersThanCurrent(arr));// here we need to use loop to print the elements
		
	}

}

class SmallerThan_previous_element_Solution1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]= new int[nums.length];
        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            for (int j=0;j<nums.length;j++)
            {
                if (nums[i]>nums[j])
                    count++;
            }
            arr[i]=count;
        }
          return arr;  
    }
}
class SmallerThan_previous_element_Solution2 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;        
    }
}