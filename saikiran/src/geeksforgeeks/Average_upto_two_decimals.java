package geeksforgeeks;

public class Average_upto_two_decimals {

	public static void main(String[] args) {
		int n=7;
		int arr[]= {1,2,3,4,5,6,7};
		Compute c=new Compute();
		System.out.print(c.average(arr, n));

	}

}
class Compute
{
    String average(int A[], int N)
    {
        double sum=0;
        for (int i=0;i<N;i++)
        {
            sum+=A[i];
        }
        double avg=sum/N;
        return String.format("%.2f",avg);
    }
}