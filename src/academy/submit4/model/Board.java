package submit4.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	
	private int bNum;
	private String bTitle; // 글 제목
	private String bContent; // 글 내용 
	private String bWriter; // 작성자 
	private String bDate;   // 작성시간 
	
	public Board() {}

	public Board(int bNum, String bTitle, String bContent, String bWriter, String bDate) {
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = bWriter;
		this.bDate = bDate;
		
	}
	
	public Board(String bTitle, String bContent, String id) {
		Date nowDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		String curTime = sdf.format(nowDate);
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bWriter = id;
		this.bDate = curTime;
		
	}

	@Override
	public String toString() {
		return "[" + bNum +". |" + " " + bTitle + " |"+ " " + bWriter + " | " + bDate + "]";
	}

	public int getbNum() {
		return bNum;
	}

	public void setbNum(int bNum) {
		this.bNum = bNum;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWhriter) {
		this.bWriter = bWhriter;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}



	
}
