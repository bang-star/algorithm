package first;

/*
 *  문제 : 짝수와 홀수
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12937
 * */

public class Exam02 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    private static String solution(int num) {
        return((num % 2 == 0) ? "Even":"Odd");
    }
}

