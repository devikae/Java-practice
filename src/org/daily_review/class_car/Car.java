package class_car;

//QUESITION 

//��� ����, �ӵ� ���ٿ� ������ �ڵ��� Ŭ���� ����� 
public class Car {

	String color;
	int gear;
	int fast;
	int hyoyul = 15;
	int km ; //����Ÿ�
	double abledrive =  (km / hyoyul) ; //  ���డ�ɰ�
	
	void carState() {
		System.out.println("���� ����: " + color);
		System.out.println("���� ���: " + gear);
		System.out.println("���� �ӵ�: " + fast +"km/h");
		
	}
	
	void driveState() {
		System.out.println("  ����  : " + hyoyul + "(km/l)");
		System.out.println("����Ÿ� : " + km + "km");
	}
	
	double ableDrive(int km, int hyohul) {
		return km / hyoyul ; //  ���డ�ɰ�

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