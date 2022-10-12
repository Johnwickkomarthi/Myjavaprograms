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
	public void setNext(Node next) {
		this.next = next;
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
		//create a nw node
		Node node = new Node(data);
		//check if the list is empty,
		// if yes, make the node as the head and the tail
		if (this.head==null)
			this.head=this.tail=node;
		else {
			//if the list is not empty, addthe element at the end
			this.tail.setNext(node);
			//make the new node as the tail
			this.tail=node;
		}
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
		System.out.println("adding an element to the linked list");

	}

}
