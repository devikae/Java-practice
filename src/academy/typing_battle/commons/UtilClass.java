package typing_battle.commons;

import java.text.DecimalFormat;
import java.util.ArrayList;

import typing_battle.model.WordVO;

public class UtilClass {
	
	// 숫자를 천 단위마다 "," 붙여주는 메소드
	public static String strMoney(int money) {
		DecimalFormat deciFormat = new DecimalFormat("#,###");
		return deciFormat.format(money);
		
	}
	
	// wordList에서 랜덤한 10개의 문자열을 추출한 List 리턴
	public static ArrayList<WordVO> randArray(ArrayList<WordVO> wordList){
		// 0부터 wordList.size()-1 까지 (인덱스)의 랜덤숫자를 10개 추출 
		// 중복되지 않도록 리스트에 담을 예정
		
		ArrayList<Integer> randIdxList = new ArrayList<Integer>();
		
		while(randIdxList.size() < 10) { // 사이즈가 10을 넘는 순간 멈추는 
			int randInt =(int) (Math.random() * wordList.size()); // 랜덤인덱스 생성 
			
			if(randIdxList.indexOf(randInt) != -1) { // 중복제거 
				randIdxList.add(randInt); // 생성 후 List에 담기
				
			}
		}
		// randIdxList = [5, 1, 0, 3, 9, 21, 17] 이렇게 들어 있다면 wordList에서 randIdxList의 요소들에 해당하는 
		// WordVO들만 꺼내 담아서 return
		ArrayList<WordVO> result = new ArrayList<WordVO>();
		for(int i = 0; i < randIdxList.size(); i++) {
			result.add(wordList.get(randIdxList.get(i))); 
		}
		
		
		return result;
	}
	
	
	
	
}
