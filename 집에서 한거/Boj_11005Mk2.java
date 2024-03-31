package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11005Mk2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		char[] cardNum = new char[64];
		long num1;
		int num2;
		int numDigit = 0;
//		char temp;
//		boolean start = false;
//		int lastIndex = -1;
		String card = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		num1 = Integer.parseInt(st.nextToken());
		num2 = Integer.parseInt(st.nextToken());
		
		
		br.close();
		//받은 수를 진법으로 변환
		do {
//			System.out.print(numDigit);
			cardNum[numDigit++] = card.charAt((int) (num1%num2));
			num1 = num1/num2;
//			System.out.print(cardNum[numDigit]);
			
		}while(num1>0);  	//numDigit이 index마지막+1 값까지 증가함 numDigit이 길이값이 됨
		
		
		
		//진법 변환된 숫자
//		for(int i = 0; i<numDigit/2; i++) {
//			temp = cardNum[i];
//			cardNum[i] = cardNum[numDigit-i-1];
//			cardNum[numDigit-i-1] = temp;
//	}
		
		//cardNum에 저장한 값 출력
		for(int i = numDigit-1; i>=0; i--) {
//			if(cardNum[i] != '0' || start) {
				System.out.print(cardNum[i]);
//				start = true; 			// 첫값이 0이 아닌값이면 그 뒤의 값중에 0이 나오는건 진법에 표현되는 값이기때문에 출력 해줘야 함
//			}
			
		}
		
		
		
	}

}
