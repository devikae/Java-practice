package day11_class.bet_card2;

public class Result {
	
	public static void play1Win(String play1name, String play2name) {
		System.out.println("========================================");
		System.out.println("           V I C T O R Y           ");
		System.out.println("========================================");
		System.out.println("Winner "+ "play1 "+ play1name );
		System.out.println(play2name + " 님을 패가망신 시켰습니다.");
	}
	
	public static void play2Win(String play1name, String play2name) {
		System.out.println("========================================");
		System.out.println("           V I C T O R Y           ");
		System.out.println("========================================");
		System.out.println("Winner "+ "play2 "+ play2name );
		System.out.println(play1name + " 님을 패가망신 시켰습니다.");
	}
	
	public static void allRight(String play1name, String play2name, int p1money, int p2money) {
	System.out.println("        축하합니다                   ");
	System.out.println("        "+ play1name + "님 " + play2name + "님 ");
	System.out.println("        두분 다 맞추셨습니다.              ");
	System.out.println();
	System.out.println("play1 " + play1name + "님의 보유금: " + p1money);
	System.out.println("play2 " + play2name + "님의 보유금: " + p2money);
	System.out.println();

	}
	
	public static void p1Right(String play1name, String play2name, int p1money, int p2money) {
		System.out.println("        축하합니다                   ");
		System.out.println("        " + play1name + "님 ");
		System.out.println();
		System.out.println("play1 " + play1name + "님의 보유금: " + p1money);
		System.out.println("play2 " + play2name + "님의 보유금: " + p2money);
		System.out.println();

	}
	
	public static void p2Right(String play1name, String play2name, int p1money, int p2money) {
		System.out.println("        축하합니다                   ");
		System.out.println("        " + play2name + "님 ");
		System.out.println();
		System.out.println("play1 " + play1name + "님의 보유금: " + p1money);
		System.out.println("play2 " + play2name + "님의 보유금: " + p2money);
		System.out.println();

	}
	
	public static void allWhrong(String play1name, String play2name, int p1money, int p2money) {
		System.out.println("        축하합니다 ㅋㅋ                ");
		System.out.println("        "+play1name + "님 " + play2name + "님 ");
		System.out.println("        두분 다 \"못\" 맞추셨습니다ㅋㅋ          ");
		System.out.println();
		System.out.println("play1 " + play1name + "님의 보유금: " + p1money);
		System.out.println("play2 " + play2name + "님의 보유금: " + p2money);	
		System.out.println();
	}
	
	
	public static void rule() {
		System.out.println();
		System.out.println();
		System.out.println("***Rule***");
		System.out.println("com1과 com2가 카드를 랜덤으로 뽑습니다.");
		System.out.println("com1의 승/패 를 예측해주세요 ");
		System.out.println("무승부도 있습니다.");
		System.out.println("적중 시 >>>  승/패 = 배팅머니의 2배 무승부 4배");
		System.out.println("더 많은 돈을 가지고 있는 플레이어가 승리 합니다. ");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
}
