package org.opentutorials.javatutorials.loop;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
	        switch(1){ // ��ȣ ���� ������ ���̽��� ���� break�� ���ٸ� case1,2,3��� ���� 
	             //����ġ ���ǿ� �ش�Ǵ� ������ �� �� �ִ� ������ Ÿ���� �������ִ�.
	          //byte, short, char, int, enum, String, Character, Byte, Short, Integer 
	        
	        case 1:
	            System.out.println("one");	            
	        case 2:   // ���� �� switch(2)��� �Ѵٸ� 2,3�� ���
	            System.out.println("two");
	            break;
	        case 3:
	            System.out.println("three");
	        default:
	        	System.out.println("default"); // case�� �ش����� �ʴ� ������ ������ ����Ʈ ���� ��µȴ� ex4
	            
	        }
	         
	  // switch ���� if���� ��ü �����ϴ�
	        
	     int val = 1;
	     if (val == 1) {
	    	 System.out.println("one");
	    	 
	     }else if( val == 2) {
	    	 System.out.println("two");
	    	 
	     }else if ( val == 3) {
	    	 System.out.println("three");
	     }
         	        
	    
	 
 }
}