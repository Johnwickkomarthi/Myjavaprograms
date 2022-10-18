package geeksforgeeks;

public class Average_in_stream {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {10,20,30,40,50};
		Average_in_stream_Solution obj= new Average_in_stream_Solution();
		obj.streamAvg(arr, n);
		

	}

}


class Average_in_stream_Solution {
    float[] streamAvg(int[] arr, int n) {
        float[] avg= new float[n];
        float sum=0.0f;
        for (int i=0;i<n;i++)
        {
            sum+=(float)arr[i];
            avg[i]=sum/(1.0f+(float)i);
            
        }
       return avg;
    }
}