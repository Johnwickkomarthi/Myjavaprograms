package linked_list;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Exercise1 {
    
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
		//Implement your logic here and change the return statement accordingly
    	
    	Iterator l= ((LinkedList<Object>) listTwo).descendingIterator();// i have changed the list of objects into linked list
    	while(l.hasNext()) {
    		listOne.add(l.next());
    	}
    	return listOne;
	}


	public static void main(String args[]) {
		List<Object> listOne = new LinkedList<Object>();
		listOne.add("Hello");
		listOne.add(102);
		listOne.add(25);
		listOne.add(38.5);
		
		List<Object> listTwo = new LinkedList<Object>();
		listTwo.add(150);
		listTwo.add(200);
		listTwo.add('A');
		listTwo.add("Welcome");
		
		List<Object> concatenatedList = concatenateLists(listOne, listTwo);
		
		System.out.println("Concatenated linked list:");
		for (Object value : concatenatedList) {
			System.out.print(value+" ");
		}
	}
}



/**
Given two lists, concatenate the second list in reverse order to the end of the first list and return the concatenated list. 
Implement the logic inside concatenateLists() method.

Note: Use descendingIterator() method to iterate over the elements in reverse order.

Test the functionalities using the main() method of the Tester class.


Sample Input
listOne = Hello->102->25->38.5
list Two = 150->200->A->Welcome

Expected Output
Hello->102->25->38.5->Welcome->A->200->150


Sample Input
listOne 50.5->X->125->A
list Two 150->165->Hello->25.7 

Expected Output
50.5->X->125->A->25.7->Hello->165->150

*/





