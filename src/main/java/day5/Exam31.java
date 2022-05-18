package day5;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 같은 숫자는 싫어
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12906
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 4
 * */

import java.util.*;

public class Exam31 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[]arr = new int[]{1,1,3,3,0,1,1};
        System.out.println(solution(arr));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();

        int value = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }

        answer = new int[list.size()];
        for (int i=0; i<answer.length;i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}
