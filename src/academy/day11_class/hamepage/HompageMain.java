package day11_class.hamepage;

import java.util.Scanner;

public class HompageMain {

	public static void main(String[] args) {
		MemberDB memberDB = MemberDB.getInstance(); // 싱글톤으로 만들어서 이렇게 가져다 씀 
		BoardDB boardDB = BoardDB.getInstance();
		SessionStorage storage = new SessionStorage();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택 해주세요.");
			System.out.println("1.회원가입 | 2.회원 목록 조회 | 3.로그인 | 4.종료");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());  
			
			if(command == 1) { // 회원가입
				System.out.print("아이디를 입력 해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력 해주세요: ");
				String pw = sc.nextLine();
				
				memberDB.addMember(new Member(id, pw));  // 멤버 객체를 만들면서 그 안에 id pw 
			}
			
			else if (command == 2) { // 목록 조회 
				memberDB.showList();
			}
			
			else if (command == 3) { // 로그인 
				System.out.print("아이디를 입력 해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력 해주세요: ");
				String pw = sc.nextLine();
				
				if(memberDB.loginCheck(id, pw)) {  
					//TODO 글 조회 , 글 쓰기 , 로그아웃
					storage.setLoginMember(new Member(id, pw));
					while(true) {
						boardDB.showList();
						System.out.println("행동을 입력 해주세요.");
						System.out.println("1. 글쓰기 | 2. 글 조회 | 3. 로그아웃 ");
						System.out.println(">>> ");
						
						int select = Integer.parseInt(sc.nextLine());
					
						if(select == 1) {
							System.out.print("글 제목을 입력 해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용을 입력해주세요: ");
							String content = sc.nextLine();
							
							String author = storage.getLoginMember().getId();
							
							boardDB.addBoard(new Board(title, content, author));
						}else if(select == 2) {
							System.out.println("글번호를 입력 해주세요: ");
							int no = Integer.parseInt(sc.nextLine());
							
							boardDB.selectBoard(no);
							
						}else if(select == 3) {
							System.out.println("로그아웃 하였습니다.");
							
							storage.setLoginMember(null);
							break;
						}else {
							System.out.println("잘못 입력 했습니다.");
						}
					
					}
				}
				
			}else if (command == 4 ) {
				System.out.println("종료");
				break;
			
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			
			
		}
		
	}

}
