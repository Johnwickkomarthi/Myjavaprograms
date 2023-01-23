package leetcode_linkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class Design_HashSet {

	public static void main(String[] args) {
		MyHashSet obj= new MyHashSet();
		obj.add(1);
		obj.add(2);
		System.out.println(obj.contains(1));
		System.out.println(obj.contains(3));
		obj.add(2);
		obj.remove(51);
		System.out.println(obj.contains(51));
		
	}

}
//This solution is given by others but this is very important revise it as many times you can.
//This is asked in google.
class MyHashSet {
    List<Integer>[] container = null;
    int cap = 1000;
    double loadFactor = 0.75;
    int count = 0; 
    /** Initialize your data structure here. */
    public MyHashSet() {
        container = new LinkedList[cap];
    }
    
    public void add(int key) {
        if(contains(key)) return;
        if(loadFactor*cap == count){
            count = 0;
            //rehash
            cap *= 2;
            List<Integer>[] oldC = container;
            container = new LinkedList[cap];
            for(int i=0; i < oldC.length; i++){
                List<Integer> list = oldC[i];
                if(list != null){
                    for(int entry : list)
                       this.add(entry); 
                }
            }
        }
        int hash = key % cap;
        if(container[hash] == null)
            container[hash] = new LinkedList<>();
        container[hash].add(key);
        ++count;
    }
    
    public void remove(int key) {
        int hash = key % cap;
        List<Integer> list = container[hash];
        if(list != null){
            Iterator<Integer> itr = list.iterator();
            while(itr.hasNext())
                if(itr.next() == key){
                    itr.remove();
                    --count;
					break;
                }
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = key % cap;
        List<Integer> list = container[hash];
        if(list != null){
            Iterator<Integer> itr = list.iterator();
            while(itr.hasNext())
                if(itr.next() == key)
                    return true;
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





/**
Idea
loadFactor tells when to perform re-hashing. I set it to 75% meaning if we have filled 75% of the container, we need to perform rehash. 
The reason for doing this is to "shorten" the individual chains at each bucket. That way, we reduce the time for contains and remove in the average case.

My thoughts
There is an optimization to maintain these chains as BST for faster search. 
But there is an overhead of maintaing the balaced BST and extra space for node structure per entry. 
Rather, we can always re-hash to keep the lengths of the chains reasonable and there by limiting the worst case search for an entry. 
Of course, the hash function plays a crucial role in keeping the chains shorter by distributing the keys uniformly across buckets. 
The initial capcity and loadFactor are other knobs that we can tune depending on the actual workload we are targetting.
*/