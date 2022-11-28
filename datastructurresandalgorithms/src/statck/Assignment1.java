package statck;
import statck.Stack;
public class Assignment1 {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.diplayAll();
       calculateSum(stack);
            
        System.out.println("Updated stack");
        stack.diplayAll();

	}
	
	public static void calculateSum(Stack stack) {
		int sum=0;
		int arr[]= new int[stack.sizeOf()];
		int i=0;
        while(!stack.isEmpty()) {
        	arr[i++]=stack.peek();
        	sum+=stack.pop();
        }
        arr[i]=sum;
        while(!stack.isFull()) {
        	if(i==-1)
        		break;
        	stack.push(arr[i--]);
        }
    }

}
