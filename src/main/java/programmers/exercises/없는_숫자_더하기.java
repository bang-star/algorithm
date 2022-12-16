package programmers.exercises;

/*
 *  문제 : 없는 숫자 더하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/86051
 * Date : 2022-05-13
 * */

import java.util.Arrays;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,6,7,8,0};
        int arr2[] = {5,8,4,0,6,7,9};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    private static int solution(int[] numbers) {
        // 1. 배열을 정렬 시킨다.
        // 2. 반복문을 통해 값이 존재하는지 확인한다.
        // 3. 있으면 pass 없으면 합

        Arrays.sort(numbers);
        int sum = 0;
        for(int i=0; i<10;i++){
            int finalI = i;
            sum += Arrays.stream(numbers).anyMatch(value -> value == finalI) ? 0 : i;
        }

        return sum;
    }
}
