package programmers.exercises;

/*
 *  문제 : 문자열을 정수로 바꾸기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12925
 *  Date : 2022-05-13
 *  Point : 1
 * */

public class 문자열을_정수로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("+1234"));
        System.out.println(solution("-1234"));
    }

    private static int solution(String s) {
        return Integer.parseInt(s);
    }
}
