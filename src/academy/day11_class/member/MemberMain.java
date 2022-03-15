package day11_class.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Member minwoo = new Member();
		
		minwoo.id = "minwoo";    //이렇게 하나씩 입력하기 귀찮다면 Member 클래스에 1*
		minwoo.pw = "1q2w";
		minwoo.name = "민우"; 
		
		Member bumseok = new Member("bumseok", "1234", "범석");
		
		System.out.println(minwoo); // 객체의 경로와 해쉬코드가 나옴  
		System.out.println(minwoo.toString()); 
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(minwoo);
		memberList.add(bumseok);
		
		System.out.println(memberList);
				
		Scanner sc = new Scanner(System.in);
		System.out.println();
		while(true) {
			System.out.println("행동을 선택해 주세요");
			System.out.println("1. 회원가입 | 2. 회원조회 | 3. 회원탈퇴 | 4. 종료");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());   
			
			if(command == 1) {
				//TODO 회원가입
				System.out.print("ID를 입력해주세요 >>>  ");
				String id = sc.nextLine();
				System.out.println("PW를 입력해주세요 >>> ");
				String pw = sc.nextLine();
				System.out.println("이름을 입력해주세요 >>> ");
				String name = sc.nextLine();
				
				//아이디 중복 여부 
				boolean isDuple = false;
				for(Member member : memberList){
					if(member.id.equals(id)) {
						isDuple = true;
					}
				}
				
				if(!isDuple) {
					memberList.add(new Member(id, pw, name)); // 한줄로 만든다면 이렇게
				}else {
					System.out.println("중복된 ID 입니다.");
				}
				
//				Member name2 = new Member(id, pw, name);
//				memberList.add(name2);
//				memberList.add(new Member(id, pw, name)); // 한줄로 만든다면 이렇게
				
			}else if(command == 2) {
				System.out.println("회원 조회 | 1. 이름으로 조회 | 2. ID로 조회  >>>>");
				System.out.print(">>> ");
				
//				for(int i = 0; i< memberList.size(); i++) {
//					System.out.println(memberList.get(i));
//				}
//				
				for(Member member : memberList) {
					System.out.println(member);
				}
				
				
			}else if(command == 3) {
				//회원 탈퇴 
				System.out.println("ID를 입력해주세요");
				System.out.print(">>> ");
				String id = sc.nextLine();
				
				//입력받은 id에 해당하는 
				
				Member temp = null;
				for(Member member : memberList) {
					if(member.id.equals(id)) {
//						memberList.remove(memberList);        for문이 도는 도중 인덱스자리값 변화로 오류
						temp = member;
					}
				}
				memberList.remove(temp);
				
			}else if(command == 4) {
				System.out.println("종료 하였습니다. ");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. ");
			}
			
		}
		
		
	}
}
