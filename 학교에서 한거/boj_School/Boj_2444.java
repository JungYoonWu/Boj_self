package boj_School;

import java.util.Scanner;

public class Boj_2444 {

	public static void main(String[] args) {
		//System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j=(num-1); j >= i; j--){					//공백찍기
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*i)-1; k++ ) {						//별찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= num; i++) {
			for(int k = 1; k <= i; k++) {
			System.out.print(" ");	
			}
			for(int j = 1; j <=2*(num-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
