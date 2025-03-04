package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int Quantity) {
		quantity += Quantity;
	}
	
	public void removeProducts(int Quantity) {
		quantity -= Quantity;
	}
	
	public String toString() {
		return name + "," +  " $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
