package hustle;

public class Hybrid_car {

	public static void main(String[] args) {
		
		System.out.println(solve(6,3,2,1));
	}
	public static  int solve(int A, int B, int C, int D) {
        
       int petrol=1,hybrid=1; 
       if(petrol*C>A && hybrid*D>A) {
    	   System.out.println("failed in both");
    	   return -1;
       }
     
       else if(petrol*C<A && hybrid*D>A) {
    	   while(petrol*C<=A) {
    		   if(petrol==B && petrol*C<=A) {
    			   System.out.println("travelled using petrol "+petrol);
    			   return petrol;
    		   }
    		   petrol++;
    	   }
       }
       
       else if(petrol*C>A && hybrid*D<A) {
    	   while(hybrid*D<=A) {
    		   if(hybrid==B && hybrid*D<=A) {
    			   System.out.println("using hybrid");
    			   return 0;
    		   }
    		   hybrid++;
    	   }
       }
       else if(petrol*C<A && hybrid*D<A) {
    	   while(petrol*C<=A) {
    		   petrol++;
    	   }
    	   petrol--;
    	   if(B==petrol)
    		   return petrol;
    	   B-=petrol;
    	   A-=petrol*C;
    	   
    	   while(hybrid*D<=A) {
    		   if(hybrid==B && hybrid*D<=A) {
    			   System.out.println("using both petrol and hybrid "+petrol);
    			   return petrol;
    		   }
    		   hybrid++;
    	   }
       }
       System.out.println("last");
       return -1;
    }
}

/**
You are traveling on road in your car is hybrid. ie. you can run your car either on petrol or by combing power of both petrol and battery. 
You have to travel a total of B kilometers. Initially, you have A liters of petrol When you run your car only on petrol it consumes C liters of petrol per kilometer. 
When you run your can on both petrol plus battery power, it consumes D (which is less than C) liters of petrol per kilometer You want to save your battery, 
meaning you want to go a maximum of kilometers by petrol.
At the end of B kilometers you must have greater than zero liters of petrol, otherwise, return-1.
Sometimes it is possible that you are unable to go B kilometers, in that case, return -1. Otherwise, return the maximum number of kilometers you traveled on only petrol.
Note: You can travel integer kilometers in a single mode (petrol or hybrid).

Input Format:

The first argument represents A, the initial liters of petrol you have.
The second argument represents B, number of kilometers you have to travel. The third argument represents C, liters of petrol your car consumes, per kilometer, 
while traveling on only petrol.
The fourth argument represents D. liters of petrol your car consumes, per kilometer, while traveling on both petrol and battery.

Output Format
Return an integer  If you are unable to travel B kilometers return -1, otherwise return the maximum number of kilometers you traveled using petrol.


Example input 
Input 1:
A=7
B=2
C=7
D=4

Input 2: 
A=3
B=2
C=4
D=1

Example output
Output 1:
-1
Output 2:
0

Example explanation
Explanation 1:
You can't travel 2 kilometers,hence return -1.

Explanation 2:
You can travel 2 kilometers,but on hybrid power, hence returning 0.

*/