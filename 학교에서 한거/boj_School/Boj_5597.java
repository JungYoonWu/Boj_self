package boj_School;

import java.util.Scanner;

public class Boj_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] listArr = new boolean[30];
		
		for(int i = 0; i < 28; i++) {
			int attendance = sc.nextInt();
			listArr[attendance-1] = true;
		}
		
		for(int j = 0; j < listArr.length; j++) {
			if(listArr[j]!=true) {
				System.out.println(j+1);
			}
		}
		
	}

}
