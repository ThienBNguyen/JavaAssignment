package set2;
class Restaurant2 {
	public String restaurantName;
	public long restaurantContact;
	public String restaurantAddress;
	public float rating;
	public Restaurant2(String name, int restaurantContact, String restaurantAddress, float rating) {
		// TODO Auto-generated constructor stub
		this.restaurantName = name;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}

}
public class Assignment8 {
	public static void main(String [] args) {
		Restaurant2 restaurant1 = new Restaurant2("McDonald's", 123456789, "123, howard ln, austin texas", 4.1f);
		System.out.println("Restaurant Details");
		System.out.println("*****************");
		System.out.println("Restaurant Name :"+ restaurant1.restaurantName);
		System.out.println("Restaurant Rating :"+ restaurant1.rating);
		System.out.println("Restaurant Contact :"+ restaurant1.restaurantContact);
		System.out.println("Restaurant Address :"+ restaurant1.restaurantAddress);
		
	}

}
