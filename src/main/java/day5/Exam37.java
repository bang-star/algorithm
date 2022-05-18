package day5;

/*
 *  유형 : 연습문제
 *  문제 : 소수 만들기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12977
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 4
 * */

import java.util.ArrayList;

public class Exam37 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(new int[]{1,2,3,4}));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 64
    // 1005200 ns
    public static int solution(int[] nums) {
        boolean prime[] = new boolean[2998];    // 1000+999+998

        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(!prime[sum]){        // false 소수
                        result.add(sum);
                    }
                }
            }
        }

        return result.size();
    }
}
