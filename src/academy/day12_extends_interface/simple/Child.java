package day12_extends_interface.simple;

public class Child extends Parent{
	// Parnet 상속는받다면 extends 상속해주는 클래스
	
	public Child(String name, int age) {
		super(name, age);
		//super() 는 부모 클래스의 생성자
		
	}
	// 부모가 가진 메소드를 그냥 사용할 수 도 있지만 
	// Override(재정의) 해서 사용할 수 있다. 
	@Override
	public void sayHello() {
		System.out.println("안녕하세요, 어린이 입니다.");
	}
	@Override
	public String toString() {
		return super.toString();
		// super는 부모클래스를 의미하며 .을 찍으면 
		// public인 필드변수나 메소드를 사용할 수 있다.
	}
	
}
