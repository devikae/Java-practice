package day12_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		Parent daddy = new Parent("민우", 32);
		
		System.out.println(daddy.getName());
		System.out.println(daddy.getAge());
		daddy.sayHello();
		System.out.println(daddy.toString());
		
		Child child = new Child("유진",20);
		
		System.out.println(child.getName());
		System.out.println(child.getAge());
		// 부모가 가지고 있던 public 메소드를 사용 할 수 있다 
		child.sayHello(); // Override를 해서 어른이올시다로 나오던게 어린이입니다 로 출력
		System.out.println(child.toString());
	}

}
