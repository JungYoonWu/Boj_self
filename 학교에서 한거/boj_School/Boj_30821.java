package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Boj_30821 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		BigInteger factorialNum = BigInteger.ONE;
		
		for(int i = 1; i <= num ; i++) {
			factorialNum = factorialNum.multiply(BigInteger.valueOf(i));
		}
		BigInteger underNum1 = BigInteger.valueOf(720);
		BigInteger underNum2 = BigInteger.ONE;
		for(int i = 1; i <= 5; i++) {
			underNum2 = underNum2.multiply(BigInteger.valueOf(i));
		}
		BigInteger result = factorialNum.divide(underNum1).divide(underNum2);
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
}
