package day11_class.bet_card2;

import java.util.Scanner;

public class Bet_Card2 {
	
	
	public static void main(String[] args) {
		System.out.println("⣿⣿⣿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							  "⣿⣿⣿⣿⣿⡿⠁⠀⠀⠉⠛⠿⣿⣿⣿⣿\n" + 
							  "⣿⣿⣿⣿⣿⠃⠘⠀⠀⠀⠀⠀⠀⠉⢻⣿\n" + 
							  "⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿\n" + 
							  "⣿⣿⣿⠏⠀⠀⢠⣴⣶⠀⠀⠀⠀⣼⣿⣿\n" + 
							  "⣿⣿⡏⠀⠀⠀⠈⡍⠛⠀⠀⠀⣼⣿⣿⣿\n" + 
							  "⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿\n" + 
							  "⣿⣅⡀⠀⠀⠀⠀⠀⢀⠀⢰⣿⣿⣿⣿⣿\n" + 
							  "⣿⣿⣿⣷⣦⣄⡀⠀⠒⢠⣿⣿⣿⣿⣿⣿\n" + 
							  "⣿⣿⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿\n" + 
							  " B E T C A R D 2");
		
		
		Result.rule();
				                                                                     
		User play1 = new User();
		User play2 = new User();

		int com1, com2;

		System.out.print("Play 1 이름 입력: ");
		Scanner p1name = new Scanner(System.in);
		play1.name = p1name.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("--play 1 이름 입력 완료--");
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
		System.out.println("--play 2 이름 입력 완료--");
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

		int round = 0;
		System.out.print("라운드 입력 >>> ");
		Scanner r = new Scanner(System.in);
		round = r.nextInt();

		int play1bet;
		int play2bet;

		int play1pick;
		int play2pick;
		Scanner playerpick = new Scanner(System.in);

		System.out.println("게임을 " + round + "회 진행 하겠습니다.");

		for (int i = 1; i < round + 1; i++) {
			System.out.println("===============================");
			System.out.println("          " + i + "Round");
			System.out.println("===============================");

			com1 = (int) (Math.random() * 8 + 1);
			com2 = (int) (Math.random() * 8 + 1);

			Card cd = new Card();
			cd.backCard();

			System.out.print("play1 " + play1.name + " 배팅 금액 입력>>> ");
			Scanner betmoney = new Scanner(System.in);
			play1bet = betmoney.nextInt();
			play1.money -= play1bet;
			System.out.println("com1의 승패를 예측 해주세요 ( 1:승리 | 2:패배 | 3:무승부 )");
			System.out.print(play1.name + "의 픽 >>> ");
			play1pick = playerpick.nextInt();

			System.out.println();
			System.out.println();

			System.out.print("play2 " + play2.name + " 배팅 금액 입력>>> ");
			play2bet = betmoney.nextInt();
			play2.money -= play2bet;
			System.out.println("com1의 승패를 예측 해주세요 (1:승리 | 2:패배 | 3:무승부)");
			System.out.print(play2.name + "의 픽 >>> ");
			play2pick = playerpick.nextInt();

			if (com1 > com2) {
				System.out.println("com1 승리");
				System.out.println("========com1의 카드=============");
				cd.printCard(com1);
				System.out.println("========com2의 카드=============");
				cd.printCard(com2);

				if (play1pick == 1 && play2pick == 1) { // 둘 다 맞췄을 때
					play1.money += (play1bet * 2);
					play2.money += (play2bet * 2);

					Result.allRight(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
					
					

				} else if (play1pick == 1 && play2pick == 2) { // play1만 맞췄을 때
					play1.money += (play1bet * 2);
					
					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 1 && play2pick == 3) {
					play1.money += (play1bet * 2);

					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 2 && play2pick == 1) {
					play2.money += (play2bet * 2);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				} else if (play1pick == 3 && play2pick == 1) {
					play2.money += (play2bet * 2);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else {

					Result.allWhrong(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				}

			}else if (com1 < com2) {
				System.out.println("com2 승리");
				System.out.println("========com2의 카드=============");
				cd.printCard(com2);
				System.out.println("========com1의 카드=============");
				cd.printCard(com1);

				if (play1pick == 2 && play2pick == 2) { 
					play1.money += (play1bet * 2);
					play2.money += (play2bet * 2);

					Result.allRight(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				}else if (play1pick == 2 && play2pick == 1) {
					play1.money += (play1bet * 2);

					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 1 && play2pick == 2) {
					play2.money += (play2bet * 2);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 2 && play2pick == 3) {
					play1.money += (play1bet * 2);
					
					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				} else if (play1pick == 3 && play2pick == 2) {
					play2.money += (play2bet * 2);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else {

					Result.allWhrong(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				}

			} else if (com1 == com2) {
				System.out.println("==============무승부============");
				System.out.println("========com1의 카드=============");
				cd.printCard(com1);
				System.out.println("========com2의 카드=============");
				cd.printCard(com2);

				if (play1pick == 3 && play2pick == 3) {
					play1.money += (play1bet * 4);
					play2.money += (play2bet * 4);

					Result.allRight(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				} else if (play1pick == 3 && play2pick == 1) {
					play1.money += (play1bet * 4);

					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				} else if (play1pick == 1 && play2pick == 3) {
					play2.money += (play2bet * 4);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 2 && play2pick == 3) {
					play2.money += (play2bet * 2);

					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}

				} else if (play1pick == 3 && play2pick == 1) {
					play1.money += (play1bet * 4);

					Result.p2Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else if (play1pick == 3 && play2pick == 2) {
					play1.money += (play1bet * 4);

					Result.p1Right(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				} else {

					Result.allWhrong(play1.name, play2.name, play1.money, play2.money);
					
					if (play2.money <= 0) {
						Result.play1Win(play1.name, play2.name);

						break;

					}else if (play1.money <= 0) {
						Result.play2Win(play1.name, play2.name);

						break;
						
				
					}
				}

			}

		}
		
		if(play1.money > play2.money) {
			Result.play1Win1(play1.name, play2.name);
		}else if(play1.money < play2.money){
			Result.play2Win2(play1.name, play2.name);
		}
		
		
	}
	

}