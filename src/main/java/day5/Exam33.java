package day5;

/*
 *  유형 : 2021 Dev-Matching : 웹 백엔드 개발
 *  문제 : 로또의 최고 순위와 최저 순위
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/77484
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 4
 * */

import java.util.*;
import java.util.stream.Collectors;

public class Exam33 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31,10,45,1,6,19}));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;

        for(int nums : lottos){
            if(nums == 0) zero++;
            else {
                for(int w : win_nums){
                    if(nums == w){
                        match++;
                        break;
                    }
                }
            }
        }

        int min = match;
        int max = match+zero;

        return new int[]{Math.min(7-max, 6), Math.min(7-min,6)};
    }

}
