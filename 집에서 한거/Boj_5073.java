package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_5073 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int A,B,C;
		
		do {
			String inStr = br.readLine();
	//		br.close();			
			StringTokenizer st = new StringTokenizer(inStr, " ");
			
			A = Integer.parseInt(st.nextToken()); B = Integer.parseInt(st.nextToken()); C = Integer.parseInt(st.nextToken());

			int max=A;
			if(max<B) max = B;
			if(max<C) max = C;
			
			if(max == 0) continue;
			
			if(max>= A+B+C-max) {
				sb.append("Invalid").append('\n');
				continue;
			}
			
			if(A==B && A==C) {
				sb.append("Equilateral").append('\n');
			}else if((A==B&&A!=C)||(A==C&&A!=B)||(B==C&&A!=B)){
				sb.append("Isosceles").append('\n');
			}else {
				sb.append("Scalene").append('\n');
				
			}
			
		}while(A!=0||B!=0||C!=0);
		System.out.print(sb);
	}

}
