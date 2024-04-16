package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_3052 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] numArr = new int [10];
		int count = 0;
		//숫자 열개 입력 받아서 나머지 10개 배열에 집어넣기
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			boolean tf = false;

			for(int j = i+1; j < numArr.length; j++) {
				if(numArr[i] == numArr[j]) {
					tf = true;
					break;
				}
			}
			if(tf == false) {
				count++;
			}
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
