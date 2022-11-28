package statck;

public class Stack {
	private int top; // this represents the index top most element in stack
	private int maxSize; // maximum number of elements that can be stored in stack
	private int[] arr;	//
	Stack(int maxSize) {
		this.top = -1; // top is initialized to -1 when stack is created
		this.maxSize = maxSize;
		arr = new int[maxSize]; 
	}
	// get the size of the stack
	public int sizeOf() {
		return this.maxSize;
	}
	//Checking if the stack is full or not
		public boolean isFull() {
			if (top >= (maxSize - 1)) {
				return true;
			}
			return false;
		}
		
		//Adding a new element to the top of the stack
		public boolean push(int data) {
			if (isFull()) {
				return false;
			} else {
				arr[++top] = data;
				return true;
			}
		}
		// Prints all the elements in the stack
		public void diplayAll() {
			int ar[]=this.arr;
			for(int i=this.maxSize-1;i>=0;i--) {
				System.out.println(ar[i]);
			}
		}
		// returning the top element in the stack
		int peek() {
			if (top < 0)
				return Integer.MIN_VALUE;
	        else
				return arr[top];
		}
		// Checking if the stack is empty or not
		public boolean isEmpty() {
			if (top < 0) {
				return true;
			}
			return false;
		}
		// Removing the element from the top of the stack
		public int pop() {
			if (isEmpty())
				return Integer.MIN_VALUE;
			else
				return arr[top--];
		}
		

	
}
class Tester {
	public static void main(String args[]) {
		Stack stack = new Stack(5);
        System.out.println("Stack created.\n");
		if (stack.push(1))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
		if (stack.push(2))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
		if (stack.push(3))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
		if (stack.push(4))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
		if (stack.push(5))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");
		System.out.println(stack.peek());
	}
}
