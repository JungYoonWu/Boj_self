package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_2581 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numA = Integer.parseInt(br.readLine());
		int numB = Integer.parseInt(br.readLine());
		int sum = 0;
		int minPrime = numB;
		int count = 0;
		boolean foundPrime = false;
		
		if(numA == 1) {
			numA = 2;
		}
		if(numA==numB) {
			sum +=numA;
			bw.write(sum+"\n");
			bw.write(numA+"");
		}
		else {
			for(int i = numA; i <= numB; i++) {
				boolean isPrime = true;
				for(int j = 2; j<i; j++) {
					if(i%j==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					sum += i;
					count++;
					if(count==1) {
						minPrime = i;
					}
				}
				foundPrime = true;
			}
		}
		if(!foundPrime) {
			bw.write(-1 + "");
		}else {
			bw.write(sum + "\n" + minPrime);			
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
