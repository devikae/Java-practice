package day12_extends_interface.ramen_abstract;

public class JinRamen extends Ramen{

	public JinRamen(String name, int price) {
		super(name, price);
	}

	// 상속 받은 추상 클래서의 추상 메소드를 반드시 
	// 재 정의 해줘야 한다(Override)
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 3분 후 드십셔.");
	}
	
}
