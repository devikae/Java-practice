package day15_thread;

public class ExThread extends Thread {
	
	int num;
	
	ExThread(int num, String name){
		super(name);
		this.num = num;
	}
	
	@Override
	public void run() {
		
		System.out.println(super.getName()); // 현재 실행중인 Thread의 이름 출력
		ThreadMain.printNumbers(num);
	}
}
