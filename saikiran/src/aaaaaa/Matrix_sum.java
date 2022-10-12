package aaaaaa;

import java.util.*;

public class Matrix_sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,n,z;
		m=sc.nextInt();
		n=sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		z=sc1.nextInt();
		int [][]a = new int[m][n];
		System.out.println(m+" "+n+" "+z);
		
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
