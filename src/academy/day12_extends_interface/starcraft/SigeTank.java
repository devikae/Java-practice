package day12_extends_interface.starcraft;

public class SigeTank extends StarUnit {
	
	
	public void sigeMode() {
		super.setDamage(150);
		super.setAttackRange(12);
		super.setAttackSpeed(7.0);
		System.out.println("시즈모드 \"ON\"");
	}
	
	public void sigeModeOff() {
		super.setDamage(70);
		super.setAttackRange(8);
		super.setAttackSpeed(4.0);
		System.out.println("시즈모드 \"OFF\"");
	}
	
	public SigeTank() {
		super("듀크", 70, 400, 8, 4.0, 150, 100);
	}

	
	
}
