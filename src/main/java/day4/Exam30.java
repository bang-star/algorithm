package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 최소직사각형
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/86491
 *  Date : 2022-05-17
 *  난이도 : 중
 *  point : 2
 * */

import java.util.Arrays;

public class Exam30 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[][] arr = new int[][]{{60, 50},{30,70},{60,30},{80,40}};
        System.out.println(solution(arr));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // builder : 266901, buffer : 261100, String
    public static int solution(int[][] arr) {
        // 배열에 인덱스 0, 1 에서 큰 값을 0으로 작은 값을 1로 옮긴다.
        // 그렇게 되면 돌렸을 때 넓이는 생각을 하지 않아도 된다.
        int temp=0;

        // 1. 자리 변경
        for(int i=0; i<arr.length;i++){
            if(arr[i][0] < arr[i][1]){
                temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
            }
        }

        // 2. 왼쪽 최대값  오른쪽 최댓값 찾기
        int lMax = Integer.MIN_VALUE;
        int rMax = lMax;

        for(int i=0; i<arr.length;i++){
            if(arr[i][0] > lMax) {
                lMax = arr[i][0];
            }
            if(arr[i][1] > rMax){
                rMax = arr[i][1];
            }
        }

        return lMax*rMax;
    }

}
