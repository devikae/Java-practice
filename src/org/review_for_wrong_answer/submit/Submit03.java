package submit;

import java.util.Arrays;

public class Submit03 {

	public static void main(String[] args) {
		
		String info = "정찬웅, 010-7398-7332, akow283@gmail.com, 연락주십쇼";

		String[] result = info.split(",\\s", 4);
		String name = result[0];
		String number = result[1];
		String mail = result[2];
		String call = result[3];
		
		
		System.out.println("======================================");
		System.out.println("이름          : "+ name);
		System.out.println("연락처        : "+ number);
		System.out.println("이메일        : "   +  mail);
		System.out.println("ㅋㅋ          : "   +  call);
		System.out.println("======================================");
	}

}