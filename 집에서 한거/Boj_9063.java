package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_9063 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[][] numArr = new int[num][2];
		int max_X = -10001;
		int max_Y = -10001;
		int min_X = 10000;
		int min_Y = 10000;
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			numArr[i][0] = Integer.parseInt(st.nextToken());	//x좌표입력
			numArr[i][1] = Integer.parseInt(st.nextToken());	//y좌표입력
		}
		
		for(int i = 0; i < num; i++) {
			if(numArr[i][0]>max_X) {
				max_X = numArr[i][0];
			}
			if(numArr[i][0] < min_X) {
				min_X = numArr[i][0];
			}
		}
		
		for(int i = 0; i < num; i++) {
			if(numArr[i][1]>max_Y) {
				max_Y = numArr[i][1];
			}
			if(numArr[i][1] < min_Y) {
				min_Y = numArr[i][1];
			}
		}
		
		bw.write((max_X-min_X)*(max_Y-min_Y) +"");
		bw.flush();
		bw.close();
		br.close();
	}

}
