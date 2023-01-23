package linked_list;
import java.util.*;
public class RevomeDuplicates {
	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
		for (int i=0;i<list.size();i++) {
			for (int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					j--;// AI has added this line but I didn't get it?
				}
			}
		}
		return list;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
}
/**
Given a linked list that stores integer values, remove the duplicate values and return a list containing unique values. Implement the logic inside removeDuplicates() method.

Test the functionalities using the main() method of the Tester class.
*/