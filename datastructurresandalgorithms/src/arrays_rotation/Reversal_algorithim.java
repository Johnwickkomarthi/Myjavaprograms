package arrays_rotation;

public class Reversal_algorithim {
	public static void main(String [] args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
		Reversal_algorithimleftRotate(arr,d);
		Reversal_algorithimPrintArray(arr);
	
	}
	static void Reversal_algorithimPrintArray(int arr[]) {
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void Reversal_algorithimleftRotate(int arr[], int d)
	{
		if (d==0)
			return;
		
		int n=arr.length;
		// in case the rotating factor is grater than array length
		d=d%n;
		Reversal_algorithim_ReverseArray(arr,0,d-1);
		Reversal_algorithim_ReverseArray(arr,d,n-1);
		Reversal_algorithim_ReverseArray(arr,0,n-1);
	}
	static void Reversal_algorithim_ReverseArray(int[] arr, int start, int end) {
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
}


