package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	//메소드를 이해하고싶다면 메소드의 정의보다는 메소드를 어떻게 사용하는지 먼저 보는게 좋다
	// 어떻게 동작하고 입력값은 무엇인지 출력값이 무엇인지 생각해보자 
	
	
	//           여기의 String는 
	// 넘버링이라는 메소드는 반드시 문자열을 리턴하게 된다는 의미
	public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다.
        return output; // 리턴을 만나면 "무조건 종료" 시키고 뒤의 값을 외부로 반환시킨다
    }
 
    public static void main(String[] args) {
        // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5); //numbering을 1번, 값5를 넣어서 호출
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
    }
}