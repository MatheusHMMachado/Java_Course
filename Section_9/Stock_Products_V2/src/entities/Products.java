package entities;

public class Products{
	//Encapsulamento
	//Tornando os atributos privados, para evitar inconsistência.
	private String name;
	private double price;
	private int quantity;
	
	//Definindo um construtor 
	public Products (String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Utilizando a sobrecarga para definir mais de um construtor customizado
	public Products (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Definindo o construtor padrão manualmente
	//Adicionando um tratamento ao atributo name, para não retornar um valor null
	public Products () {
		name = "";
	}
	
	
	//Utilizando os metodos get e set para manipular os atributos
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + "," +  " $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
