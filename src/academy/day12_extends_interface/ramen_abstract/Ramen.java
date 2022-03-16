package day12_extends_interface.ramen_abstract;

// 추상 메소드를 가지고 있는 클래스는 꼭 추상 클래스로 선언 해야한다.
// 자체적으로 객체를 만들 수 없다.
public abstract class Ramen {
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 라면의 레시피를 출력해주는 함수 
	// 라면마다 레시피가 다르니 "추상 메소드"로 만든다
	// abstract
	// 추상 메소드를 하나 추가하는 순간 클래스도 추상 클래스가 되어야한다.
	public abstract void printRecipe();
	
	
	
	
	
	@Override
	public String toString() {
		return "Ramen [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
