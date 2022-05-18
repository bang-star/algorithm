package day5;

/*
 *  유형 : 연습문제
 *  문제 : 시저암호
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12977
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 8
 * */

public class Exam39 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }


    public static String solution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}
