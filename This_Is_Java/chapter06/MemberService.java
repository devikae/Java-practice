package chapter06;

public class MemberService {
	String id = "";
	String pw = "";
	
	public boolean logIn(String id, String pw) {
		if("hong".equals(id) && "12345".equals(pw)) {
			
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public void logOut(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
