package aaaaaa;
public class LinkedList{
	
	private Node head;
	private Node tail;
	public Node getHead() {
		return this.head;
	}
	public Node getTail() {
		return this.tail;
	}
	
	public void addFirst(int data) {
		Node node = new Node(data);
		if (this.head==null) {
			this.head=this.tail=node;
		}
		else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	public void addLast(int data) {
		Node node= new Node(data);
		
		if (this.head==null) {
			this.head=this.tail=node;
		}
		else {
			node.setNext(head);
			this.head=node;
		}
	}
	public boolean contains(int data) {
		Node temp= this.head;
		while(temp!=null) {
			if(temp.getData()==data)
				return true;
			temp=temp.getNext();
		}
		return false;
	}
	
	public void display() {
		Node temp=this.head;
		
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
}










