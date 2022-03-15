package day11_class.worldcup;

import java.util.ArrayList;
import java.util.Scanner;

public class WorldCupMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Menu menu2 = new Menu("짜장면", false);
	    System.out.println(menu2);
	
//	    System.out.println(menu2.name);     private 변수라 접근 안됨 
	     System.out.println(menu2.getName());  // getter setter 사용으로 접근
	     
	     ArrayList<Menu> menuList = new ArrayList<Menu>();
	     
	     menuList.add(new Menu("짜장면", false));  // fasle를 default 값으로 지정
	     menuList.add(new Menu("짬뽕"));          // Menu 클래스에 이름만 받아도 되는 생성자를 만들어 이름만 받음 
	     menuList.add(new Menu("볶음밥"));         
	     menuList.add(new Menu("김치찌개"));        
	     menuList.add(new Menu("제육볶음"));        
	     menuList.add(new Menu("김밥/라면"));          
	     menuList.add(new Menu("떡볶이"));          
	     menuList.add(new Menu("순대국밥"));          
	     menuList.add(new Menu("햄버거"));          
	     menuList.add(new Menu("냉면"));          
	     menuList.add(new Menu("스파게티"));          
	     menuList.add(new Menu("삼겹살"));          
	     menuList.add(new Menu("생선구이"));          
	     menuList.add(new Menu("리조또"));          
	     menuList.add(new Menu("치킨"));          
	
	     Scanner sc = new Scanner(System.in);
	     
	     // 배열에서 인덱스 0과 1비교 | 2와 3비교 | 4와 5비교
	     //               첫자리2증가 뒷자리1증가
	     System.out.println("16강");
	     
	     for(int i=0; i<menuList.size(); i+=2) {
	    	 System.out.println("메뉴를 선택해 주세요");
	    	 System.out.println("1. " + menuList.get(i).getName()
	    			 			+" 2. "+ menuList.get(i+1).getName());
	    	 System.out.print(">>> ");
	    	 int select = Integer.parseInt(sc.nextLine());
	     
	    	 if(select == 1) {
	    		 menuList.get(i).setSelect(true);
	    	 }else if( select ==2) {
	    		 menuList.get(i+1).setSelect(true);
	    	 }
	     }// for문 
	
	     // 8강
	     System.out.println("8강");
	     ArrayList<Menu> menuList8 = trueList(menuList);
	     for(int i=0; i<menuList8.size(); i+=2) {
	    	 System.out.println("메뉴를 선택해 주세요");
	    	 System.out.println("1. " + menuList8.get(i).getName()
	    			 			+" 2. "+ menuList8.get(i+1).getName());
	    	 System.out.print(">>> ");
	    	 int select = Integer.parseInt(sc.nextLine());
	     
	    	 if(select == 1) {
	    		 menuList8.get(i).setSelect(true);
	    	 }else if( select ==2) {
	    		 menuList8.get(i+1).setSelect(true);
	    	 }
	     }// for문 
	     
	     
	     // 4강
	     System.out.println("4강");
	     ArrayList<Menu> menuList4 = trueList(menuList8);
	     for(int i=0; i<menuList4.size(); i+=2) {
	    	 System.out.println("메뉴를 선택해 주세요");
	    	 System.out.println("1. " + menuList4.get(i).getName()
	    			 			+" 2. "+ menuList4.get(i+1).getName());
	    	 System.out.print(">>> ");
	    	 int select = Integer.parseInt(sc.nextLine());
	     
	    	 if(select == 1) {
	    		 menuList4.get(i).setSelect(true);
	    	 }else if( select ==2) {
	    		 menuList4.get(i+1).setSelect(true);
	    	 }
	     }// for문 
	     
	     //결승
	     System.out.println("결승");
	     ArrayList<Menu> menuList2 = trueList(menuList4);
	     for(int i=0; i<menuList2.size(); i+=2) {
	    	 System.out.println("메뉴를 선택해 주세요");
	    	 System.out.println("1. " + menuList2.get(i).getName()
	    			 			+" 2. "+ menuList2.get(i+1).getName());
	    	 System.out.print(">>> ");
	    	 int select = Integer.parseInt(sc.nextLine());
	     
	    	 if(select == 1) {
	    		 menuList2.get(i).setSelect(true);
	    	 }else if( select ==2) {
	    		 menuList2.get(i+1).setSelect(true);
	    	 }
	     }// for문 
	     
	     
	     for(Menu m : menuList2) {
	    	 if(m.isSelect()) {
	    		 System.out.println(m.getName()+ " 우승!!");
	    	 }
	     }
	     
	     
	     
	     
	     
	}//main 
	
	
	public static ArrayList<Menu> trueList(ArrayList<Menu>list){ //static을 붙이면 따로 객체를 만들지 않아도 함수를 쓸 수 있다
		ArrayList<Menu> selectList = new ArrayList<Menu>();
		
		for(Menu menu : list) {
			if(menu.isSelect()) {
				selectList.add(new Menu(menu.getName()));
			}
		}
		return selectList;
	}
	
	
	
	
	
	
}
