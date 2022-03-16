package day12_extends_interface.rpg;

public class Megician extends Character {
	private int mp;
	private Jobs job;
	
	public Megician(String name, int damage, int hp, int mp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
		this.mp = mp;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Megician [mp=" + mp + ", 클래스=" + job + "]";
	}

	@Override
	public void attack(Enemy enemy) {
		System.out.println(getName() + " 이(가) " + enemy.getName() + "를 공격 합니다.");
		enemy.setHp(enemy.getHp() - getDamage());
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
		case FIRE:
			System.out.println("메테오");
			setMp(this.mp - 100);
			enemy.setHp(enemy.getHp() - 150);

			if (enemy.getHp() <= 0) {
				enemy.die();
			}
			break;

		case ICE:
			System.out.println("블리자드");
			setMp(this.mp - 150);
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
	
	enum Jobs{
		FIRE,
		ICE
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}
	
}
