package org.opentutorials.javatutorials.television;

public class TelevisionTest {
	// Television 클래스를 테스트 하기 위한 목적으로 만든 class 
	
	public static void main(String[] args) {
		Television tv = new Television(); // Television이 하나의 새로운 데이터 타입  > tv에 담음
//			       객체는 new 연산자로 생성된다.
//Television 클래스의 객체를 참조할 수 있는 변수 tv 를 선언한다.

		
		
// 객체 1		
		tv.channel = 7;
		tv.volume = 10;
		tv.onOff = true;
		System.out.println("텔레비전 채널은 " + tv.channel + "번 이며" +
							" 음량은 " + tv.volume + " 입니다.");
		
		
		
		
// 객체 2		
		Television yourtv = new Television();
		
		yourtv.channel = 10;
		yourtv.volume = 15;
		tv.onOff = true;
		
		
		System.out.println("나의 텔레비전 채널은 " + tv.channel + "번 이며" +
				" 음량은 " + tv.volume + " 입니다."); 
		System.out.println("너의 텔레비전 채널은 " + yourtv.channel + "번 이며" +
				" 음량은 " + yourtv.volume + " 입니다.");
		
	}

}
