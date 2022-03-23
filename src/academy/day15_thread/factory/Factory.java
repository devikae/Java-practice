package day15_thread.factory;

public class Factory {
	int countNoodle = 0; // 생산된 면 
	int countSoup = 0;  // 생산된 스프
	int count = 0;	  //  생산된 라면 
	
	public EndFactory endFactory;
	
	
	public synchronized void makeNoodle() {
		System.out.println("면을 만들었습니다. \n면의 재고: "+countNoodle);
		countNoodle++;
		
		notify();
	}
	
	public synchronized void makeSoup() {
		System.out.println("스프를 만들었습니다. \n스프 수량: "+countSoup);
		countSoup +=2;
		
		notify();
	}
	
	public synchronized void packing() { // 포장 메소드 이삭과 다르게 여기
		if(countNoodle > 0 && countSoup > 0) {
			countNoodle --;
			countSoup --;
			count++;
			
			System.out.println("라면을 완성했습니다. \n 라면 재고: "+count);
		
			if(count == 10) { // 라면10개 만들면 공장 가동 중지함 
				endFactory.theEnd();
				return;
			}
		
		
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 수량이 부족할때만 다시 돌림
		packing(); // 재귀함수.  다시 호출
	}
	
	
	
}
