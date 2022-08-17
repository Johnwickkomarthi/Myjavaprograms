package abstract_class_exercise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingPayment shop= new ShoppingPayment(5000.0,561328);
		shop.payBill(6000);
		System.out.println("&&&&&&&&&&&&&&&&&&");
		System.out.println();
		CreditCardPayment creditCard= new CreditCardPayment(10000.23,5001);
		creditCard.payBill(15000.0);
	}

}
