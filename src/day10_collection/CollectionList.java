package day10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		// "ArrayList의 선언 방법" 
		// 제네릭:  < > 안에 타입을 선언해둬야 데이터를 꺼내어 쓸 때 따로 타입 검사를 하지 않아도 된다. 
		// 기본 타입 : 숫자(정수/실수) 와 boolean(T/F)의 경우 Wrapper 클래스 사용해야함 
		
		
		// 1. 
		ArrayList<String> students = new ArrayList<String>();     // 문자열만 담을 수 있는 
		String[] strArray = new String[4];
		
		
		// 2.
		ArrayList<String> students2 = new ArrayList<>();          // 이렇게도 선언 할 수 있지만 위와 같이 명시적으로 선언해주는게 알아보기 좋음 
		
		//타입의 변경 
		//int 타입 선언 
		int[] intArray = new int[5];
		ArrayList<Integer> intList = new ArrayList<Integer>();    // int라고 하면 오류남 "Integer"
		

		//Wrapper class > 기본 타입의 데이터를 객체로 취급해야 하는 경우 사용
		int intVal = 12;
		
		//(Boxing)
		Integer intval = new Integer(12); // 기본타입의 데이터(12)를 래퍼 클래스의 인스턴스로 변환 
		Integer intval2 =12;              // 이렇게 해도 들어가긴 함 AUTU BOXING으로 인해 (암시적형변환 처럼 자동으로 해줌)
		
		
		//(UnBoxing)
		//wrapper class의 인스턴스에 저장된 값을 기본 타입의 데이터로 꺼냄 
		int n = intval.intValue();
		
		int n2 = intval;                  //AUTO UnBoxing
	
		
		System.out.println("=================================================================================================================================");
		
		//"ArrayList에 값을 담아보자 
		
		students.add("사오정");
		students.add("저팔계");
		students.add("삼장");
		students.add("손오공");
		
		//제너릭 < > 타입과 일치하는 데이터만 추가 가능 
		
		//students.add(1); // 정수 타입 담을 수 없음 
		
		System.out.println(students);
		
		System.out.println("=================================================================================================================================");
		
		// .size()        .length와 같음 ArrayList는 .size() 사용  
		
		System.out.println(students.size());  // 4개 담아서 4 
		System.out.println(students2.size()); // 0 
		
		System.out.println(strArray.length); // 배열의 경우 크기를 지정했기 때문에 값이 저장되어 있지 않아도 4라는 값이 출력됨 
		
		
		// .add()  (인덱스, 값) 넣기 
		students.add(1, "주석");
		System.out.println(students);        //인덱스 1의 자리였던 저팔계가 밀리고 들어감 >> 밀어넣기 ㅆㄱ
		
		// .set()  (인덱스, 값) 넣기 
		//  해당 리스트의 인덱스 값을 수정 
		students.set(1, "주석님");
		System.out.println(students);        // "주석"이라는 값이 "주석님"으로 바뀜 
		
		// .contains() 리스트 안에 해당 데이터가 존재하는지 검색할 때 사용 (True/False)로 반환 
		System.out.println(students.contains("주석님"));         // "set으로 "주석"> "주석님" 으로 변경했기 때문에 true 출력 
		
		
		// .indexOf() 리스트 안에 해당 데이터가 존재한다면 인덱스 리턴, 없다면 -1 리턴 
		// -1의 리턴 여부로 .contains() 처럼 사용이 가능하다
		
		System.out.println(students.indexOf("손오공"));  
		System.out.println(students.indexOf("주석"));   // 없기 때문에 -1 "주석님"을 넣는다면 "주석님"의 인덱스 1 리턴
		
		
		// .get() 해당 인덱스에 저장된 데이터를 리턴 (리스트도 인덱스 0부터 시작)
		System.out.println(students.get(3));          // 리스트는 get으로 접근 
		
		
		// .isEmpty() 리스트가 비어있는지 (True/False) 로 반환 
		// .size() == 0 체크하는것과 같음 
		System.out.println(students.isEmpty());   // 값이 담겨있어서 false
		System.out.println(students2.isEmpty());   
		System.out.println(students.size() == 0);  // false 값이 담겨 있기 때문에 
		System.out.println(students2.size() == 0);  // 
		
		
		// remove() 해당 인덱스의 데이터를 삭제  remove(인덱스나 값)
		students.remove(1);
		System.out.println(students);             // 인덱스 1의 자리에 있던 "주석님" 제거 
		students.remove("삼장");                   // 해당 값을 넣어서도 사용 가능 
		System.out.println(students);             
		students.remove("파이리");                 //  **** 없는 값을 지우라고 명령해도 오류가 나지 않음 
		
		
		// .clear() 해당 리스트를 비움 (size가 0이 된다) 
		students.clear();
		System.out.println(students.isEmpty());    // 값을 모두 지웠기 때문에 true
		System.out.println(students);              // 클리어로 값을 모두 지워도 []로 나옴 
		
		students = new ArrayList<String>();        //클리어를 굳이 하지 않아도 재선언 하면 클리어와 같이 사용 가능 
		System.out.println(students);
		
		students.add("주석");
		students.add("이주석");
		students.add("이주색");
		students.add("이주섹");
		
		// for문으로 List 제어 
		for(int i = 0; i < students.size(); i++) {
			students.set(i, i+students.get(i));
			
		}
		System.out.println(students);
		
		System.out.println("========================================리스트 복사======================================== ");
		
		//잘못된 리스트 복사 방법 
		ArrayList<String> copyList = students;
		System.out.println(copyList);
		copyList.set(0, "0유진");
		System.out.println(students);

		
		// 리스트의 복사방법 1
		ArrayList<String> copyList2 = new ArrayList<String>();
		copyList2.addAll(students);
		System.out.println(copyList2);
		copyList2.set(0, "0철현");
		System.out.println(copyList2);    
		System.out.println(students);
		
		
		// 리스트 복사방법 2
		ArrayList<String> copyList3 = new ArrayList<String>(students);     // <<선언시 마지막 소괄호에 넣으면 복사 됨 
		System.out.println(copyList3);
		
		// 리스트 복사방법 3
		ArrayList<String> copyList4 = new ArrayList<String>();
		for(int i = 0; i < students.size(); i++) {
			copyList4.add(students.get(i));
		}
		System.out.println(copyList4);
		
		//for-each문 
		for(String i : students) {     // for문이 돌 때 마다 i의 값에 students의 배열에 요소 순환 
			System.out.println(i);
		} // 인덱스가 존재하는 ArrayList에서는 썩 유용한 정도는 아님
		
		
		//홀 수 번째만 copyList4에 담아야 한다면 ?
		copyList4.clear();
		int idx = 0;
		
		for(String name : students) {
			if(idx % 2 == 1) {
				copyList4.add(name);
			}
			idx++;
		}
		System.out.println(copyList4);
		
		System.out.println("==============================================================================================");
		
		students.forEach(new Consumer<String>(){
				
			public void accept(String name) {
				System.out.println(name);
			
		}
	});
	
		//람다식
		students.forEach(name -> System.out.println(name));
		students.forEach(name -> {
		                          System.out.println(name);
		                          System.out.println(name);
		                          System.out.println(name);
		});
		
		
		System.out.println("=============================================정렬=============================================");
		
		//값을 주면서 List 선언 
		intList = new ArrayList<Integer>(Arrays.asList(
				30, 15, 20, 13, 11, 40, 22));
		
