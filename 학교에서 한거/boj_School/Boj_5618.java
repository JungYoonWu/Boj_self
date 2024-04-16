package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_5618 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/*
		//처음 입력은 2또는 3
		int count = Integer.parseInt(br.readLine());
		int num[] = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<count; i++) {
			num[i] = Integer.parseInt(st.nextToken());
//			System.out.print(num[i] + " ");
		}
		
		if(num.length == 2) {
			//최소값 설정
			if(num[0] > num[1]) {
				for(int i = 1; i <= num[1]; i++) {
					if(num[0]%i==0 && num[1]%i==0) {
						bw.write(i + "");
						bw.newLine();
					}
				}
			}else {
				for(int i = 1; i <= num[0]; i++) {
					if(num[0]%i==0 && num[1]%i==0) {
						bw.write(i + "");
						bw.newLine();
					}
				}
			}
		}else {
			if(num[0]<num[1] && num[0]<num[2]) {
				for(int i = 1; i <= num[0]; i++) {
					if(num[0]%i==0 && num[1]%i==0 &&num[2]%i==0) {
						bw.write(i + "");
						bw.newLine();
					}
				}
			}else if(num[1]<num[0] && num[1]<num[2]) {
				for(int i = 1; i <= num[0]; i++) {
					if(num[0]%i==0 && num[1]%i==0 &&num[2]%2==0) {
						bw.write(i + "");
						bw.newLine();
					}
				}
			}else {
				for(int i = 1; i <= num[0]; i++) {
					if(num[0]%i==0 && num[1]%i==0 &&num[2]%2==0) {
						bw.write(i + "");
						bw.newLine();
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		*/
		
		int count = Integer.parseInt(br.readLine());
		int numArr[] = new int [count];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < count; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		
		
	}

}
