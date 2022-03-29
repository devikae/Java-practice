package submit4;

import java.util.ArrayList;
import java.util.Scanner;

import submit4.model.Board;
import submit4.model.MemberVO;
import submit4.service.BoardService;
import submit4.service.MemberService;

public class HomepageMain {

	public static void main(String[] args) {
		MemberService memService = MemberService.getInstance();
		BoardService bService = BoardService.getInstance();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.print(">>>> ");

			int select = 0;
			try {
				select = Integer.parseInt(sc.nextLine()); // try문 안에 넣어 숫자만 입력 받도록
			} catch (Exception e) {
				System.out.println("숫자만 입력 해주세요.");
				continue;
			}

			if (select == 1) { // 로그인
				System.out.println("아이디를 입력 해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력 해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				MemberVO mem = memService.getMem(id);

				if (mem.getMemPw().equals(pw)) { // pw를 불러와 확인
					System.out.println(mem.getMemId() + "님 으로 접속 했습니다.");

					ArrayList<Board> boardList = bService.boardList();

					for (int i = 0; i < boardList.size(); i++) {
						System.out.println(boardList.get(i));
					}

					while (true) {
						// 행동 입력 받기
						System.out.println("1. 글 쓰기 | 2. 글 조회 | 3. 로그아웃 ");
						System.out.print(">>> ");

						select = 0;

						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력 해주세요.");
							continue;
						}

						if (select == 1) {
							// 글 쓰기
							System.out.println("글 제목을 입력 해주세요.");
							System.out.print(">>> ");
							String title = sc.nextLine();
							System.out.println("글 내용을 입력 해주세요.");
							System.out.print(">>> ");
							String content = sc.nextLine();

//							Board board = new Board(title, content, mem.getMemId());

							bService.write(title, content, mem.getMemId());

						} else if (select == 2) {
							System.out.println("글 번호를 입력 해주세요.");
							System.out.print(">>> ");
							String bNum = sc.nextLine();

							int titleNum = Integer.parseInt(bNum);

							boardList = bService.boardList();

							for (int i = 0; i < boardList.size(); i++) {
								if (boardList.get(i).getbNum() == titleNum) {
									bService.printList(boardList.get(i).getbTitle(), boardList.get(i).getbWriter(),
											boardList.get(i).getbDate(), boardList.get(i).getbContent());
								}
							}
							for (int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}

						} else if (select == 3) {
							System.out.println("로그아웃 합니다");
							break;
						}
					}

				}

			} else if (select == 2) { // 회원가입
				System.out.println("아이디를 입력 해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("이름을 입력 해주세요.");
				System.out.print(">>> ");
				String name = sc.nextLine();
				System.out.println("비밀번호를 입력 해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				// 회원가입 하는 구간에서 불러옴
				MemberVO mem = memService.getMem(id);

				if (mem.getMemId() != null) { // null이 아니라면 뭐든 한줄이 나온것 >> 중복된 아이디
					System.out.println("중복된 아이디 입니다.");
				} else { // 중복이 아니니 이 때 회원가입 진행
					int resultCnt = memService.registMem(id, pw, name); // 잘 될지 혹시 모르니 int 에 담아 확인

					if (resultCnt > 0) {
						System.out.println("회원가입 완료.");
					} else {
						System.out.println("오류가 발생했습니다.");
					}
				}
			} else if (select == 3) {
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
