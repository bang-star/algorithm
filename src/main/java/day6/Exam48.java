package day6;

/*
 *  유형 : 2019 KAKAO BLIND RECRUITMENT
 *  문제 : 실패율
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/42889
 *  Date : 2022-05-19
 *  난이도 : 중상
 *  point :
 * */


import java.util.ArrayList;
import java.util.Collections;

public class Exam48 {

    static class Rate{
        int idx;	// stage number
        double rate; 	// fail rate

        public Rate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(10, new int[]{2,1,2,6,2,4,3,3}));
        System.out.println(solution(5, new int[]{4,4,4,4,4}));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int N, int[] stages) {
        int[] user_cnt = new int[N + 2];	    // 각 stage에 머물러있는 user 수
        int[] user_total_cnt = new int[N + 1];	// 각 stage에 도달한 전체 user 수

        return stages;
    }
}
