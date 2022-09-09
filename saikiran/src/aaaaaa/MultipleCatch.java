package aaaaaa;
import java.util.*;
//4 3 6 1 0
public class MultipleCatch {
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int [] a = new int [n];
    int max = Integer.MIN_VALUE;
    int ans = 0;
    int count =0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      System.out.print(a[i]+ " ");
      if(a[i]>max){
        max = a[i];
        ans = i;
      }
    }
    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println(max+"jgfjshg"+ans);
    for (int i=0;i<n;i++){
    	
      if(2*a[i]<=max){
        count++;
        System.out.println(count+"  2nd  for loop  "+i+ "    2* value "+2*a[i]);
      }
    }
    if(count == n){
      System.out.println(ans);
    }
    else 
      System.out.println(-1);
}
}