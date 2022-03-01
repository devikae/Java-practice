package submit;

public class Submit08 {

	public static void main(String[] args) {
		
		String example = "aaabbcdddaeefffffgg";

		String x = "aaabbcdddaeefffffgg" + " ";

		String result = "";
		
		int cnt = 1;
		
									
		for (int i = 0; i < x.length() - 1; i++) {
			
			if (x.charAt(i) == x.charAt(i + 1)) {
				cnt++;
			} else {
				result += x.charAt(i);
				result += cnt;
				cnt = 1;
			}
		}
		System.out.println(result);
	}
}