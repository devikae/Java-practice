package car;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "red";
		myCar.gear = 1;
		myCar.fast = 80;
		
		myCar.carState();
		
		System.out.println("===========상태 변경============");
		myCar.setGear(2);
		myCar.chaneSpeed(60);
		
		myCar.carState();
		
		System.out.println("========================\nto String 이용해보기 ");
		
		System.out.println(myCar);
		
		System.out.println("========연비========");
		myCar.km = 130;
		myCar.driveState();
		
		 
		double x = myCar.ableDrive(137, 15);
		
		System.out.println(myCar.km + "km 이동에 필요한 연료는 " + x + "l 입니다.");
		
		
	}
}
