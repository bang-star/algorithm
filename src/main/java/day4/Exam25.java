package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 정수 제곱근 판별
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12934
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 4
 * */

public class Exam25 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(121));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 243900
    public static long solution(long n) {
        Double d = Math.sqrt(n);
        return d.intValue() == d ? (long) Math.pow(d + 1, 2):-1;
    }
}
