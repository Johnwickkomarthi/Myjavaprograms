package geeksforgeeks;
import java.util.*;
public class Palindrome_array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
		int n=sc.nextInt();
		int []a= new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Tester g=new Tester();
		System.out.println(g.palinArray(a,n));
		GfG gfg = new GfG();
		System.out.println(gfg.palinarray(a,n));
		t--;;
		
	}

	}
}

class Tester{
	
	public static int palinArray(int []a, int n)
	{
		int count=0;
        int x=0;
            for (int i=0;i<n;i++)
            {
            x=a[i];
             int temp=0,pal=0;
               while(x>0)
               {
                   temp=x%10;
                   pal=pal*10+temp;
                   x=x/10;
               }
               if (pal==a[i])
               count++;
               else
                 break;
            }
        if (count==n)
        {	System.out.println("=========="+count);
        return 1;}
        else
        return 0;
	}

}


/*This is another way of solving the above problem*/
class GfG
{
	public static int palinarray(int[] a, int n)
           {
                  //add code here.
                  //int[] rev = new int[n];
                  for(int i=0; i<n ; i++)
                  {
                      StringBuilder b = new StringBuilder(a[i]+"");
                      b.reverse();
                      if(Integer.valueOf(b.toString()) != a[i])
                      return 0;
                  }
                  
                  return 1;
                  
           }
}
/*Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 
 
 Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0
 * */