//		int[] intArr = {30, 15, 20, 13, 11, 40, 22};
		
		
		
		// "버블 정렬"
		for(int i =0; i< intList.size(); i++) {
			boolean swapped = false;
				
			
			for(int j =0; j<(intList.size()-1 )-i; j++) {
				if(intList.get(j) > intList.get(j+1)) {
					int temp = intList.get(j);
//					intList[j] = intList[j+1];
					intList.set(j, intList.get(j+1));
//					intList[j+1] = temp;
					intList.set(j+1, temp);
					swapped = true;
				}//for-2                 if문
				
			}// for-1
			if(swapped == false) {
				System.out.println("이미 정렬 완료");
				break;
			}
			System.out.println(i + "회 시행");
			
		}
		System.out.println(intList);
		
		
		
		intList = new ArrayList<Integer>(Arrays.asList(
				30, 15, 20, 13, 11, 40, 22));
		
		
		// 제공되는 메소드로 한방에 정렬 해결 
		Collections.sort(intList);                                 // 오름차순 정렬 
		System.out.println(intList);     
		
		Collections.sort(intList, Collections.reverseOrder());     // 내림차순 정렬
		System.out.println(intList);
		
		
		System.out.println("==========================================================");
		
		ArrayList<String> strList = new ArrayList<String>(
				Arrays.asList("C", "A", "B", "c", "a"));
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Collections.sort(strList, Collections.reverseOrder());   
		System.out.println(strList);
		
		ArrayList<String> strList2 = new ArrayList<String>(
				Arrays.asList("라", "다", "가", "머"));
		Collections.sort(strList2);
		System.out.println(strList2);
		
		// 대소문자 구분 없이 정렬 
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		System.out.println(strList);
		
		Collections.sort(strList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));  // 
		System.out.println(strList);
		
		
	}

}
