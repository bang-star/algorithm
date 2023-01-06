package backjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int zero = 1;
            int one = 0;
            int zero_plus_one = 1;

            for (int j = 0; j < N; j++) {
                zero = one;
                one = zero_plus_one;
                zero_plus_one = zero + one;
            }

            sb.append(zero + " " + one).append("\n");
        }

        System.out.println(sb);
    }

}
