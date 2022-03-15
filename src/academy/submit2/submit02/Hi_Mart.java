package submit2.submit02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hi_Mart {

	private static final List Product = null;

	public static void main(String[] args) {
			
		Product icebox = new Product("냉장고" , 2000000);
		Product tv = new Product("TV" , 1000000);
		Product ac = new Product("에어컨" , 800000);
		Product com = new Product("컴퓨터" , 1300000);
		Product fan = new Product("선풍기" , 100000);
		
		ArrayList<Product> itemList = new ArrayList<Product>();
		itemList.add(icebox);
		itemList.add(tv);
		itemList.add(ac);
		itemList.add(com);
		itemList.add(fan);
		
		Collections.sort(itemList);
		System.out.println(itemList);
		
		
		for(int i = 0; i< itemList.size(); i++) {
			
			if(itemList.get(i).getName().equals("TV")) {
				System.out.println("TV의 인덱스"+i);
				
			}
			
		}
		
		
		
		
	
		

		
	
		
	}

}
