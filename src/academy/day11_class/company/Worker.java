package day11_class.company;

import day11_class.UtilClass;

public class Worker {
	//캡슐화 하려면 모두 private
	private int id;			// 사원 번호
	private String name;		// 이름
	private int age;			// 나이
//	int exp = 0;			// 경력
//	int salary = 3000;		// 연봉 (단위: 만)
//	String position = "사원";	// 직급 
	private int exp;
	private int salary;
	private String position;
	
	
	
	// 사원 번호가 자동으로 적용되는 생성자 
	public Worker(String name, int age, int exp, int salary, String position) {
		Company company = Company.getInstance();
		
		this.id = company.workerList.size() +1;
		this.name = name;
		this.age = age;
//		this.exp = exp;
//		this.salary = salary;
//		this.position = position;    //여기를 주석처리 하고 위에 선언하면서 기본값을 줄 수 있음
	}
	
//	// 사원 번호, 경력 = 0, 시작 연봉 =3000, 직급 = "사원" 인 기본값이 적용되는 생성자 
//	public Worker(String name, int age) {
//		Company company = Company.getInstance();
//		
//		this.id = company.workerList.size() +1;
//		this.name = name;
//		this.age = age;
//		this.exp = 0;
//		this.salary = 3000;
//		this.position = "사원";
//	}

	// 사원 번호, 경력 = 0, 시작 연봉 =3000, 직급 = "사원" 인 기본값이 적용되는 생성자 위 보다 간단히
		public Worker(String name, int age) {
			this(name, age, 0, 3000, "사원");
		}
	
	
	
	
	// 경력을 추가하는 
	// 경력이 year만큼 증가 
	public void addExp(int year) {
		this.age += year;
		this.exp += year;
		this.salary += 300*year;
		
//		if(! this.position.equals("사장") ||  ! this.position.equals("이사")) {// 현재의 사장,이사는 실행되지 않도록 
//			if(this.exp > 20) {
//				this.position = "이사";
//			}else if(this.exp > 15) {
//				this.position = "부장";
//			}else if(this.exp > 8) {
//				this.position = "과장";
//			}else if(this.exp > 3) {
//				this.position = "대리";
//			}
//		}
		
		if ( this.position.equals("사장") || this.position.equals("이사")) {
			return;
		}
		if ( this.exp > 20 ) {
			this.position = "이사";
		} else if ( this.exp > 15 ) {
			this.position = "부장";
		} else if ( this.exp > 8 ) {
			this.position = "과장";
		} else if ( this.exp > 3 ) {
			this.position = "대리";
		}
		
		
	}//addExp 

	
	@Override
	public String toString() {
		return "--------------------------\n 사원번호 : "
				+  + id + "\n 이름: " + name + "\n 나이: " + age + "\n 경력: " + exp + "\n 연봉: "
				+ UtilClass.formatSalary(salary)
				+ "\n 직급: " + position + "\n--------------------------";
	}
	
	
	//사표 수리 
	public void quitCompany() {
		System.out.println(this.position + " " + name + " 이(가) 사직서를 제출하고 회사를 나갔습니다.");
	
		Company company = Company.getInstance();
		company.workerList.remove(this); //해당 객체를 넣어줘도 작동함 
	}

	// 캡슐화
		// 단축키 [Alt + Shift + S] 혹은 {마우스 우클릭 - Source]
		// generate Getters and setters
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	//get은 열어준다 
	
	public int getId() {
		return id;           // 열람은 할 수 있지만 수정은 할 수 없도록
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
}
