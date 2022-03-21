package cal3;

public class Submit04 {

	public static void main(String[] args) {
		String example = "a3b2c4d1a2h4";
		String result = "";
		int x;
		x = Character.getNumericValue(example.charAt(1));
		System.out.println(x);
		System.out.println(x + 3);
		System.out.println("================================");
		

		for (int i = 0; i < example.length(); i++) {
			

			if (Character.isDigit(example.charAt(i))) {
				Character.getNumericValue(example.charAt(i));
				x = Character.getNumericValue(example.charAt(i));
				for(int j = 1; j < x ; j++) {
				result += example.charAt(i-1);
				}
			}else {
				result += example.charAt(i);
			}
		}System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
