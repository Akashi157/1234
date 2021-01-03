package account;

public class account {
	
	private int number;
	private String name;
	private double saldo;
	
	public account() {
		
	}
	
	public account (int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public account(int number, String name, double saldo) {
		this.number = number;
		this.name = name;
		this.saldo = saldo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposito (double deposito) {
		this.saldo += deposito;
		
	}
	
	public void saque (double saque) {
		this.saldo -= saque+5;
	}
	
	public String toString () {
		return "Account "
			+ number
			+ ", Holder: "
			+ name
			+ ", Balance: $ "
			+ String.format("%.2f", saldo);
	}
	
	
}
