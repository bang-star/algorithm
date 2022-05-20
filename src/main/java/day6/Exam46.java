package day6;

/*
 *  유형 : 월간 코드 챌린지 시즌3
 *  문제 : 나머지가 1이 되는 수 찾기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12940
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 2
 * */

import java.util.ArrayList;
import java.util.Arrays;


public class Exam46 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution2(10));
        System.out.println(solution2(12));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution2(int n){
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==1){
                return i;
            }
        }
        return n-1;
    }

    public static int solution(int n) {
        prime = new boolean[n];
        get_prime();

        if(!prime[n-1]) return n-1;
        else{
            return (int) Math.sqrt(n-1);
        }
    }
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;	// 이미 체크된 배열일 경우 skip
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
