package enumurated_datatypes;

public enum Designation1 {
	CEO(2),GeneralManager(4),RegionalManager(20),BranchManager(30);
	private int noofEmployees;

	Designation1 (int noofEmployees )
	{
		this.noofEmployees=noofEmployees;
	}

	public int getNoofEmployees() {
		return noofEmployees;
	}
}
	class Bank1{
		public void reportees(Designation1 designation)
		{
			System.out.println(designation.getNoofEmployees());
		}
		public static void main (String args[])
		{
			Bank1 bank = new Bank1();
			bank.reportees(Designation1.CEO);// this will print only the number of employees only
		}
	}

