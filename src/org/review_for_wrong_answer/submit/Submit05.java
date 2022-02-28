package submit;

import java.util.Scanner;

public class Submit05 {

	public static void main(String[] args) {
		
		
		int ans = 0;
		int hint = 5;
		int des = (int) (Math.random() * 50) + 1; // 1~100 까지 랜덤 값
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <5; i++) {
			
			System.out.print("숫자를 입력 해주세요: ");
			ans = input.nextInt();
			hint--;
			
			if (hint == 0) {
				System.out.println("실패하였습니다. 정답은 " + des +"입니다.");
				break;}
			if (ans < des) {
				System.out.println("다운!! 기회가 " + hint + "번 남았습니다.  ");
			}else if (ans > des) {
				System.out.println("업!!  기회가 " + hint + "번 남았습니다.  ");
			}else if(ans == des) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("정답입니다.");
				break;}
			
			
			}
		}
		
		
	}
	





