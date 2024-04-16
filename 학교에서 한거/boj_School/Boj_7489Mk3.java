package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_7489Mk3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()); // 입력으로부터 테스트 케이스의 개수를 받음

        for (int i = 1; i <= num; i++) {// 테스트 케이스의 수 반복하는 for문
            long factorial = 1; // 펙토리얼값 저장할 변수
            int result = 0; // 0이 아닌 최우측 수 저장할 변수
            int digit = Integer.parseInt(br.readLine()); // 몇 팩인지 정할 입력

            for (int j = 1; j <= digit; j++) {// 팩토리얼 값 만들기
                factorial *= j; // j값을 곱해서 팩토리얼 값에 저장
                while (factorial % 10 == 0 && factorial != 0) {
                    factorial /= 10;
                }
                factorial %= 1000000000; // 팩토리얼 값이 10억보다 커지면 나머지 연산
            }
            result = (int) (factorial % 10); // 최우측 수
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
