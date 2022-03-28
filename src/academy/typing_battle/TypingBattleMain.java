package typing_battle;

import java.util.ArrayList;
import java.util.Scanner;

import typing_battle.commons.UtilClass;
import typing_battle.model.DeveloperVO;
import typing_battle.model.WordVO;
import typing_battle.service.TypingBattleService;

public class TypingBattleMain {

	public static void main(String[] args) {
		TypingBattleService service = TypingBattleService.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Typing Battle에 오신 것을 환영 합니다.");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.print(">>>> ");
			
			int select = 0;
			try {
				select = Integer.parseInt(sc.nextLine()); // try문 안에 넣어 숫자만 입력 받도록
			} catch (Exception e) {
				System.out.println("숫자만 입력 해주세요.");
				continue;
			}
			
			if(select == 1) { // 로그인
				System.out.println("아이디를 입력 해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력 해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				
				DeveloperVO dev = service.getDev(id);
				
				if(dev.getDevPw().equals(pw)) { // pw를 불러와 확인
					System.out.println(dev.getDevId() + "님 으로 접속 했습니다.");
					
					// 로그인 이후 프로세스
					while(true) {
						System.out.println(dev.getDevId() + "님 레벨: " + dev.getDevLevel() + " 님 소지금: "+ UtilClass.strMoney(dev.getDevMoney()));
						
						// 행동 입력 받기
						System.out.println("1. 타자 전투 | 2. 상점 | 3. 명예의 전당 | 4. 로그아웃");
						System.out.print(">>> ");
						
						select = 0;
						
						try {
							select = Integer.parseInt(sc.nextLine()); 
						} catch (Exception e) {
							System.out.println("숫자만 입력 해주세요.");
							continue;
						}
						
						if(select == 1) {
							// 타자 전투
							System.out.println("1. 신입 | 2. 초급(Lv10) | 3. 중급(Lv20) | 4. 고급(Lv30) | 5.나가기");
							select = 0;

							try {
								select = Integer.parseInt(sc.nextLine());
							} catch (Exception e) {
								System.out.println("숫자만 입력 해주세요.");
								continue;
							}
							
							// wordVO 담을 리스트 생성
							ArrayList<WordVO> wordList = new ArrayList<WordVO>();
							
							
							
							if(select == 1) {
								// 신입
								wordList = service.getWordList(1); // 레벨 1
								service.playTyping(dev, wordList, sc);
							}else if(select == 2) {
								// 초급
								if(dev.getDevLevel() < 10) {
									System.out.println("레벨 10 이상 부터 입장 가능.");
								}else {
									wordList = service.getWordList(2);
									service.playTyping(dev, wordList, sc);
								}
								
							}else if(select == 3 ) {
								// 중급
								if(dev.getDevLevel() < 20) {
									System.out.println("레벨 20 이상 부터 입장 가능.");
								}else {
									wordList = service.getWordList(3);
									service.playTyping(dev, wordList, sc);
								}
								
							}else if(select == 4) {
								// 고급
								if(dev.getDevLevel() < 30) {
									System.out.println("레벨 10 이상 부터 입장 가능.");
								}else {
									wordList = service.getWordList(4);
									service.playTyping(dev, wordList, sc);
								}
							}else if(select == 5) {
								// 나가기
								continue;
							}else {
								System.out.println("잘못 입력 하셨습니다.");
							}
								
					
						}else if (select == 2) {
							//  상점
							System.out.println("1. 경험치 획득량 증가 (500원) | 2. 돈 획득량 증가 (500원) | 3. 나가기");
							System.out.print(">>> ");
							
							select = 0;
							
							try {
								select = Integer.parseInt(sc.nextLine()); 
							} catch (Exception e) {
								System.out.println("숫자만 입력 해주세요.");
								continue;
							}
							
							if(select == 1) {
								// 경험치 획득량 증가 구매
//								if(dev.getDevMoney() >= 500) {
//									dev.setDevMoney(dev.getDevMoney() - 500);
//									dev.setDevUpgradeExp(dev.getDevUpgradeExp() +1);
//								}else {
//									System.out.println("돈이 부족합니다.");
//								} 메소드로 만듬 서비스 안에 
								service.upgradeExp(dev);
								
							}else if (select == 2) {
								// 돈 획득량 증가 구매
								service.upgradeMoney(dev);
								
							}else if (select == 3) {
								// 나가기
								break;
							}else {
								System.out.println("잘못 입력 하셨습니다.");
							}
							
						}else if (select == 3) {
							//  명예의 전당
							ArrayList<DeveloperVO> devList = service.devList(); // 자동으로 랭킹순으로 정렬된 ArrayList를 얻을 수 있음 
							// List를 for문으로 출력 
							System.out.println("==============================================");
							for(int i = 0; i < devList.size(); i++ ) {
								System.out.println((i+i) + ". "+ devList.get(i).toString());
							}
							
							
							
						}else if (select == 4) {
							//  로그아웃
							int saveResult = service.saveDev(dev);
							if(saveResult > 0) {
								System.out.println("로그아웃 되었습니다.");
								break; // 업데이트문이 잘 되었으니 탈출.
							}else if(saveResult < 0) {
								System.out.println("저장 실패");
							}
							
							
						}else {
							System.out.println("잘못 입력 하셨습니다.");
						}
							
						
						
					}
					
					
				}else {
					System.out.println("회원 정보가 일치하지 않습니다.");
				}
				  
				
			}else if(select == 2) { // 회원가입 
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
				DeveloperVO dev = service.getDev(id);
				
				if(dev.getDevId() != null) { // null이 아니라면 뭐든 한줄이 나온것 >> 중복된 아이디
					System.out.println("중복된 아이디 입니다.");
				}else {  // 중복이 아니니 이 때 회원가입 진행
					int resultCnt = service.registDev(id, name, pw); // 잘 될지 혹시 모르니 int 에 담아 확인 
				
					if(resultCnt > 0) {
						System.out.println("회원가입 완료.");
					}else {
						System.out.println("오류가 발생했습니다.");
					}
				}
				
				
			}else if(select == 3) {
				System.out.println("종료합니다");
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			
			
			
			
			
			
			
			
			

		
		
		}
		
	
	
	}

}
