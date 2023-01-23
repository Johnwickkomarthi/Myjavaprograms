package binary_Tree;
import java.util.*;
public class Maximum_element_in_each_level {
	
	public static void main(String[] args) {
		
		Node root = null;
	    root = Node(4);
	    root.left = Node(9);
	    root.right = Node(2);
	    root.left.left = Node(3);
	    root.left.right = Node(5);
	    root.right.right = Node(7);
	    ArrayList<Integer> list=Solution2.maximumValue(root);
	    System.out.println(list);
	}
	static ArrayList<Integer> maximumValues(Node root){
		ArrayList<Integer> list=new ArrayList<Integer>();
			helper(list,root,0);
		return list;
	}
	static void helper(ArrayList<Integer> list,Node node,int index) {
		if(node==null)
			return;
		if(index==list.size())
			list.add(node.val);
		else
			list.set(index, Math.max(list.get(index), node.val));// Getting the maximum element form each level.
		helper(list,node.left,index+1);// calling the left node and adding index+1 position in the arraylist.
		helper(list,node.right,index+1);// calling the right node and adding index+1 position in the arraylist.
	}
	//This will create new node with right and left child nodes.
//	static Node newNode(int data)
//	{
//	    Node temp = new Node();
//	    temp.val = data;
//	    temp.left = temp.right = null;
//	    return temp;
//	}
	/**
	 * we have taken class inside another class. Its important to check this out.
	 * we can create both static and non-static classes. static class is called static nested class, non-static classes are again classified into two types.
	 * 1.local classes, 2. Anonymous classes 
	 * class code should be ended with semicolon.
	 * @author saikiran
	 *
	 */
	//This is base class for the node.
//	static class Node
//	{
//	    int val;
//	    Node left, right;
//	};
}
//User function Template for Java

//Tree node structure  used in the program
class Node {
  int data;
  Node left;
  Node right;
  Node(int data) {
      this.data = data;
      left = null;
      right = null;
  }
}


class Solution2 {
 static  ArrayList<Integer> maximumValue(Node node) {
     //code here
     ArrayList<Integer>result=new ArrayList<>();
     if(node==null)
     {
         result.add(0);
         return result;
     }
     Queue<Node>queue=new LinkedList<>();
     queue.add(node);
     while(!queue.isEmpty())
     {
         Node temp;
         int size=queue.size();
         int max=Integer.MIN_VALUE;
         for(int i=0;i<size;i++)
         {
             temp=queue.poll();
             max=Math.max(max,temp.data);
             if(temp.left!=null)
             {
                 queue.add(temp.left);
             }
             if(temp.right!=null)
             {
                 queue.add(temp.right);
             }
         }
         result.add(max);
     }
     return result;
  }
}