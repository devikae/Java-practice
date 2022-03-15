package day11_class.company;

import java.util.ArrayList;

public class Company {
	// 싱글톤(Singleton) 적용 
	
	// 기본 생성자에 private를 붙여 사용할 수 없도록 막는다 
	private Company(){
		
	}
	
	private static Company instance = new Company(); // static영역에 new로 생성되서 instance에 
	
	public static Company getInstance() {
		return instance;
	}
	
	int history; //회사의 역사 
	ArrayList<Worker> workerList = new ArrayList<Worker>();
	
	// 직원 목록 출력 
	public void showList() {
		for(Worker wk : workerList) {
			System.out.println(wk);
		}
	}
	
	//회사 연수가 year만큼 증가 
	public void addHistory(int year) {
		for(Worker wk : workerList) { // 워커리스트 안의 직원들이 하나하나 경력증가 메서드를 실행
			wk.addExp(year);
		}
	}
	
	//사원 해고 
		public void fireWorker(Worker worker) {  // 해고 할 대상을 받아야함 
			System.out.println(worker.getPosition()+ " " + worker.getName() + "을(를) 해고하였습니다.");
			
			workerList.remove(worker);
			
		}
	
	
}//클래스
