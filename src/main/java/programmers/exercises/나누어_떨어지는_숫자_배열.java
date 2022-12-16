package programmers.exercises;

/*
 *  문제 : 나누어 떨어지는 숫자 배열
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12901
 *  Date : 2022-05-14
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        solution(arr, 5);
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty())
            list.add(-1);

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void solution1(int[] arr, int divisor){
        int[] answer = Arrays.stream(arr).filter(x -> x % divisor ==0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
    }

}
