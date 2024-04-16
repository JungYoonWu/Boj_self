package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_9506 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
		boolean loopTF = true;
		do {
			int num = Integer.parseInt(br.readLine());
			if(num==-1) {loopTF = false; break;}
//			sb.append(num).append(" = ");
			int sumDivisor = 0;
			int count = 0;
			
			for(int i = 1; i < num; i++) {
				if(num%i==0) {
					sumDivisor += i;
					count += 1;
				}
			}int [] divisor = new int [count];
			
			int index = 0;
			for(int i = 1; i<num; i++) {
				if(num%i==0) {
					divisor[index++] = i;
				}
			}
			
			if(sumDivisor==num) {
				bw.write(num + " = ");
				for(int i = 0; i < count; i++) {
					bw.write(divisor[i]+"");
					if(i != count-1) {
						bw.write(" + ");
					}
				}bw.write('\n');
			}else {
				bw.write(num + " is NOT perfect." + '\n');
			}
/*			if(sumDivisor==num) {
				for(int i = 0; i < count; i++) {
					for(int j= 1; j<num; j++) {
						if(num%j==0) {
							divisor[i] = j;
						}
					}
				}
				sb.append(num +" = ");
				for(int i = 0; i < count; i++) {
					sb.append(divisor[i]);
					if(i % 2==0) {
						sb.append(" + ");
					}
				}
				bw.write(sb+"\n");
			}else {
				bw.write(num+" is NOT perfect." + '\n');
			}*/
			
		}while(loopTF);
		bw.flush();
		bw.close();
		br.close();
		
		
		
	}

}
