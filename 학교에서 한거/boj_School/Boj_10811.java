package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10811 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int numN = Integer.parseInt(st.nextToken());
		int numM = Integer.parseInt(st.nextToken());
		
		int [] basket = new int[numN];
		//바구니에 1번부터 N번까지 번호 부여
		for(int i = 0; i < numN; i++) {
			basket[i] = i+1;
		}
		//바구니를 역순으로 뒤집는 횟수만큼 반복문 반복
		for(int i = 1; i <= numM; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			swapArr(basket, start, end);
		}
		
		displayResult(basket);
	}
	//역순으로 뒤집을 배열, 역순으로 바꿀 시작지점, 끝나는 지점을 각각 파라미터로 받는 매소드
	static int[] swapArr(int[] numArr, int startBasket, int endBasket) {
		
		for(int i = 0; i<=(endBasket-startBasket)/2; i++) {
			int temp = numArr[startBasket-1+i];
			numArr[startBasket-1+i] = numArr[endBasket-1-i];
			numArr[endBasket-1-i] = temp;
		}
		return numArr;
	}
	static void displayResult(int[]numArr) {
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+" ");
		}
	}

}
