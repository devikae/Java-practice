package org.daily_review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
//		HashSet 
//		Ư¡: �ε��� ����(������ ����), �ߺ��� ������� ���� 
		
		HashSet<String> brendSet = new HashSet<String>();
		
		brendSet.add("LG");
		brendSet.add("SAMSUNG");
		brendSet.add("APPLE");
		System.out.println(brendSet);  
		
//		Set ��ȸ 
		
		Iterator<String> iterator = brendSet.iterator();
		
		
//		while 
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}System.out.println("======");

		
		
		//�ߺ��� ���� ����� �ʴ°� �̿��� �ߺ� ���� 
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i< 10; i++) {     //intList�� 0~9���� ���� ��� 
			intList.add(i);
		}
		
		for(int i = 4; i<10; i++) {      // intList�� 4~9���� ���� ��� 
			intList.add(i);
		}
		
		System.out.println(intList);      
		
		HashSet<Integer> tempSet = new HashSet<Integer>(intList); //tempSet�� intList���� ����
		
		System.out.println(tempSet);  // tempSet ��� > �ߺ��� ����� 
		
		
		//HashSet�� �ٽ� ArrayList�� ��ȯ 
		intList.clear();
		
		intList.addAll(tempSet); 
		System.out.println(intList);      // �缱�� �� tempSet�� ���� intList�� ���� 
		
	}

}
