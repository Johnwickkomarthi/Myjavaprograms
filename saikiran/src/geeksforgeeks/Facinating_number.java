package geeksforgeeks;

import java.util.*;

public class Facinating_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Facinating_numberSolution one=new Facinating_numberSolution();
		int t=sc.nextInt();
		while(t!=0){
			long n=sc.nextLong();
			if (one.fascinating(n))
				System.out.println("true");
			else
				System.out.println("False");
			t--;
		}

	}

}
class Facinating_numberSolution {
    boolean fascinating(long n) {
    	
    	String str1 = new String(Long.toString(n));
    	if (str1.length()<3)
    	{	
    		return false;
    	}
    	
 
		String str2=new String(Long.toString(n*2));
		String str3= new String(Long.toString(n*3));
		String s=str1+str2+str3;
		if (s.length()>9)
			return false;
		
		long m=Long.parseLong(s);
		int arr[]= new int [9];
		int index=0;
		while(m>0)
		{
			arr[index]=(int)m%10;
			m/=10;
			index++;
		}
		Arrays.sort(arr);
		for (int i=0;i<8;i++)
		{
			if (arr[i]<arr[i+1] && arr[i]!=0)
			{
				continue;
			}
			else
				return false;
		}
			
		return true;
    }
}


class Facinating_numberSolution2{
    boolean fascinating(long n) {
        // code here
        long FirstNum = n * 2;
        long SecondNum = n * 3;
        String S1 = Integer.toString((int) n);
        String S2 = Integer.toString((int) FirstNum);
        String S3 = Integer.toString((int) SecondNum);
        String Str = S1 + S2 + S3;
        String Numbers = "123456789";
        char[] CharacterArray = Str.toCharArray();
        Arrays.sort(CharacterArray);
        String Str1 = new String(CharacterArray);
        if (Numbers.equals(Str1)) {
            return true;
        }

        return false;
    }
}


class Facinating_numberSolution3 {
    boolean fascinating(long n) {
        // code here
               String s = String.valueOf(n).concat(String.valueOf(n*2)).concat(String.valueOf(n*3));
        if(s.length()!=9||s.indexOf('0')>-1){
            return false;
        }
        Set<Character> ch = new HashSet<>();
        for(char c: s.toCharArray()){
            ch.add(c);
        }
        return ch.size()==9;
        
    }
}


class Facinating_numberSolution4 {
    boolean fascinating(long n) {
        // code here
             long cc=n;
            ArrayList<Long> al=new ArrayList<>();
            int count=0;
            while(cc>0)
            {
                al.add(cc%10);
                cc=cc/10;
                count++;
            }
            if(count<3)return false;
            helper(al,n*2);
            helper(al,n*3);
            for(int i=1; i<=9; i++)
            {
                if(!al.contains((long)i))
                {
                    return false;
                }
            }
            if(al.size()>9)return false;
            
            return true;
    }
    public static void helper(ArrayList<Long> al,long n)
    {
        while(n>0)
        {
            al.add(n%10);
            n=n/10;
        }
    }
}


class Facinating_numberSolution5 {
    boolean fascinating(long n) {
        // code here
        long p2 = n*2;
        long p3 = n*3;
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(p2).append(p3);
        //System.out.println(sb.toString());
        int check[] = new int [10];
       
        for(int i=0;i<sb.length();i++){
            
            check[sb.charAt(i)-'0']++;
        }
        for(int i=1;i<10;i++){
            if(check[i]!=1) return false;
        }
        return true;
    }
}
/**
 * Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.

Example 1:

Input: 
N = 192
Output: Fascinating
Explanation: After multiplication with 2
and 3, and concatenating with original
number, number will become 192384576 
which contains all digits from 1 to 9.
Example 2:

Input: 
N = 853
Output: Not Fascinating
Explanation: It's not a fascinating
number.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function fascinating() which takes the integer n parameters and returns boolean denoting the answer.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 <= N <= 2*109
 * 
 * 
 * 
 * 
 */