package day10_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import day9_array.Array01;

public class CollectionQeusition {

    static HashMap<String, String> infoMap = new HashMap<String, String>();
	
	public static void main(String[] args) {
		// makeLotto를 ArrayList와 HashSet을 이용해서 만들어보자

		System.out.println("====================로또 추첨기=======================");

		ArrayList<Integer> myLotto = new ArrayList<Integer>();

		HashSet<Integer> myLotto2 = new HashSet<Integer>();

		while (myLotto2.size() < 7) {
			myLotto2.add((int) ((Math.random() * 45) + 1));
		}
		myLotto.addAll(myLotto2);
		Collections.sort(myLotto);
		System.out.println("dddd");
		System.out.println(myLotto);

		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		HashSet<Integer> lotNum = new HashSet<Integer>();

		// 지훈이형 코드

		for (int i = 0; i < 6; i++) {
			int lotto = (int) (Math.random() * 45 + 1);
			lotNum.add(lotto);

			if (lotNum.size() == 6) {
				break;
			}
		}
		lottoNum.addAll(lotNum);
		Collections.sort(lottoNum);
		System.out.println("233213");
		System.out.println(lottoNum);

		System.out.println("25922");
		makeLotto();
		
		// 굳이 Set을 쓰지 않더라도 중복제거 정도는 ArrayList로 처리 ㄱㄴ 
		
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}

		for (int i = 4; i < 10; i++) {
			intList.add(i);
		}
		
		ArrayList<Integer> intArray = new ArrayList<Integer>(); 
		
		for(int i =0; i < intList.size(); i++) {
			
			if(intArray.indexOf(intList.get(i)) == -1) {
				intArray.add(intList.get(i));
			}
		}
		System.out.println(intArray);
		
		System.out.println("=============================================================================");
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		// 사용자가 아이디와 비밀번호를 파라미터로 넣었을 때 infoMap의 key(아이디) 와 Value(비밀번호)가 일치하는지 
		// 일치하면 true / 다르면 false를 리턴하는 함수를 만들어보세요 
		
		
		System.out.println(logincheck("a001", "sfafafsa"));
		System.out.println(logincheck("a001", "1234a"));
		
		
	}// 메인
	
	
	static boolean logincheck(String id, String pw) {
		
//		if(pw.equals(infoMap.get(id))) {
//			return true;
//		}
//		return false;
//		
		return pw.equals(infoMap.get(id));
	}
	
	
	
	
	
	
	
	
	

	// 강사님이 만든 로또
	static void makeLotto() {
		HashSet<Integer> tempSet = new HashSet<Integer>();
		while (tempSet.size() <= 6) {
			int random = (int) (Math.random() * 45) + 1;
			tempSet.add(random);
		}
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		lottoList.addAll(tempSet);
		Collections.sort(lottoList);
		System.out.println(lottoList);
	}

}
