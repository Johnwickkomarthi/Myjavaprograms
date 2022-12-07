package leetcode_linkedList;
import java.util.*;
public class Convert_Binary_Number_in_a_Linked_List_to_Integer {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		list.add(1);
		list.add(0);
		list.add(1);
		Convert_Binary_Number_in_a_Linked_List_to_Integer_Solution1 obj= new Convert_Binary_Number_in_a_Linked_List_to_Integer_Solution1();
		System.out.println(obj.getDecimalValue(list));

	}

}

class Convert_Binary_Number_in_a_Linked_List_to_Integer_Solution1{
	public int getDecimalValue(LinkedList<Integer> list ) {
        int sum = 0,i=0;
        Iterator<Integer> l= list.iterator();
        while (l.hasNext()){
            sum *= 2;
            sum += l.next();
        }
        
       
        return sum;
    }
}


/**
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 1- > 0 -> 1

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
*/