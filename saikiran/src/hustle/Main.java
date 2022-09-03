package hustle;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main
{
    public static String findLargestNumber(List<Integer> nums)
    {
        // sort using a custom function object
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
 
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	int n=input.nextInt();				// input for the array length
    	Integer []x= new Integer[n];
    	
    	for (int i=0;i<n;i++)
    	{
    		x[i]=input.nextInt();		// input for the array elements
    	}
    	List<Integer> numbers = Arrays.asList(x);			// storing the array of elements in the list data structure 
        String largestNumber = findLargestNumber(numbers);
        System.out.println(largestNumber);// the largest possible number that can be formed from given array of elements
    }
}