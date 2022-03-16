package day12_extends_interface.rpg;

public class Warrior extends Character {

	private Jobs job;
	
	public Warrior(String name, int damage, int hp, Jobs job) { // job도 받아야함
		// 부모 생성자인 super()가 자식 생성자 가장 위에 있어야 한다.
		super(name, damage, hp);
		this.job = job; // 생성자에 파라미터로 들어온 job
	}

	// 전사는 공격 시 2배의 데미지를 주고 싶다면?
	// Ctrl + space
	@Override
	public void attack(Enemy enemy) {
		System.out.println(getName() + " 이(가) " + enemy.getName() + "를 공격 합니다.");
		enemy.setHp(enemy.getHp() - getDamage() * 2);
		super.setHp(super.getHp() - enemy.getDamage());

		if (enemy.getHp() <= 0) {
			enemy.die();
		}

		if (getHp() <= 0) {
			die();
		}
	}

	@Override
	public void skill(Enemy enemy) {
		switch (job) {
		case BERSERKER:
			System.out.println("파워 스트라이크");
			enemy.setHp(enemy.getHp() - 150);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;

		case WARLORD:
			System.out.println("버스트 캐논");
			enemy.setHp(enemy.getHp() - 200);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;

		default:
			System.out.println("직업이 없습니다.");
			break;
		}
	}

	// enum 클래스 (값이 없지만 사용됨)
	// Constants (<< 값과 타입이 들어있음) 처럼 사용  
	// 열거형 클래스 
	// inner 클래스
	enum Jobs{
		BERSERKER,
		WARLORD
	}
	
}
