package org.opentutorials.javatutorials.condition;

public class Condition3Demo {

	public static void main(String[] args) {
		// if-else if �ڿ� ������� ���� True�� then�� ���� False�� else�� ���� 
		
		if (true) {
			System.out.println(1);      // true �̱� ������ 1�� ��� 
		} else {
			System.out.println(2);
		
		}
		
		if (false) {
			System.out.println(1);      // false �̱� ������ then���� 1 ���X 
		} else { 
			System.out.println(2);       // false �̱� ������ else���� 2 ��� 
		
		}
		
		
		// else if 
		// if �� ���� T��� then���� ���� > F��� else if ���� ��� �Ѿ 
		// else if �� ���� T��� else if then�� ���� > F��� else �� ���� 
		// else���� �׻� �� �������� ���;��� 
		
		
//		   if (t/f) {
//		               "then"          < if�� T�� �� ���� 
//   	} else if (t/f){  
//                      "else if then"  < else if�� T�� �� ���� 
//      } else{
//		                "else"          < else if�� F�� �� else�� ����  
//      }
		
		if(false) {
			System.out.println(1);
		} else if (true) {
		    System.out.println(2);      // < �길 ��� �긦 False�� �ٲٸ� �Ʒ�3�� ��� �� else if�� ���� false �� �� else���� 4 ���
		}    else if (true) {           //�������� �������� true�� �߰ߵǸ� ù true�� �߰ߵ� ������ ����ǰ� �� �Ʒ��� true ���� ���� X
			System.out.println(3);
		}	else {
			System.out.println(4);
		}
		
		
		// �������� ���ǹ� ���� �ʴ� T/F�� ���������� �ٲ�� �־�߸� ���ǹ����μ� ��ġ�� �ִ�.
		
		
		
		
		
		
	}
	
	

}
