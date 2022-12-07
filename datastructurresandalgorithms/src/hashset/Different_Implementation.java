package hashset;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Different_Implementation {
	public static void main(String[] args) {
		hasSet();
		linkedHashSet();
		treeSet();
	}

/**
 * HashSet uses hash tables for storing the unique elements. There is no guarantee on the iteration order of the set. 
 * HashSet depends on the equals() and hashCode() methods for detecting duplicates and null values are allowed. 
 */
	public static void hasSet() {
		//Creating HashSet object
		Set<String> food = new HashSet<String>();
		food.add("Pasta"); // Adding elements to the HashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("HashSet output without the duplicates: ");
		//Consider the example given below where duplicate entries have been added to a HashSet 
		//but only unique entries are displayed in a random order in the output
		System.out.println(food);
	}
	/**
	 * Next, we will discuss about LinkedHashSet. LinkedHashSet uses a combination of hash tables and linked lists for storing elements.
	 *  Elements are returned in the order of their insertion.
	 *  LinkedHashSet depends on the equals() and hashCode() methods for detecting duplicates and null values are allowed.
	 */
	public static void linkedHashSet() {
		Set<String> food = new LinkedHashSet<String>(); // Creating LinkedHashSet object
		food.add("Pasta"); // Adding elements to the LinkedHashSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("LinkedHashSet output : The duplicates are removed and displayed in the order in which the elements are inserted: ");
		//Consider the example given below where duplicate entries have been added to a LinkedHashSet
		//but only unique entries are displayed in the order of insertion in the output.
		System.out.println(food);
	}
	
	/**
	 * Next, we will discuss about TreeSet. TreeSet uses a tree-based data structure for storing elements.
	 *  Elements are returned based on natural ordering. For example, in case of String, the order will be alphabetical order.
	 *  TreeSet depends on compareTo() method for ordering as well as for detecting duplicates.
	 */
	public static void treeSet() {
		Set<String> food = new TreeSet<String>(); // Creating TreeSet object
		food.add("Pasta"); // Adding elements to the TreeSet
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("TreeSet output without the duplicates in the sorted order: ");
		System.out.println(food);
	}
}
