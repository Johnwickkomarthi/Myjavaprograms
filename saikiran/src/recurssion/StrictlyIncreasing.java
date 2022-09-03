package recurssion;

public class StrictlyIncreasing {
	public static boolean isSortd(int arr[], int idex)
	{
		if (idex==arr.length-1)
		{
			return true;
		}
		if (arr[idex]<arr[idex+1])
		{
			// array is sorted till now
			return isSortd(arr,idex+1);
			
		}
		else
			return false;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,2};
		System.out.println(isSortd(arr,0));

	}

}
