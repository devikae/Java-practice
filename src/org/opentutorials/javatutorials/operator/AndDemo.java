package org.opentutorials.javatutorials.operator;

public class AndDemo {

	public static void main(String[] args) {
		// and >> 좌항 && 우항 좌항과 우항의 값이 모두 참일때 잠이 된다 
		if (true && true) {      // True
            System.out.println(1);   // 출력 
        }
 
        if (true && false) {        //false 미출력 
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
