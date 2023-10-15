package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private OrderItem[] items;
	
	public Order(OrderItem[] items) {
		this.items = items;
	}
	public double cost() {
		// TODO
		double totalCost = 0.0;
		for (OrderItem item : items) {
			totalCost += item.getTotalCost();
		}
		return totalCost;
	}
	//using binary search approach
	public boolean contains(Product p) {
		//TODO
		 for (OrderItem item : items) {
	            if (item.getP().equals(p)) {
	                return true;
	            }
	        }
	        return false;
	}
	//get all products based on the given type using linear search
	public Product[] filter(String type) {
		//TODO
		int count = 0;
		for (OrderItem item : items) {
	        if (item.getP().getType().equals(type)) {
	            count++;
	        }
	    }

	    Product[] filteredProducts = new Product[count];  // Create an array for filtered products
	    int index = 0;

	    // Populate the array with matching products
	    for (OrderItem item : items) {
	        if (item.getP().getType().equals(type)) {
	            filteredProducts[index] = item.getP();
	            index++;
	        }
	    }

	    return filteredProducts;
	}


}
