package day12_extends_interface.starcraft;

public class Marine extends StarUnit {
	
	public void stimPack() {
		super.setAttackSpeed(0.5);
		super.setHp(super.getHp() -10);
	}
	
	
	
	public Marine() {
		super("짐레이너", 18, 200, 4, 1.0, 100, 0 );
	}

	@Override
	public String toString() {
		return "Marine [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", attackRange=" + getAttackRange()
				+ ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}

	
	
	
	
	
}
