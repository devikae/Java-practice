package day12_extends_interface.starcraft;

public class HighTempler extends ProtossUnit {
	private int mp = 225;
	
	
	public void psionicStorm() {
		System.out.println("사이오닉 스톰!");
		this.mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("할루시네이션");
		this.mp -= 100;
	}
	
	
	public HighTempler() {
		super("테사다르",0, 40, 0, 0, 50, 150, 40);
	}
	@Override
	public String toString() {
		return "HighTempler [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", mp=" + mp + ", shield=" + getShield()
				+ ", attackRange=" + getAttackRange() + ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas="
				+ getGas() + "]";
	}

	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
}
