package geeksforgeeks;
import java.util.*;
import java.io.*;
import java.lang.*;
public class FindElements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine().trim());
		while (t-- > 0)
		{
			long n=Integer.parseInt(br.readLine().trim());
			long a[] = new long [(int)(n)];
			String inputLine[]=br.readLine().trim().split(" ");
			for (int i=0;i<n;i++)
			{
				a[i]=Long.parseLong(inputLine[i]);
				
			}
			FindElementsSolution obj = new FindElementsSolution();
			long answer[]= obj.findElements(a,n);
			long sz= answer.length;
			StringBuilder output =new StringBuilder();
			for (int i=0;i<sz;i++)
			{
				output.append(answer[i]+" ");
				
			}
			System.out.println(output);
			
		}
		

	}

}


class FindElementsSolution{
	public long[] findElements( long a[], long n)
    {
        long arr[]= new long [(int) (n-2)];
        Arrays.sort(a);
        for (long i=0;i<n;i++)
        {
            if (a[(int) (n-1)]>a[(int) i] && a[(int) (n-2)]>a[(int) i])
            arr[(int) i]=a[(int) i];
            if (i==n-3)
                break;
        }
        return arr;
    }
}



//this is another way of solving the solution 

class FindElementsSolution2 {
  public long[] findElements( long a[], long n)
  {
      // Your code goes here
      Arrays.sort(a);
      long v[]=new long[(int) n-2];
      for(int i=0;i<n-2;i++)
      {
          v[i]=a[i];
      }
      return v;
  }
}
/*
 Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


Example 1:

Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.   
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

Your Task:  
You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector sorted values denoting the elements in array which have at-least two greater elements than themselves.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
3 ≤ N ≤ 105
-106 ≤ Ai ≤ 106
 */
 