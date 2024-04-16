package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_2501 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int numN = Integer.parseInt(st.nextToken());
		int numK = Integer.parseInt(st.nextToken());
		int count = 0;
		int result = 0;
		for(int i=1; i <= numN; i=i+1) {
			if(numN%i==0) {
				count++;
				result = i;
				if(numK == count) {
					break;
				}
			}
			
		}
		
		if(numK>count) {
			bw.write(0+"");
		}else {
			bw.write(result+"");
		}
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
