package day12_extends_interface.rpg;

public class Boss extends Enemy {

	public Boss(String name, int damage, int hp) {
		super(name, damage, hp);
		talk();
	}

	@Override
	public void talk() {
		System.out.println("건방지누 게이야 여기까지 왔누");
	}

}
