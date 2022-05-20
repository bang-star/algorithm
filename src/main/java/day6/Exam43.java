package day6;

/*
 *  유형 : 연습문제
 *  문제 : 예산
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12940
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 3
 * */


import java.util.Arrays;

// 유클리드 호제법
public class Exam43 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(solution(new int[]{2,2,3,3}, 10));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int idx=0;
        for(idx=0; idx<d.length;idx++){
            budget = budget - d[idx];
            if(budget < 0) return idx;
        }

        return idx;
    }

}
