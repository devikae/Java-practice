package org.opentutorials.javatutorials.operator;

public class AndDemo {

	public static void main(String[] args) {
		// and >> ���� && ���� ���װ� ������ ���� ��� ���϶� ���� �ȴ� 
		if (true && true) {      // True
            System.out.println(1);   // ��� 
        }
 
        if (true && false) {        //false ����� 
            System.out.println(2);
        }
 
        if (false && true) {        //flase
            System.out.println(3);
        }
 
        if (false && false) {       //false
            System.out.println(4);
	}

}
}
