package org.opentutorials.javatutorials.loop;

import java.util.Scanner;

public class LoginDemo {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    		 
	        System.out.printf("ID�� �Է����ּ��� >> ");
	        String id = sc.nextLine();
	        System.out.printf("PW�� �Է����ּ��� >> ");
	        String pw = sc.nextLine();
	        
	        
	        if (id.equals("ikae")) {
	            if (pw.equals("123123")) { //if�� �ȿ� �� �ٸ� if���� �־� ������ ��ȭ ��ų �� �ִ�. 
	                System.out.println("RIGHT");
	            } else {
	                System.out.println("WHRONG");
	            }
	 
	        } else {
	            System.out.println("wrong");
	        }
	    }
	}