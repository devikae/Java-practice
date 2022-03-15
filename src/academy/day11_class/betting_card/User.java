package day11_class.betting_card;

import java.util.Scanner;

public class User {
	String name;
	int money;
	int card;
	
	User(){
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", money=" + money + "]";
	}
	
	void State1() {
		System.out.println("play1: "+ name);
		System.out.println("보유 금액: " + money);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void State2() {
		System.out.println("play2: "+ name);
		System.out.println("보유 금액: " + money);
	}
		
	
}
