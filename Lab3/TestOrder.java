package Lab3;

import java.util.Arrays;
import java.util.Comparator;

public class TestOrder {
	public static void main(String[] args) {
		Product p1 = new Product("001","Coca Cola", 10.0,"Soft Drink");
		Product p2 = new Product("003","Pepsi", 8.0,"Soft Drink");
		Product p3 = new Product("005","Pizza", 24.0,"Fast Food");
		Product p4 = new Product("002","Hamburger", 16.0,"Fast Food");


		OrderItem it1 = new OrderItem(p1,2);
		OrderItem it2 = new OrderItem(p2,1);
		OrderItem it3 = new OrderItem(p3,1);
		OrderItem it4 = new OrderItem(p4,3);

		OrderItem [] items = {it1,it2,it3,it4};

		Order order = new Order(items);
		
		Arrays.sort(items);
		System.out.println(Arrays.toString(items));
		
		double totalCost = order.cost();
		System.out.println("Total cost of the order: " + totalCost);
	}
}