package day16_jdbc.jdbc_jsp;

import java.util.ArrayList;
import java.util.Stack;

import day16_jdbc.jdbc_jsp.model.Student;
import day16_jdbc.jdbc_jsp.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		// 서비스 불러옴 
		StudentService service = StudentService.getInstance();
		
		// 학생 목록 조회 
		ArrayList<Student> stuList = service.stuList();
		
		// 업데이트
		Student update = new Student();
		update.setStuId(2);
		update.setStuName("재훈");
		update.setStuScore(800);
		service.updateStu(update);
		
		Student test1 = new Student();
		test1.setStuName("전영");
		test1.setStuScore(0);
//		service.insertStu(test1);
		
		
		ArrayList<Student> stuList2 = service.stuList();
		// for문으로 리스트 열어보기
		for(Student st : stuList2) {
			System.out.println(st.toString());
		}
		
		Student wontae = new Student();
		wontae.setStuName("원태");
		wontae.setStuScore(700);
		
		int result = service.insertStu(wontae);
		if(result > 0) {
			System.out.println("=====등록 성공=====");
			stuList = service.stuList();
			for(Student st : stuList) {
				System.out.println(st.toString());
			}
			
		}
		
		
	}

}
