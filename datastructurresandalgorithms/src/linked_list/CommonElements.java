package linked_list;
import java.util.*;
public class CommonElements {
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    List<Integer> list=new LinkedList<Integer>();
		    for(int i=0;i<listOne.size();i++){
		    if(listTwo.contains(listOne.get(i)))
		    list.add(listOne.get(i));
		    }
		    return list;
		}
		
		public static void main(String arga[]){

			List<Integer> listOne = new LinkedList<Integer>();
			listOne.add(10);
			listOne.add(12);
			listOne.add(21);
			listOne.add(1);
			listOne.add(53);
			
			List<Integer> listTwo = new LinkedList<Integer>();
			listTwo.add(11);
			listTwo.add(21);
			listTwo.add(25);
			listTwo.add(53);
			listTwo.add(47);

			System.out.println(findCommonElements(listOne, listTwo));
		}
}
/**
Given two linked lists that store integer values, return a linked list containing the common elements from both the lists. Implement the logic inside findCommonElements() method.
*/