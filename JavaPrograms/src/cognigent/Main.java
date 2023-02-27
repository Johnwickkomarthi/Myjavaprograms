package cognigent;
import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]a) throws Exception {
		int [][]arr={{1,2,3},{1,4,6}};
		String s="";
		s.matches(s);
		System.out.println(minCost(arr,2));
		
	}
	static int minCost(int [][] colors, int N){
        //Write your code here
        int sameColor=-1,sum=0;
        for (int i=0;i<colors.length;i++){
            int min=Integer.MAX_VALUE;
            for (int j=0;j<3;j++){
                if(min>colors[i][j] && j!=sameColor){
                    min=colors[i][j];
                    sameColor=j;
                }
                
            }
            sum+=min;
        }
        return sum;
    }
}
