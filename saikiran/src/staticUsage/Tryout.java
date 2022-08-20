package staticUsage;

public class Tryout {

	    static int minbalance;  //class variable
	    
	    static{
	        minbalance = 500;   // static block
	    }
	    
	    public static int getMinimumBalance(){
	        return minbalance;  //can't use instance variable in static method
	                            //and block
	    }
	    
	    public static void main (String[] args) {
	        System.out.println("The value.." + getMinimumBalance());
	    }
	
}
