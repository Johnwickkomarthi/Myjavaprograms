package generalcodes;

public class DecimalToBinary {

	public static void main(String[] args) {
		int B_Number = 0;
        int cnt = 0;
        int n=10;
        while (n != 0) {
        	int rem = n % 2;
            B_Number += rem * Math.pow(10, cnt);
            n /= 2;
            cnt++;
        }
        System.out.println(B_Number);

	}

}
