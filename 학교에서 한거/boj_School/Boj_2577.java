package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_2577 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int numA = Integer.parseInt(br.readLine());
		int numB = Integer.parseInt(br.readLine());
		int numC = Integer.parseInt(br.readLine());
		
		int[] countList = new int [10];
		for(int i = 0; i < 10; i++) {
			countList[i] = 0;
		}
		
		String multiplyABC = numA*numB*numC + "";
	
		for(int i = 0; i < multiplyABC.length(); i++) {
			for(int j = 0; j <= 9; j++) {
				if(Character.getNumericValue(multiplyABC.charAt(i)) == j) {
					countList[j]++;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			bw.write(countList[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
