package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ���̵� ���� üũ�ϴ� ���α׷��� ����� ���� 
		
		String id = args[0]; // "args[0]" �� �κ��� ���� ����� ���� ���� "�Է� ��" �� ���ڿ��� ������ ���
		if(id.equals("egoing")) {              // .equals > �Է� ���� egoing�� ������ T �ƴϸ� F   ���� �Ʒ��� ���� 
			System.out.println("RIGHT");      //  �Է��� ���� egoing �̶�� True �� then�� RIGHT ���
		}else {
			System.out.println("WRONG");      // �Է��� ���� F�� �� else�� WHRONG �� ��� 
		}
		
		}

	}


