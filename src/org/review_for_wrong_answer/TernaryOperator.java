package quesition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class TernaryOperator {

	public static void main(String[] args) throws IOException {
		// BufferedReader를 이용하여 입력 받아 두수중 큰 수를 출력하시오 (단, 비교연산은 삼항연산자)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
        bw.write("Input A: "   );
        
        bw.flush();

        String s = br.readLine();
        
        
		
		
		bw.write("Input B: "  );
		
		bw.flush();

		String n = br.readLine();
		
		
		int A = Integer.parseInt(s);
		int B = Integer.parseInt(n);
		
		int C = (A < B) ? B : A;
		
		bw.newLine();
		
		bw.write("큰 수 : " + C);
	
		bw.flush();
		
		
	}

}
