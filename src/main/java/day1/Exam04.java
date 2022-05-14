package day1;

/*
 *  문제 : 두 정수 사이의 합
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12912
 *  Date : 2022-05-13
 * */

public class Exam04 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
    }

    private static long solution(int a, int b) {
        return sum(Math.min(a, b), Math.max(b, a)) ;
    }

    private static long sum(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
