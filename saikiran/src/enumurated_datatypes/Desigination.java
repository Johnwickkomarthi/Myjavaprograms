package enumurated_datatypes;

public enum Desigination {
	CEO,GeneralManager,RegionalManager,BranchManager;

}
class Bank{
	public void roleDefined(Desigination desigination)// designation is the enum reference
	{
		switch(desigination)
		{
		case CEO:
			System.out.println("role of ceo");
			break;
		case GeneralManager:
			System.out.println("role of GeneralManager");
			break;
		case RegionalManager:
			System.out.println("role of RegionalManager");
			break;
		case BranchManager:
			System.out.println("role of BranchManager");
			break;
		}
	}
}

class Enum{
	public static void main(String args[])
	{
		Bank bank=new Bank();
		bank.roleDefined(Desigination.CEO);
	}
}
// an enum is a non-primitive type (user defined data type) that contains fixed set of consatnts
// all the constants are static and final implicitly
// since enums are reference data types like class or interface and hence we can define constructors, methods, and variables in an enum.
//the constructor for an enum type must have default or private access. but the  constuctor cannot be invoked using new operator.