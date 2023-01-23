package cognigent;
import java.util.*;
class Main{
	public static void main(String[]a) {
		List <Integer>list=new LinkedList<Integer>();
		System.out.println(getMinimumTrips(list));
	}
	public static int getMinimumTrips(List<Integer> weights){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : weights) {
            if (!set.add(i)) {
                return -1;
            }
        }
        for (int i : weights) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }

        int twiceCount = 0;
        int thriceCount = 0;
        for (int count : countMap.values()) {
            if (count == 2) {
                twiceCount++;
            } else if (count == 3) {
                thriceCount++;
            }
        }
    return twiceCount+thriceCount;
    }
}
