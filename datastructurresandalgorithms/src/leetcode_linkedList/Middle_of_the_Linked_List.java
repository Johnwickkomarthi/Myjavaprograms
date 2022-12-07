package leetcode_linkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Middle_of_the_Linked_List {

	public static void main(String[] args) {
		

	}

}
class Middle_of_the_Linked_List_Solution1 {
    public ListNode middleNode(ListNode head) {
        int count=0,count1=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null){
            if(count%2==0){
                count1++;
                if(count1==count/2){
                    temp1=temp1.next;
                    return temp1;
                }
                    
                temp1=temp1.next;
            }
            else if(count%2!=0){
                count1++;
                if(count1==count/2){
                    temp1=temp1.next;
                    return temp1;
                }
     
                temp1=temp1.next;
            }    
        }
        return head;
    }
}
class Middle_of_the_Linked_List_Solution2 {
	public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
}

/**
 Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
*/
