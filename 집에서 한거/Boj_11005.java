package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11005 {

	public static void main(String[] args) throws IOException{
		//양의 숫자 입력 받기
		int[] numA = getPositiveNumber();
				
		char[] cardNum = new char[64];
		int numDigit;
		
		
		numDigit = cardConvNum(numA[0], numA[1], cardNum);
		
		displayResult(cardNum, numDigit);
		
	}
	
	//양수 입력받는 메소드
	static int[] getPositiveNumber() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		int [] inputArr = new int[2];
		
		do {
			String inStr = br.readLine();
			StringTokenizer st = new StringTokenizer(inStr, " ");
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			inputArr[0] = num1; inputArr[1] = num2;
		}while(num1<= 0||num2 <= 0);
		return inputArr;
	}
	
	static int cardConvNum(int numA, int numB, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while(numA > 0) {
			cardNum[numDigit++] = digitChar.charAt(numA%numB);
			numA = numA/numB;
		}
		return numDigit;
	}
	
	static void displayResult(char[] cardNum, int numDigit) {
		for(int i = 0; i <= numDigit-1; i++ ) {
			System.out.print(cardNum[i]);
		}//System.out.println();
	}
}