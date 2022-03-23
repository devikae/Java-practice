package day15_thread;

public class ExRunnable implements Runnable{
	
	int num;
	
	ExRunnable(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		// 현재 실행중인 Thread의 이름을 출력하고 싶다면? 1번 방법과 다르다 
		
		System.out.println(Thread.currentThread().getName());
		ThreadMain.printNumbers(num);
	}

}
