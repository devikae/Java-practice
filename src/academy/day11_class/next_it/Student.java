package day11_class.next_it;

public class Student {
	String name;		// 학생의 이름 
	int stress;		// 학생의 스트레스 지수 
	int level;			// 학생의 레벨
	
	//생성자를 따로 만든 후에 기본생성자를 만들고자 한다면 따로 만들어 주어야 한다 
	
	Student(){
		System.out.println("나 등장");
	}
	
	 Student(String name, int stress, int level) {
		super();
		this.name = name;
		this.stress = stress;
		this.level = level;
		
		System.out.println(name + " 두두등장");
		
	}

	@Override
	public String toString() {
		return "Student [이름= " + name + ", 스트레스지수= " + stress + ", 레벨= " + level + "]";
	}
	
	void state() {
		System.out.println("==========================");
		System.out.println("이름 : " + name);
		System.out.println("스트레스지수 : " + stress);
		System.out.println("레벨 : " + level);
		System.out.println("==========================");
	}
	
	public void goToSchool() {
		System.out.println(name + "씨가 학원에 도착 했습니다.");
		stress += 100;
	}
	
	public void eatLunch() {
		System.out.println(name + "씨가 점심을 먹습니다.");
		stress -= 50;
	}
	
	public void goToHome() {
		System.out.println(name + "씨가 집으로 귀가 합니다.");
		stress -= 0;
		
		levelUp();
	}
	
	private void levelUp() {     // Student클래스 에서는 마음껏 쓸 수 있지만 NextitMain 에서는 사용할 수 없다 private 접근 제어자 때문에
		int randInt =(int) (Math.random() * 5) +1;
		level += randInt;
		System.out.println(name + "씨의 레벨이 " + randInt + "만큼 상승 하였습니다.");
	}
	
//	//메소드 오버로딩 값 받는게 다르면 
//	Student(String name, int level){
//		this();
//		this.name = name;
//		this.stress = 0;
//		this.level = level;
//	}
}
