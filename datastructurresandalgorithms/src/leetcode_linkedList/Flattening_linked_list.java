package leetcode_linkedList;
import leetcode_linkedList.Node;
public class Flattening_linked_list {

	public static void main(String[] args) {
		Node root=new Node(5);
		root.bottom=new Node(7);
		root.bottom.bottom=new Node(8);
		root.bottom.bottom.bottom= new Node(30);
		root.next=new Node(10);
		root.next.bottom= new Node(20);
		root.next.next=new Node(19);
		root.next.next.bottom=new Node(22);
		root.next.next.bottom.bottom=new Node(50);
		root.next.next.next=new Node(20);
		root.next.next.next=new Node(20);
		root.next.next.next.bottom=new Node(35);
		root.next.next.next.bottom.bottom=new Node(40);
		root.next.next.next.bottom.bottom.bottom=new Node(45);
		Node node=flatten(root);
		printList(node);
		
	}
	static void printList(Node root) {
			while(root!=null) {
				System.out.println(root.data+" ");
				root=root.bottom;
			}
	}
	//
	static Node flatten(Node root) {
		if (root==null || root.next==null) {
			return root;
		}
		root.next=flatten(root.next);
		root=merge(root,root.next);
		
		return root;
	}
	static Node merge(Node a, Node b) {
		Node curr=new Node(-1);
		Node res=curr;
		while(a!=null && b!=null) {
			if (a.data<=b.data) {
				curr.bottom=a;
				curr=curr.bottom;
				a=a.bottom;
			}
			else
			{
				curr.bottom=b;
				curr=curr.bottom;
				b=b.bottom;
			}
		}
			if(a!=null)
				curr.bottom=a;
			else
				curr.bottom=b;
			return res.bottom;
		
	}
}
/**
Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order. 
Note: The flattened list will be printed using the bottom pointer instead of next pointer.

 

Example 1:

Input:
5 -> 10 -> 19 -> 28
|     |     |     | 
7     20    22   35
|           |     | 
8          50    40
|                 | 
30               45
Output:  5-> 7-> 8- > 10 -> 19-> 20->
22-> 28-> 30-> 35-> 40-> 45-> 50.
Explanation:
The resultant linked lists has every 
node in a single level.
(Note: | represents the bottom pointer.)
 

Example 2:

Input:
5 -> 10 -> 19 -> 28
|          |                
7          22   
|          |                 
8          50 
|                           
30              
Output: 5->7->8->10->19->22->28->30->50
Explanation:
The resultant linked lists has every
node in a single level.

(Note: | represents the bottom pointer.)
 

Your Task:
You do not need to read input or print anything. Complete the function flatten() that takes the head of the linked list as input parameter and returns the head of flattened link list.

 

Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(1)

 

Constraints:
0 <= N <= 50
1 <= Mi <= 20
1 <= Element of linked list <= 103
*/