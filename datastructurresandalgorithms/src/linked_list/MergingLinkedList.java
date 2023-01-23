package linked_list;
import java.util.*;
public class MergingLinkedList {
	public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
		 //Implement your logic here and change the return statement accordingly
	
		LinkedList<Integer> sortedList = new LinkedList<>();
        ListIterator<Integer> iter1 = listOne.listIterator();
        ListIterator<Integer> iter2 = listTwo.listIterator();
        
        while (iter1.hasNext() && iter2.hasNext()) {
            int val1 = iter1.next();
            int val2 = iter2.next();
            
            if (val1 < val2) {
                sortedList.add(val1);
                iter2.previous();
            } else {
                sortedList.add(val2);
                iter1.previous();
            }
        }
        
        while (iter1.hasNext()) {
            sortedList.add(iter1.next());
        }
        
        while (iter2.hasNext()) {
            sortedList.add(iter2.next());
        }
        
        return sortedList;
	}
	// This code has time complexity of O(N)
	public static List<Integer> mergeLists1(List<Integer> listOne, List<Integer> listTwo){
		LinkedList<Integer> mergedList = new LinkedList<>();
	    ListIterator<Integer> iter1 = listOne.listIterator();
	    ListIterator<Integer> iter2 = listTwo.listIterator();

	    // Initialize the iterators to the first element of each list
	    Integer val1 = iter1.hasNext() ? iter1.next() : null;
	    Integer val2 = iter2.hasNext() ? iter2.next() : null;

	    // Compare the values of the two lists and add the smaller one to the merged list
	    while (val1 != null || val2 != null) {
	        if (val1 == null) {
	            mergedList.add(val2);
	            val2 = iter2.hasNext() ? iter2.next() : null;
	        } else if (val2 == null) {
	            mergedList.add(val1);
	            val1 = iter1.hasNext() ? iter1.next() : null;
	        } else if (val1 < val2) {
	            mergedList.add(val1);
	            val1 = iter1.hasNext() ? iter1.next() : null;
	        } else {
	            mergedList.add(val2);
	            val2 = iter2.hasNext() ? iter2.next() : null;
	        }
	    }

	    return mergedList;
	}

	public static void main(String args[]) {
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(13);
		listOne.add(21);
		listOne.add(42);
		listOne.add(56);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(15);
		listTwo.add(20);
		listTwo.add(21);
		listTwo.add(85);
		listTwo.add(92);
		
		List<Integer> mergedList = mergeLists(listOne, listTwo);
		List<Integer> mergedList1 = mergeLists(listOne, listTwo);
		System.out.println(mergedList);
		System.out.println(mergedList1);
	}
}
/**
Given two sorted linked lists containing integers, return a single linked list containing all the integers of both the lists in a sorted order. 
Implement the logic inside mergeLists() method.
*/