package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {
	 
	//refactoring > ����ȭ 
	//Demo 1�� ����
	
	
	
    public static void sum(int left, int right) {    // sum�̶�� �޼ҵ� ���� 
        System.out.println(left + right);			 // << ���븸 �ٲٸ� sum�� ������ �����ϱ� �����ϴ�
    }
 
    public static void main(String[] args) {       
        sum(10, 20);
        sum(20, 40);
    }
 
}