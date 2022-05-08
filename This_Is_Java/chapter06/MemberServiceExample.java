package chapter06;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.logIn("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logOut("hong");
		}else {
			System.out.println("id or pw 가 틀립니다");
		}
		
		
		
	}

}
