package Chapter05.copy;

public class Quesition07_08 {
	public static void main(String[] args) {
		
		int[][] array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		// 배열 전체 항목의 합과 평균값을 구하시오.

		int sum=0;
		double avg= 0.0;
		int count = 0;
		for(int i =0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
			
		}
//		avg = sum/(array[0].length + array[1].length + array[2].length);
		avg = sum/count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
		
		
		// 주어진 배열의 항목에서 최대값을 구하시오.

		int max = 0;
		int[] array1 = {1, 5, 3, 8, 2};
		
		
		for(int i=0; i<array1.length; i++) {
			if(max<array1[i]) {
				max = array1[i];
			}else {
				continue;
			}
		}
		System.out.println("max: " + max);
		
		
		
		
		
	
	}
}
