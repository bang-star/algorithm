package day4;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 제일 작은 수 제거하기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
 *  Date : 2022-05-17
 *  난이도 : 중하
 *  point : 8
 * */

import java.util.Arrays;

public class Exam26 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] arr = new int[]{-4, 3, -2, 1, -3, 0, -5, -5};
        System.out.println("결과" + Arrays.toString(solution(arr)));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static int[] solution1(int[] arr) {
        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        if (arr.length <= 1) {
            int[] answer2 = { -1 };
            return answer2;
        }


        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }

        }
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }

        }


        return answer;
    }


}
