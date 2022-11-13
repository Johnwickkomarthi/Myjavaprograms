package hustle;


public class Infosys_speclist_programmer_level1 {

	public static void main(String[] args) {
		
		Solution1 obj = new Solution1();
		System.out.println(obj.solve(6, 2));
	}

}

class Solution1{
	public static int solve(int x, int d)
	{
		int y=1,count=0;;
		double d1=0;
		if (d==0)
		{
				while(true)
				{
					if (x%y==0)
						{
						count++;
						}
					y++;
					
					if (y>x)
						break;
				}
		}
			
		else
		{
				while (true)
					{
					d1=(double)x/y;
				String text = Double.toString(Math.abs(d1));
				int integerPlaces = text.indexOf('.');
				int decimalPlaces = text.length() - integerPlaces - 1;
				y++;
				if (decimalPlaces<=d)
					count++;
				
				else if (d1<=0.1)
					break;
			}
		}
		return count;
	}
	
}

/**
 find the number of integer numbers y>0 where the number of decimal points of x/y does not exceed D
 
  notes:-
  - if X=1 and D=1
  - 1/1 =1
  - 1/2 =0.5
  - 1/5 =0.2
  - 1/10 =0.1
  
  input format 
  the first line contains an integer X, denoting the number X defined in the problem 
   the next line contains an integer D, denoting the number D defined in the problem
   
   constraints
   1<= x <=10^9
   0<=D<=10^3
   
   
   TEST CASES
   sample input 
   7 1
   sample output
   8
   explanation
   there are 8  numbers 7/1=7  7/2=3.5   7/5=1.4   7/7=1   7/10=0.7   7/14=0.5    7/35=0.2   7/70=0.1   
   
 */
