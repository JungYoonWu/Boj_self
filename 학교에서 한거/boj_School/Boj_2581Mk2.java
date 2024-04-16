package boj_School;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2581Mk2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());
        
        int minPrime = Integer.MAX_VALUE;  
        int sum = 0; 
        
        boolean foundPrime = false; 
        
        for(int i = numA; i <= numB; i++) {
            boolean isPrime = true; 
            if(i == 1) isPrime = false; 
            
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false; 
                    break;
                }
            }
            
            if(isPrime) {
                
                minPrime = Math.min(minPrime, i);
                sum += i;
                foundPrime = true;
            }
        }
        
        
        if(!foundPrime) {
            System.out.println(-1);
        } else {
            
            System.out.println(minPrime);
            System.out.println(sum);
        }
        
        br.close();
    }

}
