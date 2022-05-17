package day3;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 자연수 뒤집어 배열로 만들기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12932
 *  난이도 : 중하
 *  point : 3
 * */

import java.util.Arrays;

public class Exam23 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(12345));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 554100
    public static int[] solution(int n) {
        int[] answer = new int[String.valueOf(n).length()];
        int idx = 0;
        while (n > 0){
            answer[idx] = (int)(n % 10);
            n /= 10;
            idx++;
        }
        return answer;
    }
}
