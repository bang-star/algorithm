package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 콜라츠 추측
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12943
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 4
 * */

import java.util.Arrays;

public class Exam27 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(test(626331));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution(int num) {
        int answer = 0;
        long n = Long.valueOf(num);
        while(n!=1) {
            if(n%2==0) {
                n /= 2;                       // int 범위 를 넘어가서
            } else {
                n = 3*n + 1;
            }

            answer++;
            if(answer==500) {
                answer=-1; break;
            }
        }
        return answer;
    }

    static int count = 0;
    public static int test(int n){
        if(count >= 450)
            return -1;
        if (n == 1)
            return count;
        else{
            count++;
            if(n%2==0){
                return test(n/2);
            }else{
                return test(n*3+1);
            }
        }
    }
}
