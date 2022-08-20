package generalcodes;
import java.util.*;
public class Arry {
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int count =0;
			int a[] = new int [n];
			int b =0;
			int count1=0;
			for (int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			int h = a[0];
			for (int j=0;j<n;j++) {
				if(h<a[j]) {
					h = a[j];
					b = j;
				System.out.println(a[0]+"a[0] element value");
	            System.out.println(h+"highest in loop");
				}
			}
			for(int i=0;i<n;i++) {
				if (h >= 2*a[i]) {
					count++;			
				}
			}
	        System.out.println(h+"highest");
	        System.out.println(count+"   ksjdfhjfdhs");
			if (count == (n-1)) {
				System.out.println(b);
				}
			else {
				System.out.println("-1");
			}
	}
}
