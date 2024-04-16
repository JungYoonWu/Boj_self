package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_5618mk2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 개수 받기 (2 또는 3)
        int count = Integer.parseInt(br.readLine());
        int[] nums = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 모든 수의 약수 구하기
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int num : nums) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0 && !divisors.contains(i)) {
                    divisors.add(i);
                }
            }
        }

        // 결과 출력
        Collections.sort(divisors);
        for (int divisor : divisors) {
            bw.write(divisor + "\n");
        }

        br.close();
        bw.close();
    }
}
