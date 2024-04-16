package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		char[] numFirst = (st.nextToken()).toCharArray();
		char[] numSecond = (st.nextToken()).toCharArray();
				
		swapArr(numFirst);
		swapArr(numSecond);
		
//		System.out.println(numFirst);
//		System.out.println(numSecond);
		
		int numFirst_Sang = convDecimal(numFirst);
		int numSecond_Sang = convDecimal(numSecond);
		
		if(numFirst_Sang > numSecond_Sang) {
			System.out.println(numFirst_Sang);
		}else {
			System.out.println(numSecond_Sang);
		}
	}
	
	static char[] swapArr(char[] charArr) {
		
		for(int i = 0; i < charArr.length/2; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[charArr.length-1-i];
			charArr[charArr.length-1-i] = temp;
		}
		
		
		return charArr;
	}
	static int convDecimal(char[] charArr) {
		
		int decimal =0;
		
		decimal = (charArr[0]-'0')*100 + (charArr[1]-'0')*10 + (charArr[2]-'0'); 

		return decimal;
	}
}
