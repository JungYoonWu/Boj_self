package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10810 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		
		StringTokenizer st1 = new StringTokenizer(inStr, " ");	//첫줄에 입력받은 값은 첫번째 값이 바구니의 수, 공백으로 구분된 다음 입력값이 공을 넣는 횟수
		
		int boxNum = Integer.parseInt(st1.nextToken());
		int inputNum =Integer.parseInt(st1.nextToken());
		
		int[] boxArr = new int[boxNum];	//토큰으로 처음값인 바구니의 수를 배열의 크기로 지정
		
		for(int i = 0; i<boxArr.length; i++) {
			boxArr[i] = 0;
		}
		
		for(int num = 1; num <= inputNum; num++) {	//두번째 토큰값인 입력횟수로 for문 반복
			String ijk = br.readLine();
			StringTokenizer st2 = new StringTokenizer(ijk, " ");
			
			int i = Integer.parseInt(st2.nextToken()), j = Integer.parseInt(st2.nextToken()), k = Integer.parseInt(st2.nextToken());
			
			for(int box = i-1; box < j; box++) {
				boxArr[box] = k;
			}
			
		}
		
		for(int i = 0; i < boxArr.length; i++) {
			System.out.print(boxArr[i] + " ");
		}
	}

}
