package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	
		 public static void numbering() { //���� " () { " 
		        int i = 0;
		        while (i < 10) {
		            System.out.println(i);
		            i++;
		        }
		    }   // 0~9���� ������ ��� 
		 
		    public static void main(String[] args) {
		        numbering(); // (); ȣ�� 
		        numbering(); // (); ȣ�� 
		        numbering(); // (); ȣ�� 
		       // �ѹ����̶�� �̸��� ������ �ִ� �޼ҵ尡 ȣ��ȴ�.
		        
		       //3�� ȣ�������ν� �ѹ����� �޼ҵ��� ������ 3�� ��µȴ�.
		    }
		}