package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14215 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int max = A;
		int sum = 0;
		boolean tf = true;
		
		if(B > max) {max = B;}
		if(C > max) {max = C;}
		
//		System.out.println(max);  //최대값 확인용
		
		while(tf) {
			
			if(max==A) {
				if(max < (B+C)) {
					sum = max + B + C;
				}else if(max == B+C){
					sum = (max-1)+B+C;
				}else {
					for(int i=1; max>=B+C ; i++) {
						max -= 1;
					}
					sum = max+B+C;
				}
				
				break;
			}
			
			if(max==B) {
				if(max < (A+C)) {
					sum = max + A + C;
				}else if(max == A+C){
					sum = (max-1)+A+C;
				}else {
					for(int i=1; max>=A+C ; i++) {
						max -= 1;
						
					}
					sum = max+A+C;
					
				}
				
				break;
			}
			
			if(max==C) {
				if(max < (B+A)) {
					sum = max + B+A;
				}else if(max == B+A){
					sum = (max-1)+B+A;
				}else {
					for(int i=1; max>=B+A ; i++) {
						max -= 1;
					}
					sum = max+B+A;
				}
				
				break;
			}
			
		}
		System.out.println(sum);
	}

}
