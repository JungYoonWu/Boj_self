package boj_School;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("eter age");
		int age = sc.nextInt();//\n값이 남아서 개행을 추가함
		sc.nextLine();
		
		System.out.println("endfsadfa first");
		String firstName = sc.nextLine();
		
		System.out.println("dfadadf last");
		String lastName = sc.nextLine();
		System.out.println("info");
		System.out.println("age" + age);
		System.out.println("full"+ firstName +lastName);
	}
	
	static int countString(String s) {
		String replaceS = s.replace(" ", "");
		int countNum = replaceS.length();
		
		return countNum;
	}
}
