package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 3진법 뒤집기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/68935
 *  Date : 2022-05-17
 *  난이도 : 중
 *  point : 4
 * */

public class Exam29 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(45));
        System.out.println(solution(125));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // builder : 266901, buffer : 261100, String
    public static int solution(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(Integer.toString(n , 3));             // 3진법으로 변형 -> Sb 넣고
        sb.reverse();                                         // reverse 해서
        return Integer.parseInt(String.valueOf(sb), 3); // 10진법으로
    }
}
