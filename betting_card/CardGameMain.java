package day11_class.betting_card;

import java.util.Scanner;

public class CardGameMain {

	public static void main(String[] args) {
		System.out.println(" ,-┏━────────────┐\n" +
						     " ┃│ ◆6                    │ \n" + 
						     " ┃│                        │ \n" + 
						     " ┃│                        │ \n" + 
						     " ┃ │       B L I N D     │ \n" + 
						     " ┃│                        │ \n" + 
						     " ┃│                        │ \n" + 
						     " ┃│                        │ \n" + 
						     " ┃ │         C A R D     │ \n" + 
						     " ┃│                        │ \n" +
						     " ┃│                        │ \n" +
						     "  \\│                     ◆9│  \n" +
						     "   \\ _______________________ |  \n" 
						      );
		User play1 = new User();
		User play2 = new User();
		System.out.println("Rule 1 : 2~9의 카드가 랜덤으로 획득 됩니다.");
		System.out.println("Rule 2 : 서로 배팅을 하면 카드를 오픈 합니다.");
		System.out.println("Rule 3 : 큰 수의 카드를 가진 플레이어가 승리합니다.");
		System.out.println("Rule 4 : 숫자 카드 \"2\"는 \"9\"카드를 이길 수 있습니다.");
		System.out.println();
		System.out.println();
		
		System.out.print("Play 1 이름 입력: ");
		   Scanner p1name = new Scanner(System.in);
		   play1.name = p1name.nextLine();
		   System.out.println();
		   System.out.println();
		   System.out.println("--play 1 이름 입력 완료--" );
		   System.out.println();
		   System.out.println();
		   
		System.out.print("Play 1 시작 금액 입력: ");
			Scanner p1money = new Scanner(System.in);
			play1.money = p1money.nextInt();
			System.out.println();
			System.out.println();
			System.out.println("--play 1 금액 충전 완료--");
			System.out.println();
			System.out.println();
			System.out.println("======================");
			play1.State1();
			System.out.println("======================");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		System.out.print("Play 2 이름 입력: ");
		   Scanner p2name = new Scanner(System.in);
		   play2.name = p2name.nextLine();
		   System.out.println();
		   System.out.println();
		System.out.println("--play 2 이름 입력 완료--" );
			System.out.println();
			System.out.println();
		System.out.print("Play 2 시작 금액 입력: ");
			Scanner p2money = new Scanner(System.in);
			play2.money = p2money.nextInt();
		System.out.println("--play 2 금액 충전 완료--");	
		System.out.println();
		System.out.println();
			
		System.out.println("======================");
		play2.State2();
		System.out.println("======================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
		int round =0;
		System.out.print("라운드 입력 >>> ");
		 Scanner r = new Scanner(System.in);
		round = r.nextInt();
		
		int play1bet;
		int play2bet;
		
		System.out.println("게임을 " +round + "회 진행 하겠습니다.");
		
		for(int i = 1; i <round + 1; i++) {
			System.out.println("===============================");
			System.out.println("          " + i + "Round");
			System.out.println("===============================");
			
			play1.card = (int) (Math.random() * 8 + 1);
			play2.card = (int) (Math.random() * 8 + 1);
			
			Card cd = new Card();
			cd.backCard();
			
			System.out.print("play1 " + play1.name + " 배팅 금액 입력>>> ");
			Scanner betmoney = new Scanner(System.in);
			play1bet = betmoney.nextInt();
				
			
			System.out.println();
			System.out.println();
			
			System.out.print("play2 " + play2.name + " 배팅 금액 입력>>> ");
			play2bet = betmoney.nextInt();
			
			
			
			if(play1.card > play2.card) {
				System.out.println("play1 " + play1.name + " 승리");
				play1.money += play2bet;
				play2.money -= play2bet;
				System.out.println("[보유 금액] play1 "+play1.name + " " + play1.money + "원");
				System.out.println("[보유 금액] play2 "+play2.name + " " + play2.money + "원");
				System.out.println("=========플레이어 1의 승리 카드=============");
				cd.printCard(play1.card);
				System.out.println("=========플레이어 2의 패배 ㅋㅋ 카드=========");
				cd.printCard(play2.card);
				if(play2.money <= 0) {
					System.out.println("========================================");
					System.out.println("           V I C T O R Y           ");
					System.out.println("========================================");
					System.out.println("Winner "+ "play1 "+ play1.name );
					System.out.println(play2.name + " 님을 패가망신 시켰습니다.");
					break;
				}
			}else if(play2.card > play1.card) {
				System.out.println("play2 " + play2.name + " 승리");
				play2.money += play1bet;
				play1.money -= play1bet;
				System.out.println("[보유 금액] play1 "+play1.name + " " + play1.money + "원");
				System.out.println("[보유 금액] play2 "+play2.name + " " + play2.money + "원");
				System.out.println("=========플레이어 2의 승리 카드=============");
				cd.printCard(play2.card);
				System.out.println("=========플레이어 1의 패배 ㅋㅋ 카드=========");
				cd.printCard(play1.card);
				if(play1.money <= 0) {
					System.out.println("========================================");
					System.out.println("           V I C T O R Y           ");
					System.out.println("========================================");
					System.out.println("Winner "+ "play2 "+ play2.name );
					System.out.println(play1.name + " 님을 패가망신 시켰습니다.");
					break;
					
				}
			}else if(play1.card == play2.card ) {
				System.out.println("무승부 ㅋㅋ");
			}else if(play1.equals(2) && play2.equals(9)) {
				play1.money += play2bet;
				play2.money -= play2bet;
				System.out.println("play 1 SLAYER \"9\" !!! ");
				System.out.println("[보유 금액] play1 "+play1.name + " " + play1.money + "원");
				System.out.println("[보유 금액] play2 "+play2.name + " " + play2.money + "원");
				cd.printCard(play1.card);
			}else if(play1.equals(9) && play2.equals(2)) {
				System.out.println("play 2 SLAYER \"9\" !!! ");
				play2.money += play1bet;
				play1.money -= play1bet;
				System.out.println("[보유 금액] play1 "+play1.name + " " + play1.money + "원");
				System.out.println("[보유 금액] play2 "+play2.name + " " + play2.money + "원");
				cd.printCard(play2.card);
			}
		}//for문
		
//		if(play1.money > play2.money) {
//			System.out.println("========================================");
//			System.out.println("           V I C T O R Y           ");
//			System.out.println("========================================");
//			System.out.println("Winner "+ "play1 "+ play1.name );
//			System.out.println(play2.name + " 님을 패가망신 시켰습니다.");
//		}else if(play1.money < play2.money){
//			System.out.println("========================================");
//			System.out.println("           V I C T O R Y           ");
//			System.out.println("========================================");
//			System.out.println("Winner "+ "play2 "+ play2.name );
//			System.out.println(play1.name + " 님을 패가망신 시켰습니다.");
//		}
	}// main
}