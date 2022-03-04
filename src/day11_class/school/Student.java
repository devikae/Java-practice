package day11_class.school;

import day11_class.company.UtilClass;

/**
 * 학생 객체를 생성하기 위한 클래스
 * @author dev-ikae
 *
 */
public class Student implements Comparable {
	// 학생(Students) 클래스의 상태(State)를 필드 변수로 선언
	// 필드 변수의 값을 꼭 초기화(int a = 5;)하지 않아도 된다
	
	// 필드 변수 선언 (전역변수)
	String name;       // 학생의 이름 
	int kor; 			 // 학생의 국어 점수
	int eng; 			 // 학생의 영어 점수 
	int math; 			 // 학생의 수학 점수 
	double avg ;		 // 학생의 평균 점수
	boolean isMan;

	
	// 기본 생성자
	// 따로 만들지 않아도 자동으로 (생성되서) 존재한다.
	Student(){
		
	}
	
	// 단축키 [Alt + Shift + S] 혹은 마우스 우클릭 
	// Generate toString
	@Override // 기존의 메소드를 재 정의 하는것을 말한다 
	public String toString() {
		return "Student [이름 =" + name + ", 국어 =" + kor + ", 영어 =" + eng + ", 수학 =" + math + ", 평균 =" + avg
				+ ", 남자여부 =" + isMan + "]";
	}

	
	
	// 단축키 [Alt + Shift + S] 혹은 마우스 우클릭 > Source
	// Generate constructor using field
	public Student(String name, int kor, int eng, int math, double avg, boolean isMan) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.isMan = isMan;
	}
	
	//메소드 오버로딩과 비슷함 
	
	public Student(String name, int kor, int eng, int math, boolean isMan) {
		super();           // 상속 나중에 배움 
		
		
		this.name = name;           //Student.name 한거와 같음  
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		double average = (kor + eng + math) / 3.0;
		this.avg = UtilClass.round((kor + eng + math) / 3.0, 2);   
		this.isMan = isMan;
	}
	
	
	
	
	//성적표 출력 (행동)
	public void state() {
		System.out.println("=======================================");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		avg = UtilClass.round((kor + eng + math) / 3.0, 2);   
		
		System.out.println("평균 : " + avg );
		System.out.println("성별 : " + isMan );
		System.out.println("=======================================");

	}

	@Override
	public int compareTo(Object stu) {
//		double compareAvg = ((Student)stu).avg;
		Student temp = ((Student)stu);
		int totalTemp = temp.kor + temp.eng + temp.math;
		
		int totalThis = this.kor + this.eng + this.math;
		
		// 오름차순
//		return (int) (this.avg - compareAvg);		
		// 내림차순
//		return (int) (compareAvg - this.avg);
		return totalTemp - totalThis;
	}
	
}
