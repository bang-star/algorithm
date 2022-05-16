package day3;

/*
 *  문제 : 연습문제
 *  문제 : 이상한 문자 만들기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12930
 *  난이도 : 중하
 *  point : 11
 * */

public class Exam21 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution("abc defghijk lmno p op qr stuv  wabcde xabc   YZabcd"));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 554100
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        String[] array = s.split("");
        for (String str : array){
            count = str.equals(" ") ? 0:count+1;
            sb.append(count%2 == 0 ? str.toLowerCase() : str.toUpperCase());
        }
        return sb.toString();
    }
}
