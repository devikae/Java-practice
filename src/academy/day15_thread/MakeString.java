package day15_thread;

public class MakeString {
	public static void main(String[] args) {
		// 문자열을 아주 길게 만들어보자
		String result = "";
//		StringBuffer sbResult = new StringBuffer("");    //동기화 지원
		StringBuilder sbResult = new StringBuilder("");  // 동기화 미지원해서 데이터 손실남 
		
		
//		for(int i=0; i<50000000; i++) {
////			result += (int) (Math.random()*10); //0~9까지의 숫자 
//			
//			sbResult.append( (int)(Math.random()*10) );
//			
//			if( i % 1000000 == 0) {
//				System.out.println(i + "..."); // 작업 처리 현황 보기위해 
//			}
//		}
		// 스트링으로 이런 장난을 치면 힙에 가비지 메모리가 쌓인다 버퍼를 이용하
//		System.out.println(result.length());
//		System.out.println(sbResult.length());
	
		Thread thread1 = new Thread(()-> {for(int i=0; i<50000000; i++) {
			
			sbResult.append( (int)(Math.random()*10) );
			
			if( i % 1000000 == 0) {
				System.out.println(i + "..."); // 작업 처리 현황 보기위해 
				}
			}
			System.out.println("Result =" + sbResult.length());

		}, "노예1");

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 50000000; i++) {

				sbResult.append((int) (Math.random() * 10));

				if (i % 1000000 == 0) {
					System.out.println(i + "..."); // 작업 처리 현황 보기위해
				}
			}
			System.out.println("Result =" + sbResult.length());

		}, "노예2");

		thread1.start();
		thread2.start();
		
	
	}
}
