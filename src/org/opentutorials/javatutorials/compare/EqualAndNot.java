package org.opentutorials.javatutorials.compare;

public class EqualAndNot {

	public static void main(String[] args) {
		// Boolean�� ���� ������ �ǹ��ϴ� ������ Ÿ�� >> �ΰ��� ���� ���� true/false 
		
		// ��(����) ������ "=="  >> ���ǹ����� ���� ����ϰ� �� ��.
		
		System.out.println(1==2);          // false
		System.out.println(1==1);          // true
		System.out.println("one"=="two");  // false
		System.out.println("one"=="one");  // true 
		
		// "!=" !�� ������ �ǹ��Ѵ�. 
        
		System.out.println(1!=2);          // true 1�� 2�� ���� �ʱ� ������ 
		System.out.println(1!=1);          // false
		System.out.println("one"!="two");  // true
		System.out.println("one"!="one");  // false 
		
	}

}
