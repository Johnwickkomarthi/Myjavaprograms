package aaaaaa;

import java.util.*;

/*
2 5
14 2 26 11 14
11 4 9 1 16
9 27 11 4 30
15 26 19 1 15 
 
 
 */

public class GFG {

	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int [][]a = new int[m][n];
		
        for (int x=0;x<m;x++)
        {
        	for (int y=0;y<n;y++)
        	{
        		a[x][y]=sc.nextInt();
        	}
        }
        
        int [][]b = new int[m][n];
        int [][]c = new int[m][n];
        for (int x=0;x<m;x++)
        {
        	for (int y=0;y<n;y++)
        	{
        		b[x][y]=sc.nextInt();
        	}
        }
        
        int i, j;
        for (i = 0; i < m; i++)
        {  
        	for (j = 0; j < n; j++)
                {
        			c[i][j] = a[i][j] + b[i][j];
                }
        }
		
        for (i = 0; i < m; i++)
        {  
        	for (j = 0; j < n; j++)
        	{
        		System.out.print(c[i][j]+" ");
        	}
        System.out.println();
        }
		
	}
}


