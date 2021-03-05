package set2;
class OrderFood{
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	public OrderFood() {
		this.status = "ordered";
	}
	public OrderFood(int orderId, String orderedFoods) {
		this();
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
	}
}
public class Assignment7 {
	public static void main(String [] args) {
		OrderFood order1 = new OrderFood();
		OrderFood order2 = new OrderFood(1001, "Garglic Shirmp");
		System.out.println("Status of order 2: "+order1.status);
		System.out.println("Status of order 2: "+order2.status);
		System.out.println("Id of order 2: "+order2.orderId);
		System.out.println("Items ordered in order 2: " +order2.orderedFoods);
	}
}
