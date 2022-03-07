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
 
        left = 10;              // 변수로 치환 후 가변적으로 바꾸기 위해 변수 선언         
        right = 20;
        						// 만약 공동 프로젝트 중 다른사람이 이 행에 다른 연관성
        						//없는 로직을 짜둔다면 유지보수가 힘들어지고 알아보기 힘들다
        sum(left, right);     
        avg(left, right);     
 
        
        
        
        
        left = 20;              // 이 변수들은 sum 과 avg에 데이터 공급
        right = 40;
        sum(left, right);
        avg(left, right);
    }
 
}