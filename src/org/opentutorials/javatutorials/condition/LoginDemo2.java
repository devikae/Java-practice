package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		 String id = args[0];
	        String password = args[1];       // ���� � �������� ������ �Է� ���̰� �װ� ID�� PW �ΰ��� �Է��� �޵��� �ߴ�.
	        if (id.equals("egoing")) {
	            if (password.equals("111111")) {  //if���� �ΰ� ���� �� �����ڸ� ���� �Ѱ��� ���� �����ð��� �� ������ ��� �ð�.
	                System.out.println("RIGHT");
	            } else {
	                System.out.println("WHRONG");
	            }
	 
	        } else {
	            System.out.println("WHRONG!");
	        }

	}

}
