package class_car;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "red";
		myCar.gear = 1;
		myCar.fast = 80;
		
		myCar.carState();
		
		System.out.println("===========���� ����============");
		myCar.setGear(2);
		myCar.chaneSpeed(60);
		
		myCar.carState();
		
		System.out.println("========================\nto String �̿��غ��� ");
		
		System.out.println(myCar);
		
		System.out.println("========����========");
		myCar.km = 130;
		myCar.driveState();
		
		 
		double x = myCar.ableDrive(137, 15);
		
		System.out.println(myCar.km + "km �̵��� �ʿ��� ����� " + x + "l �Դϴ�.");
		
		
	}
}