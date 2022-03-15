package day11_class.hamepage;

public class Member {
	// ID/PW 입력받기 
	private String id;
	private String passWord;
	
	
	public Member(String id, String passWord) { // 생성자 만들기
		super();
		this.id = id;
		this.passWord = passWord;
	}
	
	public Member() {} // 기본 생성자 만들기 

	@Override
	public String toString() {
		return "Member [아이디= " + id + ", 비밀번호= " + passWord + "]";
	}

	public String getId() {  //getter setter private이기 때문에 만듬 
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}
