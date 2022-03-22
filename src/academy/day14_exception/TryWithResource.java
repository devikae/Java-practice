package day14_exception;

import java.util.Scanner;

public class TryWithResource {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// finally에서 사용하는 close
		
		try {
			System.out.print("아무말이나 입력: ");
			System.out.println(sc.nextLine());
		}catch(Exception e) {
			e.printStackTrace(); // 실무에선 로그로 남김
		}finally {
			sc.close();
		}
		
		
		
		
		try(Scanner sca = new Scanner(System.in)){
			System.out.print("아무말이나 입력 2번째 : ");
			System.out.println(sca.nextLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// try - with - resource 구문 (catch를 써도 되고 안써도 된다.)
		// 닫아야 할객체를 try() 괄호 안에 선언 후 try 블록{} 내에서 사용 
		// TMI : 객체의 클래스는 AutoCloseable 인터페이스를 구현하고 있어야 한다
		
		try(Scanner sca = new Scanner(System.in)){
			System.out.print("아무말이나 입력 2번째 : ");
			System.out.println(sca.nextLine());
		}
		// try() 괄호 안에 여러 객체 선언 
		
		try(Scanner scan = new Scanner(System.in);
			 Scanner scann = new Scanner(System.in)	)
		{ System.out.print("아무말이나 입력 3번째: ");
		  System.out.println(scan.nextLine());
		  System.out.print("아무말이나 입력 4번째: ");
		  System.out.println(scann.nextLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
