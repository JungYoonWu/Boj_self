package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_9063Mk2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int minX=10001, minY=10001, maxX=-10001, maxY=-10001;
		
		for(int i = 0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x > maxX) maxX = x;
			if(y > maxY) maxY = y;
			if(x < minX) minX = x;
			if(y < minY) minY = y;
			
			
		}
		
		bw.write((maxX-minX)*(maxY-minY)+"");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
