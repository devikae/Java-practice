package org.daily_review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// HashMap�� ���� 
		// �ߺ�X 
		// ArrayList�� �޸� ������� ������ ���� 
		
		
		// Key �÷��� ���� Ű�� �����ؾ��� 
		// value Ű�� �޸� �������� �ߺ� ��� 
		
		HashMap<String, String> famMap = new HashMap<String, String>();
		
//		HashMap.add("ù°", "��");  hashmap�� .add�� �ƴ϶� .put
		famMap.put("ù°", "��");
		famMap.put("��°", "����");
		famMap.put("��°", "����");
		famMap.put("��°", "����");
		System.out.println(famMap);
		
		famMap.put("��°", "�ٺ�����");
		System.out.println(famMap);
		
		HashMap<Double, String> version = new HashMap<>();
		version.put(1.0, "������");
		version.put(2.0, "������");
		version.put(3.0, "�Ź���");
		
		System.out.println(version);
		
		System.out.println(version.size()); // ��� ������ ���� 
		
		System.out.println(version.containsKey(3.0));  // 3.0�̶�� Ű ���� �־ true ���� 
		
		System.out.println(version.get(3.0));  // Ű3.0�� �ش��ϴ� value ���� = �Ź���
		
		
		//HashMap ���� ������ ������ ��ǥ�� 3���� ��� 
		
		
		// 1.keySet�� �̿��� for�� 
		Set<String> keySet = famMap.keySet();
		
		for(String key : famMap.keySet()) {
			System.out.println(famMap.get(keySet)); // �� null���� 4�� �������� �𸣰ڴ� 
		}
		
		for(String key : famMap.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s",key, famMap.get(key))); // ����� ��µ� 
		}
		
		System.out.println("\n");
		// 2.entrySet�� �̿��� for�� 
	    // HashMap�� ����� Key -Value ���� ��Ʈ��(Ű�� ���� ����)�� ���·� Set�� �����Ͽ� ��ȯ 
		Set<Entry<String, String>> entrySet = famMap.entrySet();
		
		for(Entry<String, String> entry : entrySet){
			System.out.printf("Ű = %s, �� = %s", entry.getKey(),entry.getValue());
		}
			System.out.println("\n");
		// 3.Iterator�� �̿��� while�� 	
			
		Iterator<String>keys= famMap.keySet().iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Ű: %s , ��: %s ", key, famMap.get(key))); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		

}	


