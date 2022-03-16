package day12_extends_interface.lol;

	// 인터페이스를 구현(implement) 하기 위해서는 extends가 아닌 
	// implements 를 사용한다
	// 자바에서는 기본적으로 다중 상속이 불가능하다.
	// extends 뒤에 한 개의 클래스만 허용한다
	// 인터페이스는 다중 구현이 가능하다 >> implements뒤에 여러개의 클래 허용 
public class Shen extends Champion implements Lol_interface, Voice_interface{

	public Shen(String name, int hp, int damage) {
		super(name, hp, damage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skillQ() {
		System.out.println("황혼 강습");
		System.out.println("쉔의 다음 기본 공격 3회는 ?+최대 체력의 ?에 해당하는 마법 피해를 입힙니다. ");
	}

	@Override
	public void skillW() {
		System.out.println("의지의 결계");
	}

	@Override
	public void skillE() {
		System.out.println("그림자 돌진");
		System.out.println("돌진해 적 챔피언과 정글 몬스터를 도발하고 물리 피해를 입힙니다.");
	}

	@Override
	public void skillR() {
		System.out.println("단결된 의지");
	}

	@Override
	public void speak() {
		System.out.println("넌 이미 죽어있다.");
	}
	
	
	
}
