package day11_class.hamepage;

import java.util.ArrayList;

public class MemberDB {
	// 싱글톤 패턴 적용 
	
	// 1.기본 생성자를 private로 만든다
	private MemberDB() {}
	
	// 2.필드에 MemberDB new를 이용해서 객체로 만들어둔다 
	private static MemberDB instance = new MemberDB(); // private여도 동일한 클래스 내에서는 사용 가능 다른클래스에서 사용 불가 
	
	// 3. 객체로 만든 instance를 제공하는 함수 만들기
	
	public static MemberDB getInstance() { // 다른 클래스에서 사용하기 위해 public
		return instance;
	}
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	
	// 회원 가입 
	public void addMember(Member member) {
		
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(member.getId())) { // List에서 get으로 id를 꺼내고 member과 비교해서 중복 체크 
				System.out.println("아이디가 중복됩니다!!");
				return;
			}
		}
		memberList.add(member);
	}
	
	// 로그인 
	public boolean loginCheck(String id, String pw) {
		for(int i = 0; i< memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id)) {
				if(memberList.get(i).getPassWord().equals(pw)){
					return true;
				}
			}
		}System.out.println("아이디 혹은 비밀번호가 다릅니다.");
		return false;
	}
	
	// 회원 목록 보여주기 
	public void showList() {
		System.out.println("회원 목록========================");
		for(int i=0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		System.out.println("=========================");
	}


}
	
