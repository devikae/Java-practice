package org.opentutorials.javatutorials.object;

public class ClaculatorDemo3 {
	 
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        int left, right;
 
        left = 10;              // ������ ġȯ �� ���������� �ٲٱ� ���� ���� ����         
        right = 20;
        						// ���� ���� ������Ʈ �� �ٸ������ �� �࿡ �ٸ� ������
        						//���� ������ ¥�дٸ� ���������� ��������� �˾ƺ��� �����
        sum(left, right);     
        avg(left, right);     
 
        
        
        
        
        left = 20;              // �� �������� sum �� avg�� ������ ����
        right = 40;
        sum(left, right);
        avg(left, right);
    }
 
}