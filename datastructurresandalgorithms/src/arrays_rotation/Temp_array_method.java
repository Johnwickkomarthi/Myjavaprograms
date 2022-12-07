package arrays_rotation;
import java.io.*;
public class Temp_array_method {

	
	static void Rotate(int arr[], int d, int n)
	{
		// Storing rotated version of array
		int temp[] = new int[n];

		// Keepig track of the current index
		// of temp[]
		int k = 0;

		// Storing the n - d elements of
		// array arr[] to the front of temp[]
		for (int i = d; i < n; i++) {
			temp[k] = arr[i];
			k++;
		}

		// Storing the first d elements of array arr[]
		// into temp
		for (int i = 0; i < d; i++) {
			temp[k] = arr[i];
			k++;
		}

		// Copying the elements of temp[] in arr[]
		// to get the final rotated array
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}

	
	static void PrintTheArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		public static void main (String[] args) {
			int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
			int N = arr.length;
			int d = 2;

		
			Rotate(arr, d, N);
			PrintTheArray(arr, N);
		}
	}

/*Illustration 
Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.

First Step:
    => Store the elements from 2nd index to the last.
    => temp[] = [3, 4, 5, 6, 7]

Second Step: 
    => Now store the first 2 elements into the temp[] array.
    => temp[] = [3, 4, 5, 6, 7, 1, 2]

Third Steps:
    => Copy the elements of the temp[] array into the original array.
    => arr[] = temp[] So arr[] = [3, 4, 5, 6, 7, 1, 2]
    */

	
	
	

