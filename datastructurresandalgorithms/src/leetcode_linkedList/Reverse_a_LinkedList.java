package leetcode_linkedList;



public class Reverse_a_LinkedList {

	public static void main(String[] args) {
		
		
	}
	
	// this is the solution given in the leetcode discussion 
	public ListNode reverseList(ListNode head) {
		ListNode newhead=null;
        /**
         * In this we create newhead node for reversed linked list
         */
        while(head!=null){
        	 ListNode next=head.next;// this will make connection for next node of the head to the 'next' named node.
        	 // so the element which is linked next to the head node is stored in the 'next' named node
             head.next=newhead;// for every iteration newhead node value is connected to the next to the head value 
             newhead=head;
             head=next;// the node which is stored in the next is now initiated back to the head for the next iteration 
        }
        return newhead;
    }

}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

