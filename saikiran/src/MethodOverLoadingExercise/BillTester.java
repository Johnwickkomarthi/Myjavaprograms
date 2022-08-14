package MethodOverLoadingExercise;

public class BillTester {

	public static void main(String[] args) {
			
		Bill bill= new Bill();
		bill.findPrice(1002);
		bill.findPrice("Reebook","T-shirt",34);
	}

}
