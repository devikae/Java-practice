package day12_extends_interface.rpg;

public class Creep extends Enemy {

	public Creep(String name, int damage, int hp) {
		super(name, damage, hp);
		talk(); // 크립이 생성될 때 대사치기
	}

	@Override
	public void talk() {
		System.out.println("크르르르릉");
	}
	
}
