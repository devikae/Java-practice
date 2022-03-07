package org.opentutorials.javatutorials.television;

public class Television {
	
	// 텔리비전 이라는 클래스를 정의. 
	
	// 클래스 = 설계도 이제 이 설계도로 작업하려면 객체를 생성해야 한다.
	
	// 텔레비전은 3개의 필드로 이루어진다.
	// 프로그램의 입장에서 보면 새로운 클래스를 정의하는 것은 새로운자료형(type)를 추가하는 것과 같다.
	
	
	int channel;        // 채널
	int volume; 		// 볼륨 
	boolean onOff;		// 전원 상태
	
	// 아래처럼 클래스 자체에 메인을 만들어 선언하면 TelevisionTest를 만드는 것 보다 편리하다.
	public static void main(String[] args) {
		Television tv= new Television();
		tv.channel = 7;
		tv.volume = 10;
		tv.onOff = true;
		System.out.println("텔레비전 채널은 " + tv.channel + "번 이며" +
				" 음량은 " + tv.volume + " 입니다.");
	}
}
