package org.daily_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		//���� ��� collection List�� ���� 
		
		//ArrayList�� ������ 
		//< >���׸� �ȿ� Ÿ�� ����  
		
		ArrayList<String> brendList = new ArrayList<String>();
		
		ArrayList <Integer> intList = new ArrayList<Integer>();
		
		//ArrayList�� ������ ��� ����� ��������?  .add()
		
		brendList.add("����Ű");
		brendList.add("�Ƶ�ٽ�");
		brendList.add("����������");
		brendList.add("�����");
		
		
		intList.add(12);
		intList.add(13);
		intList.add(14);
		
		System.out.println(brendList);

		System.out.println(intList);
		
		// .get() �ε��� ��ȣ�� ���� �ϳ��� ��� ���� 
		
		System.out.println(brendList.get(0));
		System.out.println(intList.get(0));
		
		// .size() �迭�� ũ�⸦ �� ������ 
		
		System.out.println("brendList�� ũ�� : " + brendList.size());
		System.out.println("intList�� ũ�� : " + intList.size());
		
		brendList.add(3, "��ƾ����");
		
		// .get("��", �ε����ѹ�) �ε��� �ѹ� �ڸ��� ������ �����ֱ� ���� ���� ������ �ڷ� �и� 
		System.out.println(brendList);
		
		
		// .isEmpty boolean������ ��� ������� �ʱ⶧���� false
		System.out.println(brendList.isEmpty());
		
		// .remove() �ش� �ε����� ����� ������ ����
		brendList.remove(0);
		System.out.println(brendList);
		
		//����Ʈ ���� ��� 
		
		//���.1
		ArrayList<String> copyList = new ArrayList<String>();
		copyList.addAll(brendList);
		System.out.println(copyList);
		
		//���2
		ArrayList<Integer> copyint = new ArrayList<Integer>(intList);
		System.out.println(copyint);  
		
		int idx=0;
		copyList.clear();
		
		for(String name : brendList) {
			if(idx %2 == 0) {          // for���� �̿��� �ε��� ¦���ڸ��� �����Ͱ��� ����
				copyList.add(name);
			}
			idx++;
		}
		System.out.println(copyList);
		
		
		//���� �ָ鼭 ���� 
		
		ArrayList<String> NewList = new ArrayList<String>(Arrays.asList("c", "d", "a")); 
		
		
		//�������� ����
		Collections.sort(NewList);
		
		
		System.out.println(NewList);
		
		
		
		

	}

}
