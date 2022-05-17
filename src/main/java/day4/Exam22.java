package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 자릿수 더하기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12931
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 1
 * */

public class Exam22 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(99999999));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 554100
    public static int solution(int n) {
        int sum = 0;
        while (n> 0){
            sum += n %10;
            n = n /10;
        }
        return sum;
    }
}
