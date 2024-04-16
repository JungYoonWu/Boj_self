package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2745 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String cardB = st.nextToken();
		int notationB = Integer.parseInt(st.nextToken());
		System.out.println(convTenNum(cardB, notationB));
		
	}
	static int convTenNum(String cardNum, int notationNum) {
		String card = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int result = 0;
		int power = 1;
		for(int i = cardNum.length()-1; i >= 0 ; i--) {
			char c = cardNum.charAt(i);	// 입력받은 진법 수의 맨 오른쪽(가장 작은 자릿수) 값 
			int value = card.indexOf(c);// 문자 c가 문자열 card에서의 인덱스를 반환해서 value에 대입
			result += value*power;		// 결과에 현재 자릿수의 값을 곱하여 더함
			power *= notationNum;		// 다음 자릿수의 값을 계산하기 위해 지수를 증가
		}
		return result;
	}

}
