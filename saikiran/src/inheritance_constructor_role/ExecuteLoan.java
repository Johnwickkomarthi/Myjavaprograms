package inheritance_constructor_role;

class Loan{
	public double calculateEMI(double principal) {
		double simpleInterest= (principal*8.5*5)/100;
		double emi=(simpleInterest+principal)/5;
		return emi;
	}
}
class HomeLoan extends Loan{
	public double calculateEMI(double principal) {
		int additialTax=200;
		double
	}
}
public class ExecuteLoan {

	public static void main(String[] args) {
		

	}

}
