package day1;

/*
 *  문제 : 직사각형 별찍기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12969
 *  Date : 2022-05-13
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M;i++){
            for(int j=0; j<N;j++){
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
