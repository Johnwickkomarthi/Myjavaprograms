package hustle;

public class Magical_number {

	public static void main(String[] args) {
		
		Magical_number obj = new Magical_number();
		String str="4004";
		int count=0,n=Integer.parseInt(str);
		String arr[]= new String [4];
		while(n>=1000)
		{
			String s=String.valueOf(n);
			if (s.length()%4==0 && n%4==0)
			{
				arr= obj.divideString(str, 4).clone();      //  we only use the number (string) with the length exactly divisible by 4 
															// Cloning the array from the divide string method 
			
			String concatinaton=arr[0]+arr[3];				// Concatenating the first part and the last part and checking for palindrome as well as checking the 2nd part and rd part are same or not 
			
			if(obj.checkPalindrome(concatinaton))
			{
				if (arr[1].equals(arr[2]))
					count++;
			}
			}
			n--;
		}
		System.out.println(count);
		
		
		
	}
	
	
	
	
	boolean checkPalindrome(String s)
	{
		boolean palindrome=true;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				palindrome=false;
				break;
			}
		}
		return palindrome;
	}
	
	
	
	String [] divideString(String str, int n)
    {
		String arr[]= new String[4];
		int x=0;
        int str_size = str.length();
        int part_size;
       
        part_size = str_size / n;// storing the each substring length 
 
        for (int i=0; i<=str_size-part_size; i+=part_size) {
        	
          
        	arr[x]=str.substring(i, i+part_size);
        	x++;
            if (x==4)
            	break;
        }
		return arr;
    }


}

