package day5;

/*
 *  유형 : 연습문제
 *  문제 : 문자열 내림차순으로 배치하기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12917
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 2
 * */

import java.util.*;

public class Exam36 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution("Zbcdefg"));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 64
    // 1005200 ns
    public static String solution(String s) {
        String[] str = s.split("");

        Arrays.sort(str, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String c: str) {
            sb.append(c);
        }
        return sb.toString();
    }

}
