package submit2.submit03;

import java.util.ArrayList;

import day11_class.company.Company;

public class Book {

	int bookNO;
	String bookName;
	boolean lend = false;

	public Book(String n) {
		Library book = Library.getInstance();
		
		this.bookNO = book.bookList.size() + 1;
		this.bookName = n;

	}
	
	
	
	@Override
	public String toString() {
		if (lend) {
			return "Book [도서넘버: " + bookNO + ", 책이름: " + bookName + ", 대여상태: 대여중 " + "]";
		}
		else {
			return "Book [도서넘버:" + bookNO + ", 책이름: " + bookName + ", 대여상태: 입고중 " + "]";
		}
	}

	public int getBookNO() {
		return bookNO;
	}

	public void setBookNO(int bookNO) {
		this.bookNO = bookNO;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isLend() {
		return lend;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}
	
	

}