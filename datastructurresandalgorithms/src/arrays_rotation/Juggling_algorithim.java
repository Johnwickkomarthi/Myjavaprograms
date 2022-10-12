package arrays_rotation;
import java.util.*;
public class Juggling_algorithim {
	// Java program to rotate an array by
	// d elements
		/*Function to left rotate arr[] of siz n by d*/
	void rightRotate(int arr[], int d, int n)
	{
		d=d%n;
		int g_c_d=gcd(d, n);
		int i,j,k,temp;
		for (i=0;i<n;i++)
		{
			temp=arr[i];
			j=i;
			while(true) {
				k = n-j;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
			
			
		}
		
	}
		void leftRotate(int arr[], int d, int n)
		{
			/* To handle if d >= n */
			d = d % n;
			int i, j, k, temp;
			int g_c_d = gcd(d, n);
		
			for (i = 0; i < g_c_d; i++) {
				/* move i-th values of blocks */
				temp = arr[i];
				j = i;
				while (true) {
					k = j + d;
					if (k >= n)
						k = k - n;
					if (k == i)
						break;
					arr[j] = arr[k];
					j = k;
				}
				arr[j] = temp;
			}
		}

		/*UTILITY FUNCTIONS*/

		/* function to print an array */
		void printArray(int arr[], int size)
		{
			int i;
			for (i = 0; i < size; i++)
				System.out.print(arr[i] + " ");
		}

		/*Function to get gcd of a and b*/
		int gcd(int a, int b)
		{
			if (b == 0)
				return a;
			else
				return gcd(b, a % b);
		}

		// Driver program to test above functions
		public static void main(String[] args)
		{
			Juggling_algorithim rotate = new Juggling_algorithim();
			int Leftarr[] = { 15,16,17,18,19,20,21,22};
			int Rightarr[] = { 30,31,32,33,34,35,36,37};
			rotate.leftRotate(Leftarr, 2, 8);
			rotate.printArray(Leftarr, 8);
			System.out.println();
			rotate.rightRotate(Rightarr, 2, 8);
			rotate.printArray(Rightarr, 8);
		}
	}

	