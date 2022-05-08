package chapter06;

public class Account {
	 
	private String ano;
	private String owner;
	private int balance;
//	final int MIN_BALANCE = 0;
//	final int MAX_BALANCE = 1000000;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String onwer) {
		this.owner = onwer;
	}
	
	public int getBalance() {
		return balance;
	}
		
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
