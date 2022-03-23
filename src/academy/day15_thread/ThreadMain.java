package day15_thread;

public class ThreadMain {
	public static void main(String[] args) {
//		printNumbers(1);
//		printNumbers(20);
		// 기본적으로 스레드를 나눠주지 않으면 위에서 부터 코드가 실행 된다.
		
		System.out.println("\n==================================================");
		
		// 1.Thread를 상속(extends)받은 클래스를 이용해서 멀티 스레드를 구현하는 방법.
		ExThread exThread = new ExThread(100, "노예1");
		exThread.start();
		
		ExThread exThread2 = new ExThread(200, "노예2");
		exThread2.start();
		
		// 2. Runnable 인터페이스를 구현(implements)한 클래스를 이용
		ExRunnable exRunnable = new ExRunnable(300); 
		Thread exThread3  = new Thread(exRunnable, "노예3"); // ,후에 "이름" 을 붙여주면 이름 변경 가능
		exThread3.start();
	
		// 위의 3줄짜리를 이렇게 한번에 작성 가능 
		Thread exThread4 = new Thread(new ExRunnable(400), "노예4");
		exThread4.start(); 
		
		// 3. 람다식 사용법
		Thread exThread5 = new Thread( () -> {Thread.currentThread().getName(); printNumbers(500);} 
				,"노예5")  ;
		exThread5.start();
		
		//
		System.out.println("MainThread : 난 놀아야지");
		
		
		
		
	}
	
	
	// 입력받은 숫자부터 +5까지 콘솔창에 숫자 출력
	static void printNumbers(int num) {
		for(int i = num; i<num + 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);  // 실행에 텀을 주고 싶은 경우 사용 500 = 0.5초 
									   // sleep() ()안에는 밀리초 단위 숫자   
									   // 현재 이 코드를 실행중인 스레드를 멈추는 것으로 다른 스레드는 영향 받지 않는다
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}
