package submit;
import java.util.Arrays;
public class Submit06 {

	public static void main(String[] args) {
		String[] nameList = {"강욱근", "오현철", "최지혜", "김남규", "황햇빛나",
				"이가은", "김범석", "조서준", "이민우", "전영", "김지훈", "이용석", "박상우",
				"이유진", "박재훈", "이주석", "소은지", "이철현", "신예반", "이원태"};

		
		int name = 0;
		
		for(int i =0; i< nameList.length; i++) {
			char X = nameList[i].charAt(0);
			
			if(X == '이') {
				name += 1;
			}
	

			
			
		}
		System.out.println("이씨 성을 가진 동기분이 총 " + name + "명 있습니다");
	}
}