package day11_class.member;

public class Member {

	String id;			  // 사용자 ID
	String pw;   // 사용자 PW
	String name; 		 // 사용자 이름 
	
	
	
	// 생성자를 만들었다면 기본생성자 Member(){}또한 만들어줘야
	// 기본 생성자를 이용해서도 객체로 만들 수 있다.
	public Member(String id, String pw, String name) {    //*1 이렇게 만듬
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	Member() {
	} // 생략되어있음

	@Override
	public String toString() {
		return "Member [아이디: " + id + ", 비밀번호: " + pw + ", 이름: " + name + "]";
	}

}
