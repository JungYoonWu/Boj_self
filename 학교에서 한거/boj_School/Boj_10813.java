package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10813 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int basketNum = Integer.parseInt(st.nextToken());
		int changeNum = Integer.parseInt(st.nextToken());
		
		int [] basket = new int[basketNum];
		for(int i = 0; i<basketNum; i++) {
			basket[i] = i+1;
		}
		for(int i = 1; i <= changeNum; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int numA = Integer.parseInt(st.nextToken());
			int numB = Integer.parseInt(st.nextToken());
			int temp = basket[numA-1];
			basket[numA-1] = basket[numB-1];
			basket[numB-1] = temp;
			
		}
		for(int i = 0; i<basketNum; i++) {
			sb.append(basket[i]).append(" ");
		}
		String outStr = sb.toString();
		System.out.println(outStr.trim());
		br.close();
	}

}
