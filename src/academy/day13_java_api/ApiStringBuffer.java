package day13_java_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
		// 문자열하면? = String
		// String을 계속 수정하면 힙 메모리 영역에 계속 새로은 String 객체가 만들어지고,
		// 그 로 인해 가비지컬렉터가 할 일이 많아진다.
		
		// 1부터 10까지의 숫자를 문자열로 다 더하면 
		String strVal = "";
		for(int i =0; i <= 10; i++) {
			strVal +=i; // 매 순간 새로운 메모리 영역을 할당받으며 기존 메모리 영역에 남아있는 값은 가비지 컬렉터에 의해 삭제된다 > 비효율적 
			
		}
		System.out.println(strVal);
	
		String hello = "안녕";
		String hi = "안녕";
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		hello += "하세요";
		hi += "하세요";
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		System.out.println("============String buffer 이용========================");
		
		StringBuffer strBuff = new StringBuffer("안녕");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());
		
		//문자열 추가 
		strBuff.append("하세요");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());  // 문자열을 푸가 해도 위와 해쉬코드 값이 같음. >> 불필요한 메모리 사용 줄임 
		
		//StringBuffer가 가진 문자열을 String로 변환 
		String strVar = strBuff.toString();     // StringBuffer 의 경우 문자열로 변환, 문자열 추가만 사용됨
		System.out.println(strVar);
	
		// StringBuilder 이용 
		StringBuilder strBuild = new StringBuilder("안녕");
		System.out.println(strBuild);
		System.out.println(strBuild.hashCode());
		// StringBuilder 문자열 추가 
		strBuild.append("하세요");
		System.out.println(strBuild);
		System.out.println(strBuild.hashCode());
		
		// StringBuilder가 가진 문자열 String으로 변환 
		String str = strBuild.toString();
		System.out.println(str);
		
	}
}
