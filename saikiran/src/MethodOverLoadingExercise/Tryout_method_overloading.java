package MethodOverLoadingExercise;

public class Tryout_method_overloading {
	
	    private float interest;
	    
	    Tryout_method_overloading(){
	        interest = 8.5f;
	    }
	    
	    //calculateEMI overloaded methods
	    public double calculateEMI(int tenure, double principal){
	        double simpleInterest = (principal * interest * tenure) / 100;
	        return (simpleInterest+principal)/tenure;
	    }
	    public double calculateEMI(double principal, int tenure){
	        double simpleInterest = (principal * interest * tenure) / 100;
	        return (simpleInterest+principal)/tenure;
	    }
	    public double calculateEMI(int tenure, double principal, float interest){
	        double simpleInterest = (principal * interest * tenure) / 100;
	        return (simpleInterest+principal)/tenure;
	    }
	    
	    public static void main(String[] args){
	    	Tryout_method_overloading loan = new Tryout_method_overloading();
	        double result = loan.calculateEMI(20000d, 5); //d means double
	        double value = loan.calculateEMI(5, 20000d);
	        double val = loan.calculateEMI(5, 20000, 9.5f); // f means float
	        
	        System.out.println("EMI per year is..." + result);
	        System.out.println("EMI per year is..." + value);
	        System.out.println("EMI per year is..." + val);
	        
	    }
	
}
