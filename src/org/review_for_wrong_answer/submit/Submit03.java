package submit;

import java.util.Arrays;

public class Submit03 {

	public static void main(String[] args) {
		
		String info = "������, 010-7398-7332, akow283@gmail.com, �����ֽʼ�";

		String[] result = info.split(",\\s", 4);
		String name = result[0];
		String number = result[1];
		String mail = result[2];
		String call = result[3];
		
		
		System.out.println("======================================");
		System.out.println("�̸�          : "+ name);
		System.out.println("����ó        : "+ number);
		System.out.println("�̸���        : "   +  mail);
		System.out.println("����          : "   +  call);
		System.out.println("======================================");
	}

}