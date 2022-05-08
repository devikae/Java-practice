package chapter06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 >> ");
			
			int select =Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.println("----------");
				System.out.println("계좌 생성");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String ano = sc.nextLine();
				System.out.println("계좌주: ");
				String name = sc.nextLine();
				System.out.println("예금액: ");
				int money =Integer.parseInt(sc.nextLine());
				createAccount(ano, name, money);
			}else if(select == 2) {
				System.out.println("----------");
				System.out.println("계좌 목록");
				System.out.println("----------");
				accountList();
			}else if(select == 3) {
				System.out.println("----------");
				System.out.println("예금");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String ano = sc.nextLine();
				System.out.println("예금액: ");
				int money =Integer.parseInt(sc.nextLine());
				deposit(ano, money);
				
			}else if(select == 4) {
				System.out.println("----------");
				System.out.println("출금 ");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String ano = sc.nextLine();
				System.out.println("출금액: ");
				int money =Integer.parseInt(sc.nextLine());
				withdraw(ano, money);
			}else if(select == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount(String ano, String name, int money){
		Account ac = new Account(ano, name, money);
		
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = ac;
				break;
			}
		}
		
	}
	
	private static void accountList() {
		for(int i =0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+"   "+accountArray[i].getOwner()+"   "+accountArray[i].getBalance() );
			}
		}
	}
	
	private static void deposit(String ano, int money) {
		Account temp = findAccount(ano);
		
		if(temp != null) {
			temp.setBalance(temp.getBalance()+money);
			System.out.println("결과: 예금이 완료 되었습니다.");
			System.out.println("잔고: " + temp.getBalance());
		}else {
			System.out.println("결과: 예금에 실패 했습니다.");
		}
	}
	
	private static void withdraw(String ano, int money) {
		Account temp = findAccount(ano);
		
		if(temp != null) {
			if(temp.getBalance() >= money) {
				
			temp.setBalance(temp.getBalance()-money);
			System.out.println("결과: 출금이 완료 되었습니다.");
			System.out.println("잔고: " + temp.getBalance());
			
			}else {
				System.out.println("잔액이 부족 합니다.");
			}
		
		}else {
			System.out.println("결과: 출금에 실패 했습니다.");
		}
	}
	
	private static Account findAccount(String ano) {
		
		for(int i =0; i<accountArray.length; i++) {
			if(ano.equals(accountArray[i].getAno())){
				return accountArray[i];
			}
		}
		return null;
	
	}
	
	
	
	
	
	
	
	
	
}
