package arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

class Order {
	private int orderId;
	private List<String> itemNames;
	private boolean cashOnDelivery;

	public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
		this.orderId = orderId;
		this.itemNames = itemNames;
		this.cashOnDelivery = cashOnDelivery;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	
	@Override
	public String toString() {
		return "Order Id: "+getOrderId()+", Item names: "+getItemNames()+", Cash on delivery: "+isCashOnDelivery();
	} 
}


class Exercise1 {
    
    public static List<String> getItems(List<Order> orders) {
    	// write code here
		List<String> list= new ArrayList<>();

		for (int i=0;i<orders.size();i++) {
			list.addAll(orders.get(i).getItemNames());
		}
    		
		return list;
	}
    
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<Order>();

		List<String> items1 = new ArrayList<String>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Tortilla");
		orders.add(new Order(101, items1, true));

		List<String> items2 = new ArrayList<String>();
		items2.add("Pizza");
		items2.add("Pasta");
		orders.add(new Order(102, items2, true));

		List<String> items3 = new ArrayList<String>();
		items3.add("Burger");
		items3.add("Sandwich");
		items3.add("Pizza");
		orders.add(new Order(103, items3, true));

		List<String> items = getItems(orders);
		System.out.println("List of Items:");
		for (String item : items) {
			System.out.println(item);
		}

	}

}
/**
A restaurant keeps a track of all the orders using an ArrayList and a class Order.

The class Order is implemented and provided to you.

You need to retrieve and return the list of items present in all the orders. Implement the logic inside getItems() method.


Sample Input

orders=[Order(101, item Names=[Fried Rice, Pasta, Tortilla], true), Order(102, item Names=[Pizza, Pasta], true), Order(103, itemNames=[Burger, Sandwich, Pizza], true)
orders=[Order(911, itemNames=[Burger, Pizza], true), Order(912, itemNames=[Cream cheese, Bread], true)


Expected Output
[Fried Rice, Pasta, Tortilla, Pizza, Pasta, Burger, Sandwich, Pizza]
[Burger, Pizza, Cream cheese, Bread]
*/