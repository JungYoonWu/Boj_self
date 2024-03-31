package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_3009 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] dotOne = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};	//첫번째 입력받은 점
		st = new StringTokenizer(br.readLine(), " ");
		int[] dotTwo = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine(), " ");
		int[] dotThree = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		int x,y;
		
		if(dotOne[0] == dotTwo[0]) { //처음 입력받은 x랑 두번째 x랑 같으면 3번째 x랑 비어있는 x랑 같음
			x = dotThree[0];
		}else if(dotOne[0] == dotThree[0]) {
			x = dotTwo[0];
		}else {
			x = dotOne[0];
		}
		
		if(dotOne[1] == dotTwo[1]) { //처음 입력받은 y랑 두번째 y랑 같으면 3번째 y랑 비어있는 y랑 같음
			y = dotThree[1];
		}else if(dotOne[1] == dotThree[1]) {
			y = dotTwo[1];
		}else {
			y = dotOne[1];
		}
		
		bw.write(x + " " + y +"");
		bw.flush();
		bw.close();
		br.close();
		
	}

}
