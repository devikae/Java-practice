package submit2.submit03;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {
	public static void main(String[] args) {

		Library book = Library.getInstance();

		Scanner sc = new Scanner(System.in);
		
		book.initList();
		
		while (true) {
			System.out.println("행동을 선택 해주세요.");
			System.out.println("1.책 입고 | 2.책 대여 | 3.책 목록 | 4.책 검색 | 5. 종료");
			System.out.print(">>> ");

			int command = Integer.parseInt(sc.nextLine());

			if (command == 1) { // 책 입고
				System.out.print("도서번호를 입력해주세요: ");
				int bookNO = Integer.parseInt(sc.nextLine());
				System.out.print("이 (가) 입고되었습니다. ");
				
				// bookno로 책 분별하기 이름 떼어서 붙이기, 입고되면 입고중으로 출력
				for(int i = 0; i< book.bookList.size(); i++) {
					if(bookNO == book.bookList.get(i).bookNO) { // 사용자가 입력한 값이 i의 값과 같다면? 그 책의 lend 상태를 false로 변경
						book.bookList.get(i).setLend(false);
					}
				}
				
			} else if (command == 2) { // 책 대여
				System.out.print("책 이름을 입력 해주세요: ");
				String bookNM = sc.nextLine();
				// 해리포터 검색시 "해리포터" 텍스트가 들어간 책 전부 출력
				for (int i = 0; i < book.search(bookNM).size(); i++) {
					System.out.println(book.search(bookNM).get(i));
				}
				System.out.print("도서 번호를 입력 해주세요: ");
				int bookNO = Integer.parseInt(sc.nextLine());
				
				// 고른책의 bookNO에 접근 
				// bookNO 가 i인 책 
				// bookNO에 맞는 책을 setLend 상태 (true) 변경 
				book.lent(bookNO);
				
//				Book.setLend(true);
				

			}else if (command == 3) { // 책 목록
				book.showList();
			}else if (command == 4) { // 책 검색
				System.out.print("책 이름을 입력 해주세요: ");
				String bookNM = sc.nextLine();
				for(int i =0; i< book.search(bookNM).size(); i++) {
					System.out.println(book.search(bookNM).get(i));
				}
			}else if (command == 5) {
				System.out.println("종료합니덩");
				break;
			}

		}

	}
}
