package leetcode_linkedList;
import java.util.LinkedList;
public class Design_HashSet {

	public static void main(String[] args) {
		MyHashSet obj= new MyHashSet();
		obj.add(2);
		obj.add(51);
		System.out.println(obj.contains(51));
		obj.remove(51);
		System.out.println(obj.contains(51));
		
	}

}
//This solution is given by others but this is very important revise it as many times you can.
//This is asked in google.
class MyHashSet {
    private int m;
    private LinkedList<Integer>[] arr;

    /** Initialize your data structure here. */
    public MyHashSet() {
        m = 3331;
        arr = new LinkedList[m];
    }
    
    public void add(int key) {
       if(!contains(key)){
        int loc = key % m;
        if(arr[loc] == null) {
            arr[loc] = new LinkedList<Integer>();
        }
        arr[loc].addFirst(key);
       }
    }
    
    public void remove(int key) {
        int loc = key % m;
        if(arr[loc]!=null) {
            arr[loc].removeFirstOccurrence(key);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int loc = key % m;
        if(arr[loc] != null) {
            return arr[loc].contains(key);
        }
        return false;
    }
}
/**
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 

Example 1:

Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
*/