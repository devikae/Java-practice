package day11_class.next_it;

/**
 * 실행(main 메소드)만 하는 클래스 
 * @author dev-ikae
 */
public class NextitMain {
	public static void main(String[] args) {
		Student st1 = new Student();			//Student 클래스 st1이라는 객체 선언
		
		// 객체의 속성 설정
		st1.name = "권나라";
		st1.stress = 0;
		st1.level =1;
		
		System.out.println(st1.name);
	
		st1.state();
		System.out.println(st1.toString());
		
		st1.goToSchool();
		System.out.println(st1.stress);
		
		st1.eatLunch();
		
		st1.goToHome();
		
		// 필드값을 입력받는 생성자로 객체 선언 

		Student st2 = new Student("박서준", 0, 1);
		st2.state();
		
		Student st3 = new Student();
		
		
		
	}// 메인 괄호 
	
	
}
