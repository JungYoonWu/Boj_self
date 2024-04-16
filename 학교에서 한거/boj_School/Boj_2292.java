package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2292 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int beeHouse = 0;
		boolean loopTF = true;
		while(loopTF) {
			beeHouse++;
			if(num==1) {
				loopTF = false;
			}
			if(bee((beeHouse-1))<num && num<=bee(beeHouse)) {
				loopTF=false;
			}
		}
		System.out.println(beeHouse);
	}
	static public int bee(int num) {
		int result = 3*num*num - 3*num +1;
		return result;
	}

}
