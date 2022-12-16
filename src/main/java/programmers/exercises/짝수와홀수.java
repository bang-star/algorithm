package programmers.exercises;

/*
 *  문제 : 짝수와 홀수
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12937
 *  Date : 2022-05-13
 *  Point : 5
 * */

public class 짝수와홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    private static String solution(int num) {
        return((num % 2 == 0) ? "Even":"Odd");
    }
}

