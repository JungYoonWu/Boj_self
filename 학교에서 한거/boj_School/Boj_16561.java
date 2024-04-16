package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_16561 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numThree = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 1; i <= numThree/3; i++) {	//입력받은 3의 배수를 3으로 나눈 몫만큼 분배 시도
			for(int j = 1; j<=numThree/3 -i; j++) {
				//분배되는 값은 최소 1이 넘어야됨
				if((numThree/3)-i-j>=1) {
					result += 1;
				}
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
