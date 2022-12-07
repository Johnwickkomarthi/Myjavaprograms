package generalcodes;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicatesInArrays {

	public static void main(String[] args) {
		int arr[]= {5,6,1,3,3,6,1,2,4,5,6};
		//Arrays.sort(arr);
		//int arr[]= {1,1,2,2,3,3};
		System.out.println("using boolean array");
		for(int i:usingBooleanArray(arr)) {
			System.out.print(i+" ");
		}
		
		System.out.println('\n'+"using array list");
		for(int i:usingArrayList(arr)) {
			System.out.print(i+" ");
		}
		System.out.println('\n'+"using sorting array");
		for(int i:usingSorting(arr)) {
			System.out.print(i+" ");
		}
		System.out.println('\n'+"loop and break");
		for(int i:justLoops(arr)) {
			System.out.print(i+" ");
		}
		
	}
	// using loops only
		public static int [] justLoops(int arr[]) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				boolean unique=true;
				for(int j=0;j<i;j++) {
					if(arr[i]==arr[j]) {
						unique=false;
					}
				}
				if (unique)
					count++;
			}
			int idx=0;
			int a[]= new int[count];
			for(int i=0;i<arr.length;i++) {
				boolean unique=true;
				for(int j=0;j<i;j++) {
					if(arr[i]==arr[j]) {
						unique=false;
					}
				}
				if (unique)
					a[idx++]=arr[i];
			}
			return a;
		}
	
	// Here i have used a value in the array as the index in the boolean array
	public static int[] usingBooleanArray(int arr[]) {
		boolean [] b= new boolean[100000000];
		boolean [] b1= new boolean[100000000];
		int count=0;
		
		for (int i=0;i<arr.length;i++) {
			if (!b[arr[i]]) {
				count++;
				b[arr[i]]=true;
			}	
		}
		int []a= new int [count];
		
		for (int i=0,j=0;i<arr.length;i++) {
			if (!b1[arr[i]]) {
				count++;
				b1[arr[i]]=true;
				a[j++]=arr[i];
			}	
		}
		return a;
	}
	// here i have used arraylist collections to find the duplicates
	public static int [] usingArrayList(int []arr) {
		ArrayList<Integer> list= new ArrayList<>();
		for (int i:arr) {
			if (!list.contains(i)) {
				list.add(i);
			}
				
		}
		int a[]= new int[list.size()];
		for (int i=0;i<a.length;i++) {
			a[i]=list.get(i);
		}
		return a;
	}
	// using array sort method
	public static int [] usingSorting(int [] arr) {
		Arrays.sort(arr);
		int count=1;
		for (int i=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i])
				count++;
		}
		int a[]= new int [count];
		a[0]=arr[0];
		for (int i=1,j=1;i<arr.length;i++) {
			if(arr[i-1]!=arr[i])
				a[j++]=arr[i];
		}
		return a;
	}
}
