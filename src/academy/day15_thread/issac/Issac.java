package day15_thread.issac;

public class Issac extends Thread {
	private int toast = 0;
	
	public synchronized void makeToast() { // 동기화 끝 
		// 토스트 만드는 메소드  
		toast +=1; //실행시 토스트 1개 추가 
		System.out.println("토스트를 만들엇습니다."+"\n재고수량: " + toast);
		
		// wait set 에서 대기중인 임의의 스레드 "하나"를 깨운다
//		notify(); 
		
		// Wait Set에서 대기중인 임의의 스레드 "전부"를 깨운다
		notifyAll();
		
	}
	
	public synchronized void buyToast(String name, int count) { //구매 메소드 
		if(toast < count) {
			try {
				wait(); // 스레드를 깨울 때 까지 (notify할때 까지 ) 해당 스레드는 대기.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(toast >= count){
			toast -= count;
			System.out.println(name + " 에게 토스트를" + count +"개 팔았습니다." + "\n재고수량: " + toast );
		}else {
			// 재귀 함수 사용 
			// makeToast가 notify()를 실행해서 wait()중인 현재 스레드를 깨워도 
			// toast가 count보다 적으면 함수를 다시 실행해서 위에 wait 걸리도록
			buyToast(name,count); 
		}
	}
	
	
	
}
