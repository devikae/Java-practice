package day15_thread.factory;

public class Noodle implements Runnable{
	Factory factory;
	
	Noodle(Factory factory){
		this.factory = factory;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			factory.makeNoodle();
		}
	}

}