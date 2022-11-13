package leetcode;
import java.util.*;

public class kids_with_hihest_candies {

	public static void main(String[] args) {
		int arr[]= {2,3,5,1,3};
		int n=3;
		kids_with_hihest_candies_Solution1 ob=new kids_with_hihest_candies_Solution1();
		
		for(boolean i:ob.kidsWithCandies(arr, n))
		{
			System.out.println(i);
		}
	}

}
class kids_with_hihest_candies_Solution1 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> list= new ArrayList<Boolean>();
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        for (int i:candies)
        {
            if (i+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}