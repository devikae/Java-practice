package day12_extends_interface.board;
 
	// 게시판 클래스

public class Board {
	private int no;			// 글 번호
	private String title;  	// 글 제목
	private String content; // 글 내용
	private String author;  // 작성자
	
	
	@Override
	public String toString() {
		return "Board [no= " + no + ", title= " + title + ", content= " + content + ", author= " + author + "]";
	}


	public Board(int no, String title, String content, String author) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
