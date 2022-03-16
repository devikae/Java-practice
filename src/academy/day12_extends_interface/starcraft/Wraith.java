package day12_extends_interface.starcraft;

public class Wraith extends StarUnit {
	int mana =250;
	boolean cloaking = false;
	
	public void cloaking() {
		cloaking = true;
		mana = -50;
		System.out.println("클로킹 \"ON\"");
	}
	
	public void cloakingOff() {
		cloaking = false;
		System.out.println("클로킹 \"OFF\"");
	}

	public Wraith() {
		super("레이스",10,150, 7, 1.0, 150, 100);
	}

	@Override
	public String toString() {
		if(cloaking) {
			return super.toString() + "mana= " + mana + ", cloaking= " + "ON" + "]";
		}else{
			return super.toString() + "mana= " + mana + ", cloaking= " + "OFF" + "]";
		}
	}
	
	
	
	
	
}
