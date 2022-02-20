package quesition;

public class Print {

	public static void main(String[] args) {
		//변수명 각각 name department position sal 사용하라고 했으나 연습을 위해 문자열 그룹 사용 예정 
		//println , printf, print 1번씩 써서 출력 
		
		String [] group = {"이효리", "개발부", "대리", "1,500,000원"};
						
		System.out.println("--출력--");
		System.out.println("이름: " + group[0]);
		System.out.printf("부서: %s \n",group[1]);
		System.out.print("직위: " + group[2] + "\n급여: " + group[3]);
	}

}
