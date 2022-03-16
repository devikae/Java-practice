package day12_extends_interface.ramen_abstract;

public class RamenMain {

	public static void main(String[] args) {
//		Ramen ramen = new Ramen("신라면", 1100); 추상 클래스로 선언해 객체를 만들 수 없으니 추상클래스를 상속받는 클래스를 만듬 
		
		JinRamen jinRamen = new JinRamen("진라면", 800);
		System.out.println(jinRamen.toString());
		jinRamen.printRecipe();
		
		BuldakRamen buldak = new BuldakRamen("불닭볶음면", 1200);
		System.out.println(buldak.toString());
		buldak.printRecipe();
		
	}

}
