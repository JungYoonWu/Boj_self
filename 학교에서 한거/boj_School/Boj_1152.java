package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_1152 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inStr = br.readLine();
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		bw.write(st.countTokens() +"");
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
