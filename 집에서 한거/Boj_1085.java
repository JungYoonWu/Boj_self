package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_1085 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int minCoast_x = 1001;
		int minCoast_y = 1001;
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		if(x > w-x) {
			minCoast_x = w-x;
		}else {
			minCoast_x = x;
		}
		
		if(y > h-y) {
			minCoast_y = h-y;
		}else {
			minCoast_y = y;
		}
		
		if(minCoast_x > minCoast_y) {
			bw.write(minCoast_y + "");
		}else {
			bw.write(minCoast_x + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
