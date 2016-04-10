public class main {
	 public static void main(String[] args) {
	 Product product = new Product("Edam", 3.3, 120);
	 System.out.println("Product value is " + product.countValue());
	 product.printProduct();
	 product.changeBalance(5);
	 product.changePrice(5);
	 }
	}
	class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
	public Product(String name, double price, int amount) {
	this.name = name;
	this.price = price;
	this.amount = amount;
	}
	public double countValue() {
	return(amount * price);
	}
	public void printProduct() {
	System.out.printf("Product %s, price %4.1f and balance %d pcs",
	name,price,amount);
	}
	public void changeBalance(int newvalue)
	{
		int newBalance = product.countValue() + newvalue;
		product.countValue() = newBalance;
		System.out.println("Changed Balance: ", product.countValue());
	}
	
	public void changePrice(int newvalue)
	{
		this.price = newvalue;
		System.out.println("Changed Price: ", product.price());
	}
}
