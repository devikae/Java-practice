package submit;

public class Submit02 {
	public static void main(String[] args) {
	
		String eBook = "오그소 리누오소구오소리도 오아닌소리 자오소기리"
				+ " 오걸소음리을오 소걸리어오라소리,오 오소나리는 오독소특리하오다소는리오 소"
				+ "리것오을소 리믿오어소라리.오 소리누오구소나리 오몰소리려오소가리는오 소줄리에오 소설리 오소필리요오는소 리없오다소.리오"
				+ " 소리자오소신리만오의소 리걸오음소리으오로소 리자오기소 리길오을소 리걸오소어리라.오 소바리오보소 리같오은소리 오사소람리들오소이리 오무소리어오소라리 "
				+ "오비소웃리오든소 리간오소에리.오 소-리죽오은소리 오시소인리의오 소리사오회 소중리-오";

		
		String eBook1 = eBook.replace("오", "")
						       .replace("소","")
						       .replace("리","");
		
		System.out.println(eBook1);
		
}
}
