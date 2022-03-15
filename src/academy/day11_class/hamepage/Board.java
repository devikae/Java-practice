package day11_class.hamepage;

public class Board {
	private int no; // 글 넘버 
	private String title; // 글 제목 
	private String content; // 글 내용 
	private String author; // 작성자 
	
	public Board(int no, String title, String content, String author) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Board(String title, String content, String author) {
		super();
		BoardDB boardDB = BoardDB.getInstance();
		this.no = boardDB.sizeBoard();
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Board() {
	}

	@Override
	public String toString() {
		return " [ " + no + " | title=" + title + "|" + author +"]";
	}

	public int getNo() {
		return no;
	}

//	public void setNo(int no) {
//		this.no = no;
//	}  글번호 수정 못하게 주석처

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

	public void showBoard() {
		System.out.println("-----------------------------");
		System.out.println("제목: " + this.title);
		System.out.println("작성자 :" + author);
		System.out.println(content);
		System.out.println("-----------------------------");
	}


}
