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
class LinkedList{
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
}
public class Creating_linked_list {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("komathi");
		list.addAtEnd("narasannapeta");
		list.addAtEnd("tekkali");
		list.addAtEnd("palasa");
		list.addAtBeginning("kjsf");
		list.display();
		if (list.find("komathi")!=null)
			System.out.println("node found");
		else
			System.out.println("node not found");
	}

}
