package day2;

/*
 *  문제 : 평균 구하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12944
 *  Date : 2022-05-14
 * */

import java.util.stream.IntStream;

public class Exam08 {
    public static void main(String[] args) {
        int arr1[] = {4,7,12};
        System.out.println(solution(arr1));
    }

    public static double solution(int[] arr) {
        // return (double) Arrays.stream(arr).average();
        return (double)IntStream.of(arr).sum() / arr.length;
    }
}
