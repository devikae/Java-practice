package org.opentutorials.javatutorials.loop;

import java.util.Scanner;

public class LoginDemo {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    		 
	        System.out.printf("ID를 입력해주세요 >> ");
	        String id = sc.nextLine();
	        System.out.printf("PW를 입력해주세요 >> ");
	        String pw = sc.nextLine();
	        
	        
	        if (id.equals("ikae")) {
	            if (pw.equals("123123")) { //if문 안에 또 다른 if문을 넣어 조건을 상세화 시킬 수 있다. 
	                System.out.println("RIGHT");
	            } else {
	                System.out.println("WHRONG");
	            }
	 
	        } else {
	            System.out.println("wrong");
	        }
	    }
	}