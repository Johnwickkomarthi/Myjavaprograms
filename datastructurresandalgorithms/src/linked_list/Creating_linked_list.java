package linked_list;

class Node{
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data=data;
	}
	
	
	
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return this.next;
	}
	public void setNext(Node node) {
		this.next = node;
	}
	
}




class LinkedList1{
	private Node head;
	private Node tail;
	public Node getHead() {
		return this.head;
	}
	public Node getTail() {
		return this.tail;
	}
	public void addAtEnd(String data) {
		//create a new node
		Node node = new Node(data);
		//check if the list is empty,
		// if yes, make the node as the head and the tail
		if (this.head==null)
			this.head=this.tail=node;
		else {
			//if the list is not empty, add the element at the end
			this.tail.setNext(node);
			//make the new node as the tail
			this.tail=node;
		}
	}
	public void addAtBeginning(String data) {
		//create a new node
		Node node= new Node(data);
		// check if the list is empty
		// if yes make the node as the head and the tail
		if (this.head==null)
			this.head=this.tail=node;
		else {
			//if the list is not empty, add the element at the beginning
			node.setNext(this.head);
			//make the new node as head 
			this.head=node;
			
		}
		
	}
	public void display() {
		//Initialize temp to the head node
		Node temp=this.head;
		//traverse the list and print the date in the each node
		while(temp!=null) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	public Node find(String data) {
		Node temp=this.head;
		// traverse the list and return the node
		// the data we searched is matched with the data
		while(temp!=null) {
			if (temp.getData().equals(data))
				return temp;
			temp=temp.getNext();	
			}
		return null;
	}
	public void insert(String data,String dataBefore){
		Node node=new Node(data);
		// check if the list is empty or not

		if (this.head==null)
			this.head=this.tail=node;
		else{
			//find the node which the data has to be inserted 
			Node nodeBefore=this.find(dataBefore);
			if (nodeBefore!=null){
				// insert the new node after the node before
				node.setNext(nodeBefore.getNext());
				nodeBefore.setNext(node);
				// if the nodeBefore is tail node then make the current node as tail
				if (nodeBefore==this.tail)
					this.tail=node;
			}
			else
				System.out.println("Node not found");
		}
	}
	public int findPostion(String data) {
		int index=0;
		Node temp=this.head;
		while(temp!=null) {
			if(temp.getData().equals(data))
				return index;
			index++;
			temp=temp.getNext();
		}
		return index;
	}
	
	public void delete(String data){
		// check if the list is empty or not
		if (this.head==null)
			System.out.println("list is empty");
		else{
			// find the node to be deleted 
			Node node=this.find(data);
			// if the node is not found
			if (node==null)
				System.out.println("node is not found");
			// if node to be deleted is head node
			else if(node==this.head){
				this.head=this.head.getNext();
				node.setNext(null);
				// if node to be deleted is tail node
				if (node==this.tail)
					tail=null;
			}
			else {
				//traverse to the node present before the node to be deleted
				Node nodeBefore=null;
				Node temp=this.head;
				while(temp!=null){
					if (temp.getNext()==node){
						nodeBefore=temp;
						break;
					}
					temp=temp.getNext();
				}
				// Remove the node
				nodeBefore.setNext(node.getNext());
				// if the node to be deleted is the tail node
				//then make the previous node as tail
				if(node==this.tail)
					this.tail=nodeBefore;
				node.setNext(null);
			}
		
		}
	}
	public void shiftLeft(LinkedList1 list, int n) {
		while(n!=0) {		
			Node temp=this.head;
			/**
			 * store the head in a temporary node and make it tail node, set the 2nd node as head and temporary node as tail and eliminate the connection between the 1st and 2nd node
			 */
			head=head.getNext();
			tail.setNext(temp);
			tail=tail.getNext();
			tail.setNext(null);
			n--;
		}
		while(head!=null) {
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
	public void shiftRight(LinkedList1 list, int n) {
		while(n!=0) {
			/**
			 * first we need to find the node before the tail node to eliminate the connection between them and then make tail node as head and the node before the tail node as tail node.
			 */
			Node nodeBefore=new Node(tail.getData());
			Node temp=this.head;
			while(temp!=null){
				if (nodeBefore.getData().equals(temp.getNext().getData())){
					nodeBefore=temp;
					break;
				}
				temp=temp.getNext();
			}
			tail.setNext(head);
			head=tail;
			tail=nodeBefore;
			tail.setNext(null);
			n--;
		}
			while(head!=null) {
				System.out.println(head.getData());
				head=head.getNext();
			}
		
		
	}
	
}  
//  	1->2->3->4->5
public class Creating_linked_list {

	public static void main(String[] args) {
		LinkedList1 list= new LinkedList1();
		list.addAtEnd("a");
		list.addAtEnd("b");
		list.display();
		
		
	}

}
