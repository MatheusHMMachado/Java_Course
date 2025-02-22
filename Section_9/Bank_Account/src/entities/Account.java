package entities;

public class Account {
	//Attributes
	private String holder;
	private int accountNumber;
	private double bankBalance;
	public static final double RATE = 5.00;
	
	//Constructors
	public Account(String name, int accountNumber) {
		this.holder = name;
		this.accountNumber = accountNumber;
	}

	public Account(String name, int accountNumber, double initialDeposit) {
		this.holder = name;
		this.accountNumber = accountNumber;
		depositBalance(initialDeposit);
	}
	
	public Account() {
		holder = "";
		bankBalance = 0.0;
	}
	
	
	//Getters and Setters
	public String getName() {
		return holder;
	}
	public void setName(String name) {
		this.holder = name;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return bankBalance;
	}
	
	
	//Methods
	public void depositBalance(double value) {
		bankBalance += value;
	}
	
	public double withdrawalsBalance(double value) {
			bankBalance -= (value + RATE); 
			return bankBalance;
	}
	
	public String toString() {
		return  "Account "
				+ accountNumber
				+", "
				+ "Holder: "
				+ holder
				+", "
				+ "Balance: $ "
				+ String.format("%.2f", bankBalance);
	}
	
}
