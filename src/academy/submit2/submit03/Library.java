package submit2.submit03;

import java.util.ArrayList;

import day11_class.company.Company;
import day11_class.company.Worker;

public class Library {

	private Library() {

	}

	private static Library instance = new Library();
	
	public static Library getInstance() {

		return instance;
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void showList() {
		for(Book book : bookList) {
			System.out.println(book);
		}
	}
	
	
	public void initList() {
		bookList.add(new Book("삼국지"));
		bookList.add(new Book("해리포터와 마법사의 돌"));
		bookList.add(new Book("해리포터와 비밀의 방"));
		bookList.add(new Book("해리포터와 아즈카반의 죄수"));
		bookList.add(new Book("해리포터와 불사조 기사단"));
		bookList.add(new Book("해리포터와 혼혈왕자"));
		bookList.add(new Book("해리포터와 죽음의 성물"));
		bookList.add(new Book("어린왕자"));
		bookList.add(new Book("이것이 자바다"));
		bookList.add(new Book("좋은생각"));
		bookList.add(new Book("반지의 제왕: 반지 원정대"));
		bookList.add(new Book("반지의 제왕: 두 개의 탑"));
		bookList.add(new Book("반지의 제왕: 왕의 귀환"));
		bookList.add(new Book("토익보카"));
		bookList.add(new Book("개미"));
	}
	
	
	public ArrayList<Book>  search(String name) {
		ArrayList<Book> searchList = new ArrayList<Book>();

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).bookName.indexOf(name)!= -1) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	public void lent(int num) {
		ArrayList<Book> searchList = new ArrayList<Book>();

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).bookNO == num) {
				bookList.get(i).lend = true;
				System.out.println(bookList.get(i).getBookName() +  "을 (를) 대여하셨습니다.");
			}
		}
		
	}
	
	
}
