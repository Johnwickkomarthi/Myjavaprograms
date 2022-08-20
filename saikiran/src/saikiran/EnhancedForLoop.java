package saikiran;

public class EnhancedForLoop {
	
	    public static void main(String[] args){
	        double balance = 6000;
	        double rateOfInterest = 0.10;
	        double interest = 0;
	        double withdrawal = 500;
	        double deposit = 600;
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	        for(int i: arr) {   // The iteration in the loop happens automatically. The value is assigned to 
	                   //variable i from the array in every iteration of the loop.
	            balance += deposit;   // Loop will repeat the statements in its body till the last element is reached in the array.
	            balance -= withdrawal;
	            interest = balance * rateOfInterest;
	            balance += interest;
	            System.out.println("The interest for the month " + i + " is " + interest);
	            }
	        } 
	
}
