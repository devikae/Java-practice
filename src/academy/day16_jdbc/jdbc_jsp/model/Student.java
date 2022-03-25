package day16_jdbc.jdbc_jsp.model;

public class Student {
	private int stuId;
	private String stuName;
	private int stuScore;
	
	
	// 기본생성자도 넣어주는게 3대장 국룰 
	
	public Student() {}
	
	public Student(int stuId, String stuName, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuScore = stuScore;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuScore=" + stuScore + "]";
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	
	
}
