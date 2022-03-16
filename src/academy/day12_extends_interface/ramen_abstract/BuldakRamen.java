package day12_extends_interface.ramen_abstract;

public class BuldakRamen extends Ramen {

	public BuldakRamen(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물을 버리 액상 스프를 넣어 비벼 드십셔.");
	}

}
