package day12_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		
		System.out.println(zealot.toString());
		
		HighTempler highTempler = new HighTempler();
		System.out.println(highTempler.toString());
		highTempler.psionicStorm();
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		Zealot zealot7 = new Zealot();
		
		// 질럿들 드래그로 선택
		ArrayList< Zealot> zealotList = new ArrayList<Zealot>();
		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		zealotList.add(zealot7);
		
		
		//선택된 질럿들 이동 명령 내리기
		for(int i =0; i < zealotList.size(); i++) {
			zealotList.get(i).move(20,30);
		}
		
		// zealotList.add(highTempler);
		
		// 다형성
		// 하나의 객체가 여러가지 타입을 가질 수 있는것. 
		// 부모 클래스 타입의 참조 변수로(ProtossUnit, StarUnit)
		// 자식 클래스 타입의 인스턴스(질럿 객체들,하템객체 등) 를 참조할 수 있는것.
		
		// 자식 객체에서 부모 객체로 형 변환이 가능 하다.
		
		ProtossUnit protossUnit = zealot;
		// 위는 이 예시와 같다
		// long longVal = 304030;(L을 붙이지 않아 인트) 롱은 인트보다 담을 수 있는 값이 많아 자동으로 형 변환 되서 담김   
 		// 자동 형 변환이 가능하다?  >>> 강제 형 변환도 가능하다
		
		ProtossUnit proUnit =(ProtossUnit) zealot;

		// 자식 객체에서 더 상위 객체[StarUnit (ProtossUnit보다 더 위인) ]로 형 변환이 가능하다
		StarUnit starUnit = zealot;
		//이 점을 이용 한다면 하템도 질럿리스트에 담을 수 있ㄷ ㅏ
		
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		starList.add(zealot);			//starUnit으로 자동 형 변환이 일어난 후 담긴 것 
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(zealot7);
		starList.add(highTempler);
		
		for(int i = 0; i <starList.size(); i++) {
			starList.get(i).move(5, 16);
		}
		
//		HighTempler ht = starList.get(7); >> 하템으로 받아서 안됨 
		StarUnit su = starList.get(7); // >> 상위 객체로 넣었기 때문에 바로 꺼내짐
		System.out.println(starList.get(7).getName());
//		StarList.get(7).psi //사이오닉 스톰을 사용할 수 없음 하템 개체에 스톰 메소드가 있기 때문에 스타유닛으로 형변환 된 하템은 스톰을 사용할 수 없음 

		//		>> 다시 형 변환 시켜서 스톰을 사용
		((HighTempler)su).psionicStorm(); // 괄호에 따라 순서가 바뀌니 주의
		
		// 위에서 보면 하템의 인덱스번호 7 을 알고 넣어서 쓰는건 말이 안된다 
		// 그래서 이렇게 
		
		for (int i =0; i<starList.size(); i++) {
			// 하템인지 체크 후 사이오닉 스톰 실행 
			if(starList.get(i).getName().equals("테사다르")) {
				((HighTempler)su).psionicStorm();
			}
		} // 이렇게 해도 되지만 아래의 방법으로 체크 할 수 있다.
		
		for (int i =0; i<starList.size(); i++) {
			// 하템인지 체크 후 사이오닉 스톰 실행 
			if(starList.get(i) instanceof HighTempler) {
				System.out.println("instanceof 로그체크");
				((HighTempler)su).psionicStorm();
			}
		}
		
		// 자식 객체는 부모 객체로 형 변환이 가능하다.
		System.out.println(zealot instanceof ProtossUnit);  //true 
		System.out.println(zealot instanceof StarUnit);  //true 
		
		// 부모 객체로 형 변환 되었던 자식 객체는 다시 자식 객체로 형 변환이 가능하다.
//		StarUnit starUnit = zealot; 위에서 사용한 스타유닛에 질럿을 담은 구절
		System.out.println(starUnit instanceof Zealot);
		
		// instanceof 
		StarUnit puma = new StarUnit("퓨마",0 ,40 ,0 ,0 ,0 ,0 );
		
		System.out.println(puma instanceof ProtossUnit);  // 왼쪽 객체 instanceof오른쪽 클래스   >> 부모 객체는 자식 객체로 형 변환 할 수 없다. 
		// 최상위인 StarUnit을 그 자식인 ProtossUnit으로 형 변환 할 수 없다 
		System.out.println(puma instanceof Zealot);  // >> 형 변환 가능하면 true / 아니면 false 
		
		SigeTank tank = new SigeTank();
		
		System.out.println(tank.getName());
		System.out.println(tank.toString());
		System.out.println("시즈 ON 테스트====================");
		tank.sigeMode();
		System.out.println(tank.toString());
		System.out.println("시즈 OFF 테스트===================");
		tank.sigeModeOff();
		System.out.println(tank.toString());
		
		System.out.println("======================레이스==========================");
		Wraith wraith = new Wraith();
		System.out.println(wraith.toString());
		System.out.println("레이스 클로킹on 테스트");
		wraith.cloaking();
		System.out.println(wraith.toString());
		System.out.println("클로킹 off 테스트 ");
		wraith.cloakingOff();
		System.out.println(wraith.toString());
	}

}
