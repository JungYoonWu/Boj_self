package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_15894 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());
		//long lineLength = num*4;
		
		System.out.println(num*4);
		
		br.close();
		
		
	}

}
