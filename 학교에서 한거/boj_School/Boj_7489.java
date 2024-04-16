package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_7489 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		char nonZero = '0';
		for(int i = 1; i <= num; i++) {
			int facto = Integer.parseInt(br.readLine());
			int temp = 0;
			int factorial = 1;
			if(facto==0 || facto==1) {
				temp=1;
			}else {
				
			
//			long non_zeroDigit = 0;
			
			for(int j = 1; j<=facto; j++) {
				factorial *= j;				
				temp = factorial;
				
				if(temp%10 == 0) {
					temp /= 10;
				}
				//김모군
			}
			}
//			boolean loop_tf = true;
//			while(loop_tf) {
//				if(temp%10 != 0) {
//					non_zeroDigit = temp%10;
//					loop_tf = false;
//				}
//				temp/=10;
//			}
			String result = temp+"";
			for(int j = 0 ; j<result.length(); j++) {
				if(result.charAt(result.length()-1-j) !='0') {
					nonZero = result.charAt(result.length()-1-j);
					break;
				}
			}
			
			bw.write(nonZero + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
