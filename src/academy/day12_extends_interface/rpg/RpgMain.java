package day12_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {

	public static void main(String[] args) {
		Warrior minwoo = new Warrior("민우", 100, 200, Warrior.Jobs.BERSERKER);

		Creep chanung = new Creep("찬웅", 10, 300);

		minwoo.attack(chanung);
		System.out.println("몬스터의 남은 체력" + chanung.getHp());

//		minwoo.skill(chanung);

		Megician a = new Megician("불 마법사", 100, 300, 300, Megician.Jobs.FIRE);

		System.out.println(a.toString());

		Creep monster = new Creep("몬스터1", 10, 200);

//		System.out.println(a.toString());

//		a.attack(monster);
//		a.skill(monster);

		ArrayList<Character> party = new ArrayList<Character>();

		party.add(minwoo);
		party.add(a);

		Creep creep = new Creep("잡몹", 30, 200);
		Boss boss = new Boss("데블몬", 100, 1000);

		// 모든 클래스들은 기본적으로 Object라는 클래스를 상속 받고 있다.( 다만 생략되서 extends가 보이지 않을뿐)

		ArrayList<Object> battleGround = new ArrayList<Object>();
		// warrior -> character -> battleGround
		battleGround.add(minwoo);
		battleGround.add(a);
		battleGround.add(creep);
		battleGround.add(boss);

		for (int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i).toString());
		}

		System.out.println(battleGround.get(0).getClass());
		Object ob = battleGround.get(0);

		minwoo.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(minwoo);
			}
		};

		a.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(a);
			}
		};

		creep.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(creep);
			}
		};

		boss.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(boss);
			}
		};

		a.skill(creep);
		a.attack(creep);

		for (int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i).toString());
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < battleGround.size(); i++) {
				// 각각의 battleGround.get(i) 요스들은 Obj로 형 변환 된 상태

				// instanceof 로 character인지 체크 후에 행동을 입력받는다.

				if (battleGround.get(i) instanceof Character) {
					// 해당 객체를 Character로 형 변환
					Character player = (Character) battleGround.get(i);
					System.out.println(player.getName() + "의 턴 입니다. " + "행동을 선택해주세요.");
					System.out.println("1.공격 | 2. 스킬");
					System.out.print(">>> ");

					int select = Integer.parseInt(sc.nextLine());

					if (select == 1) {
						player.attack(boss);

					} else if (select == 2) {
						player.skill(boss);

					}
				}
			}

			if(! battleGround.contains(boss)) {
				System.out.println("전투에서 승리하였습니다.");
				break;
			}
			
			if(! battleGround.contains(minwoo) && ! battleGround.contains(a) ) {
				System.out.println("전투에서 패배하였습니다.");
				break;
			}
			
			
		}

	}

}
