package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 하샤드 수
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12947
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 3
 * */

import java.util.Arrays;

public class Exam28 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution2(10));
        System.out.println(solution2(12));
        System.out.println(solution2(11));
        System.out.println(solution2(13));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 4834299
    public static boolean solution(int n) {
        String[] str = String.valueOf(n).split("");
        int div = 0;
        for(String s : str){
            div += Integer.parseInt(s);
        }
        return n % div ==0 ? true:false;
    }

    // 401901
    public static boolean solution2(int n) {
        int div = 0, x = n;
        while (n > 0){
            div += n%10;
            n/=10;
        }
        System.out.println(div);
        return x % div ==0 ? true:false;
    }
}
