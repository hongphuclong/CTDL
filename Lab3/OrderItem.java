package Lab3;

public class OrderItem implements Comparable<OrderItem>{
	private Product p;
	private int quanlity;

	public OrderItem(Product p, int quanlity) {
		super();
		this.p = p;
		this.quanlity = quanlity;
	}

	@Override
	public int compareTo(OrderItem o) {
		// TODO Auto-generated method stub
		return this.p.compareTo(o.getP());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return p +": "+ quanlity;
	}

	public double getTotalCost() {
		// TODO Auto-generated method stub
		return p.getPrice() * quanlity;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

}