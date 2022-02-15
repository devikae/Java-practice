package org.opentutorials.javatutorials.compare;

public class GreaterThanAndEquals {
	public static void main(String[] args) {
		//  > ������ ���׺��� ũ�ٸ� �� �׷��� �ʴٸ� ���� < �ݴ뵵 �������� 
		
		System.out.println(10>20); //F
		System.out.println(10<20); //F
		System.out.println(10>2);  //T
		System.out.println(10>20); //F
		
		// >= ������ ���׺��� ũ�ų� ����. <= �ݴ뵵 �������� 
		
		System.out.println(10>=20); //F
		System.out.println(10<=20); //T
		System.out.println(10<=2);  //F
		System.out.println(10>=10); //T
		
		
	    // .equals ���ڿ��� ���� �� ����ϴ� �޼ҵ�. ���� �޼ҵ带 ����� ���� 
		
		String a = "Hello world";              // �Ѵ� ���� hello world������ �Ʒ� ��µǴ� ���� false�� �ȴ�
		String b = new String("Hello world");
		System.out.println(a == b);           // false    
		System.out.println(a.equals(b));  
		
		//���� �� ���� �������� 
		//new String ���ִ� ������ �׳� ���� Hello world�� ������ ������ new String�� ���� �ٸ� ��ġ�� �����͸� ������
		// a == b �϶� �������� ��ġ�� �ٸ��� ������ false�̸� a.equals(b)�� ������ ��ġ�� �ٸ����� ����� �������� ���� �����Ƿ� true 
		
}
}