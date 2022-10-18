package geeksforgeeks;
import java.util.*;
public class print_the_left_element {

	public static void main(String[] args) {
		long n=6;
		long [] arr= {7,8,3,4,2,9};//2 3 4 7 8 9 
		print_the_left_element_Solution obj = new print_the_left_element_Solution();
		System.out.println(obj.leftElement(arr, n));
		
	}

}
class print_the_left_element_Solution {
    
    public long leftElement(long arr[], long n)
    {
        Arrays.sort(arr);
        if (n%2==0)
        return arr[(int) ((n-1)/2)];
        
        else
        return arr[(int) ((n)/2)];
    }
}