package queue;

public class Exercise1 {

	public static void main(String[] args) {
		
		 Queue1 queue = new Queue1(7);
	        queue.enqueue(2);
	        queue.enqueue(7);
	        queue.enqueue(9);
	        queue.enqueue(4);
	        queue.enqueue(6);
	        queue.enqueue(5);
	        queue.enqueue(10);

	        Queue1[] queueArray = splitQueue(queue);
	            
	        System.out.println("Elements in the queue of odd numbers");
	        queueArray[0].display();
	            
	        System.out.println("\nElements in the queue of even numbers");
	        queueArray[1].display();
	}
	
	 public static Queue1[] splitQueue(Queue1 queue) {
	        Queue1[] numberArr = new Queue1[2];
	      //create two queues - odd and even queue
	    Queue1 oddQueue=new Queue1(queue.getMaxSize() );
	    Queue1 evenQueue=new Queue1(queue.getMaxSize());
	    // seperate odd and even
	   while(!(queue.isEmpty()))
	   {
	       int val=queue.dequeue();
	       //System.out.println(val);
	       if(val%2==0)
	       {
	           evenQueue.enqueue(val);
	       }else
	       {
	           oddQueue.enqueue(val);
	       }
	   }
	    // assign odd numbers queue to 0th index of array
	    numberArr[0] = oddQueue;
	    // assign even numbers queue to 1th index of array
	    numberArr[1] = evenQueue;
	    return numberArr;
	    }
	

}

class Queue1 {
    
    private int front;
    private int rear;
    private int maxSize;
    private int arr[];
      
    Queue1(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }
      
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }
            
    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else {
            for (int index = front; index <= rear; index++) {
                System.out.println(arr[index]);
            }
        }
    }
            
    public boolean isEmpty() {
        if (front > rear)
            return true;
        return false;
    }
            
    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }
}
