package day12_extends_interface.starcraft;

public class Zealot extends ProtossUnit{
	
	
	
	
	
	public Zealot() {
		super("제라툴", 16, 100, 1, 1.5, 100, 0, 60);
	}
	
	
	
	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + super.getDamage() + ", hp=" + getHp() + ", shield=" + super.getShield() + ", attckRange="
				+ super.getAttackRange() + ", attckSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
		// super. 이나 get을 써서 부모 개체에 접근해 가지고 옴, shield는 선언해줬기 때문에 그대로 
	}
	
	
	
	
}
