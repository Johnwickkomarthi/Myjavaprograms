package practice_level1;
import java.util.*;
import java.lang.Math;
public class NearlySortedArray {
	/*Given an array of integers, write a program to perform the following:

		Print 0 if the entire array is sorted in ascending order
		Print 1 if atleast half but not the entire array is sorted in ascending order
		Print 2 Otherwise
		Note: Use ceil value of half in case if it is a decimal number

		Input and Output Format:

		Input contains array elements separated by comma. Read the input from standard input stream.

		Print the output to standard output stream*/
	/* sample input1,2,3,4,5,6 
	 * sample output 0
	 * All the elements are in sorted order and hence 0*/
	/*  sample input 11, 15, 66, 75, 5
	 * sample output 1
	 * 15,66 and 75 are in ascending order which is at least half of the total number of elements.*/
	/* sample input 11, 31, 15, 66, 75, 5, 55, 34
	 * sample output 2
	 * number of sorted elements are less than half of the total number of elements*/
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String s=input.nextLine();
		String [] splitArray= s.split(",");
		int []arr= new int[splitArray.length];
		int []originalArrray= new int[splitArray.length];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(splitArray[i]);
		}
		int order=0;
		for(int i=1;i<arr.length;i++)
		{
			if (arr[i-1]<arr[i])
			{
				order++;
			}
			
		}
		if (order==arr.length-1)
			System.out.println("0");
		else if (order>(int) arr.length/2)
			System.out.println("1");
		else
			System.out.println("2");
		
	}

}
