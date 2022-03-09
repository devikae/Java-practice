package class_car;

//QUESITION 

//기어 동작, 속도 업다운 가능한 자동차 클래스 만들기 
public class Car {

	String color;
	int gear;
	int fast;
	int hyoyul = 15;
	int km ; //주행거리
	double abledrive =  (km / hyoyul) ; //  주행가능거
	
	void carState() {
		System.out.println("차의 색상: " + color);
		System.out.println("현재 기어: " + gear);
		System.out.println("현재 속도: " + fast +"km/h");
		
	}
	
	void driveState() {
		System.out.println("  연비  : " + hyoyul + "(km/l)");
		System.out.println("주행거리 : " + km + "km");
	}
	
	double ableDrive(int km, int hyohul) {
		return km / hyoyul ; //  주행가능거

	}
	
	void chaneSpeed(int x) {
		fast = x;
	}
	
	void upGear() {
		gear = gear+1;
	}
	
	void downGear() {
		gear = gear -1;
	}

	void setGear(int y) {
		gear = y;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", fast=" + fast + "]";
	}
	
	
	
}