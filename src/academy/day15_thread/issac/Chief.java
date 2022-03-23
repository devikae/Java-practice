package day15_thread.issac;

public class Chief extends Thread {
	private Issac issac;

	Chief(Issac issac){
		this.issac = issac;
		
	}
	@Override
	public void run() {
		for(int i =0; i < 10; i++) { // .sleep로 1초에 1번씩 토스트를 만들도록 
			try { 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			issac.makeToast();
		}
	}



}
