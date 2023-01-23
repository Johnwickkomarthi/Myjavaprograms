package aaaaaa;

public class Dimension {

	public static void main(String[] args) {
		
		int [] arr= {5,3,6,2,8,1,4,2,3};
		int count=0,target=8;
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			if (sum==target) {
				count++;
				sum=0;	
			}
		}
		System.out.println(count);
	}

}
