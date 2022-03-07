package org.opentutorials.javatutorials.television.box;

public class BoxTest {
	public static void main(String[] args) {
		
		//QUESITION 
		// 박스라는 클래스를 정의하고 상자의 가로 세로 높이는 20 20 30입니다 출력하기 
		
		
		Box box = new Box();
		
		box.width = 20;
		box.length = 20;
		box.height = 30;
		
		System.out.println("박스의 가로, 세로, 높이는 " + box.width + ", " + box.length + ", "
							+ box.height+"입니다.");
		
	}
}
