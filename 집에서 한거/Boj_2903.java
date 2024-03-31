package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_2903 {

	public static void main(String[] args) throws IOException{
		//한번하면 3의제곱 두번하면 5의제곱 세번하면 9의제곱 네번하면 17의제곱 다섯번하면 33의제곱
		//An = 2An-1 + 1
		//An = 2^(n-1) + 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());	//입력받는 숫자는 규칙을 적용한 횟수 항의 수는 규칙을 적용받는 수보다 1큼
		int N = num + 1;
		int two = 1;
		for(int i = 1; i<N; i++) {
			two *= 2;
		}
		bw.write((two+1)*(two+1)+""); //bw에 값을 적어두는곳
		bw.flush();					//bw에 적은거 다 출력하고 비우는곳
		bw.close();
		br.close();
	}

}
