public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		String orderedFood = "Pizza";
		int quantity = 1;
		int unitPrice = 10;
		int totalCost = 0;
		int discountPercentage = 5;
		int deliveryCharge = 5;
		totalCost = unitPrice * quantity;
		if (customerType.equals("Regular") && orderedFood.equals("Pizza")) {
			System.out.println("You have ordered Pizza");
			totalCost = totalCost - (totalCost * discountPercentage / 100);
		} else if (customerType.equals("Guest") && orderedFood.equals("Pizza")) {
			System.out.println("You have ordered Pizza");
			totalCost = totalCost + deliveryCharge;
		} else {
			System.out.println("Invalid selection");
		}
		System.out.println("The total cost to be paid is " + totalCost);
	}
}
