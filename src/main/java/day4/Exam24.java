package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 정수 내림차순으로 배치하기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12932
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 2
 * */

import java.util.Arrays;
import java.util.Comparator;

public class Exam24 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(787945155));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 243900
    public static long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        long[] arr = new long[10];
        // 카운팅 정렬
        for(int i=0; i<num.length();i++){
            arr[(int)(n %10)]++;
            n = n /10;
        }

        for(int i=9; i>=0;i--){
            if(arr[i] > 0){
                for(int j=0; j<arr[i]; j++){
                    sb.append(i);
                }
            }
        }

        return Long.parseLong(sb.toString());
    }

    // 4217200
    public static long test2(long n){
        String[] arr= Long.toString(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str);
        }
        return Long.parseLong(sb.toString());
    }
}
