package day11_class.school;

import java.util.ArrayList;
import java.util.Collections;

import day11_class.company.UtilClass;

/**
 * 실행(main Method) 실행만을 담당하는 클래스 
 * @author dev-ikae
 *
 */
public class SchoolMain {
	
	int intVal = 12;
	static String strVal = "스테틱의 단검";
	
	public static void main(String[] args) {
		//클래스 객체로 선언 
		Student minwoo = new Student();
		
		
		// 객체 뒤에 .을 찍으면 객체가 가지고 있는 변수와 메소드에 접근이 가능하다 
		// ex minwoo. < 
		
		
		System.out.println(minwoo.name); // null이 나옴 minwoo를 값에 넣지 않아서 
		
		
		//객체가 가진 메소드 실행
		minwoo.state(); // null 값을 초기화 하지 않았을 때 필드변수들은 초기값으로 설정되어 있다.
		                  // 기본타입(숫자,boolean) 외 나머지 참조타입
						  // "기본값" 숫자타입 = 0 boolean타입 = false 참조타입 = null
		
		
		//객체의 상태(State) 설정 
		minwoo.name = "민우";
		minwoo.kor = 90;
		minwoo.eng = 80;
		minwoo.math = 75;
//		minwoo.avg = (90 + 80 + 75) /3.0; 
		minwoo.isMan = true;
		
		System.out.println(minwoo.name);
		minwoo.state();
		
		
		// 두번째 객체 선언
		Student bumseok = new Student();
		
		bumseok.name = "범석";
		bumseok.kor = 80;
		bumseok.eng = 83;
		bumseok.math = 88;
//		bumseok.avg = (bumseok.kor + bumseok.eng + bumseok.math) / 3.0 ;
		bumseok.isMan = true ;
		
		bumseok.state();
		
		System.out.println(bumseok.avg);
		
		System.out.println("=======================================");
		
		
		// 필드 값을 입력받는 생성자(constructor)로 객체 만들기
		
		Student yujin = new Student("유진", 90, 93, 30, (90+93+30)/3.0, false);
		yujin.state();
		
		// 평균을 입력받지 않아도 되는 생성자 사용하기  //student 클래스에서 한번에 하도록 만듬
		Student sangwoo = new Student("상우", 80,70,91, true);
		sangwoo.state();
		
		// static 변수나 메소드는 클래스를 객체로 만들지
		// 않아도 바로 사용 가능하다.
		System.out.println(UtilClass.owner);
		
		SchoolMain scMain = new SchoolMain();
		System.out.println(scMain.intVal);
		
		System.out.println(strVal);
//		System.out.println(scMain.strVal);  // 원래 이게 맞지만 static를 선언해서 위 처럼 바로 사용 가능 한 것. 
		
		System.out.println("============================객체 복사=================================");
		
		//객체 복사
		Student sangwoo2 = sangwoo;       // 메모리 주소를 똑같이 받기 때문에 
		System.out.println(sangwoo);      // 패키지.폴더.클래스명. 경로 @ 16진수로 변환된 해쉬코드
		System.out.println(sangwoo2);
		System.out.println(sangwoo.hashCode());           // 같은 해쉬코드를 가지고 있음 
		System.out.println(sangwoo2.hashCode());
		
		
		// 잘못된 복사 예시 
		sangwoo2.avg = 100;               //sangwoo2를 변경했는데 
		System.out.println(sangwoo.avg);  // 아래서 보면 원본도 바뀌어버림 
		
		
		// 객체 복사 하는 방법 
		Student sangwoo3 = new Student(sangwoo.name, sangwoo.kor, sangwoo.eng, sangwoo.math, sangwoo.isMan ); // 만들때 부터 값을 넣어서 만듬 ArrayList 처럼 
		sangwoo3.state(); 
		
		System.out.println("==============================구분선==================================");
		
		// System.out.println(); 로 객체 표현하기 
		// 클래스 내에서 toString을 @Overide 하면 된다.
		System.out.println(minwoo);
		
		System.out.println("================================================================");
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(minwoo);
		stuList.add(bumseok);
		stuList.add(yujin);
		stuList.add(sangwoo);
		stuList.add(new Student("용석", 80,70,75, true));           // .add(괄호 안에서도 ㄱㄴ ) 
		stuList.add(new Student("지혜", 80,71,75, false));
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		//stuList 안의 학생들의 평균을 이용해서 종합 성적표를 출력 해주세요 
		// 1등. 상우 국어 80 영어 70 수학91 평균 100.0
		// 2등. xx  xx    xx     xx    xx 
		// 이런식으로 나오도록
		// (1) 정렬 > stuList.get(0).name을 이용해서 인덱스
		// 어떻게 풀어야 할까
		// avg기준으로 정렬
		
		System.out.println(stuList.get(0).name);
		System.out.println(stuList.get(0).avg);
		
		
		
		for (Student stu : stuList) {
	        System.out.println(stu);
	    }
		System.out.println();
		System.out.println("===================람다식======================");
		Collections.sort(stuList, (s1, s2) -> (int)s2.avg - (int)s1.avg);
		
		int rank = 1;
	
	    for (Student stu : stuList) {
	        System.out.println(rank + "등" + stu);
	        rank++;
	    }
		
	    System.out.println();
	    System.out.println("===============버블정렬=======================");
	    for(int i =0; i< stuList.size(); i++) {
			
			for(int j =i; j<(stuList.size()-1 )-i; j++) {
				if(stuList.get(j).avg < stuList.get(j+1).avg) {   //if문 부등호만 바꾸면 역순으로 정렬 바뀜
					Student temp = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					stuList.set(j+1, temp);
				}//for-2                 if문
				
			}System.out.println(i+1 +"등" + stuList.get(i));
	    }//for-1
	    
	    System.out.println();
	    System.out.println("향상된 for문");
	    
	    
		int idx = 1;
		for (Student stu : stuList) {
			System.out.println(idx + "등. " + "이름 :" + stu.name + " 국어:" + stu.kor + " 영어:" + stu.eng + " 수학:" + stu.math
					+ " 평균:" + stu.avg);
			idx++;
		}
		;

		// 정렬
		Collections.sort(stuList);

		for (Student stu : stuList) {
			System.out.println(stu);
		}
	    
	  }
	    
	    	
}


