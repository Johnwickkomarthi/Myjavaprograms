package super_keyword;

public class Using_superToCall_method {
		public double calculateEMI(double principal) {
		    double simpleInterest = (principal*8.5*5) / 100;
		    double emi = (simpleInterest+principal)/5;
		    return emi;
		    }
		}
		           
		    class HomeLoan1 extends Using_superToCall_method {
		        public double calculateEMI(double principal) {
		            int additionaltax = 200;
		            double emi = super.calculateEMI(principal);      //calling super class method
		            return emi + additionaltax;
		        }
		    }
		           
		    class ExecuteLoan1 {
		        public static void main(String[] args) {
		        	Using_superToCall_method loan = null;
		            loan =  new HomeLoan1();                 // Runtime polymorphism
		             double hloan = loan.calculateEMI(2000000);
		             System.out.println("Home loan emi per year..."+ hloan);
		        }
		    }

