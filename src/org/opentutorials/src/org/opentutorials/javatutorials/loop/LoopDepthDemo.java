package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// �ݺ����� ��ø 
		
		for(int i=0; i<10; i++)       // i�� ���� 0~9���� �ݺ��Ǹ� ����
			for(int j=0; j<10; j++)  
				for(int k=0; k<10; k++)
				System.out.println(i + "" + j + ""+ k);

	}
}
