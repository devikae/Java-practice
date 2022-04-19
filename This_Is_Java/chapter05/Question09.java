package Chapter05.copy;

import java.util.Scanner;

public class Question09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		int select = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================");
			System.out.print("선택> ");

			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
			
			if(select == 1) { // 학생 수
				System.out.print("학생수> ");
				try {
					select = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("숫자만 입력해주세요.");
					continue;
				}
				studentNum = select;
				score = new int[studentNum];
				
			}else if(select ==2) { // 점수입력
				for(int i=0; i<score.length; i++) {
					System.out.print("score["+i+"]> ");
					try {
						select = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("숫자만 입력해주세요.");
						continue;
					}
					score[i] = select;
					
					
				}
				
			}else if(select ==3) { // 점수 리스트
				for(int i =0; i<score.length; i++) {
					System.out.println("score["+ i + "]: " + score[i]);
				}
				
			}else if(select ==4) { // 분석
				int sum =0;
				double avg = 0;
				int best =0;
				
				for(int i=0; i<score.length; i++) {
					if(best<score[i]) {
						best=score[i];
					}else {
						continue;
					}
				}
				
				for(int i=0; i<score.length; i++) {
					sum += score[i];
				}
				
				avg = sum / score.length;
				
				System.out.println("최고 점수: " + best);
				System.out.println("평균 점수: " + avg);
				
				
			}else if(select ==5) { // 종료
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
