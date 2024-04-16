package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int numT = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= numT; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int numR = Integer.parseInt(st.nextToken());
			String strS = st.nextToken();
			
			for(int j = 0; j < strS.length(); j++) {
				String QR = sumString(strS.charAt(j), numR);
				bw.write(QR);
			}bw.write('\n');
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	static String sumString(char caseChar, int testNum) {
		String result ="";
		for(int i = 1; i <= testNum; i++) {
			result += caseChar;
		}
		return result;
	}
}
