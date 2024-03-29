package geeksforgeeks;

import java.util.*;

public class Reverese_array_in_groups {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		reverseInGroups(list, list.size(), 3);
	}

	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		// code here
		int i=0;
		while(i+k<arr.size()) {
			int start=0;
			int end=k-1;
			while (start<end) {
				int x=start+i;int y=end+i;
				int temp=arr.get(start+i);
				arr.set(start+i, arr.get(end+i));
				arr.set(end+i, temp);
				start++;
				end--;
			}
			i+=k;
		}
		int start=i;
		int end=arr.size()-1;
		while(start<end) {
			int temp=arr.get(start);
			arr.set(start,arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
		System.out.println(arr);
	}
}


/**
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */
