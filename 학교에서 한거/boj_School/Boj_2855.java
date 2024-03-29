package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2855 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int firstNum = Integer.parseInt(br.readLine());
		int secondNum = Integer.parseInt(br.readLine());
		
		int num1, num2, num3, num4;
		
		num1 = firstNum*(secondNum%10);
		num2 = firstNum*(((secondNum%100)-(secondNum%10))/10);
		num3 = firstNum*(secondNum/100);
		
		num4 = num1 + (num2*10) + (num3*100);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
	}
}
