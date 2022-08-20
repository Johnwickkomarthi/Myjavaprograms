package super_keyword;

public class TryoutUsingConstructor {
	
	    protected int tenure;
	    protected float interestRate;
	    
	    TryoutUsingConstructor(int tenure, float interestRate){
	        this.tenure = tenure;
	        this.interestRate = interestRate;
	    }
	}

	class HomeLoan extends TryoutUsingConstructor{
	    HomeLoan(){
	        super(5,8.5f);  //invoking super class constructor
	    }
	    public double calculateEMI(double principal){
	        double simpleInterest = (principal * interestRate * tenure) / 100;
	        double emi = (simpleInterest + principal) / tenure;
	        int additionalTax = 200;
	        return emi + additionalTax;
	    }
	}

	class ExecuteLoan{
	    public static void main (String[] args) {
	        HomeLoan loan = new HomeLoan();     //Runtime polymorphism
	        double hloan = loan.calculateEMI(2000000);
	        System.out.println("Home loan emi per year..." + hloan);
	    }
	}

