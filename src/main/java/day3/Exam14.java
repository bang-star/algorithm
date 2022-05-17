package day3;

/*
 *  문제 : 나누어 떨어지는 숫자 배열
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12910
 *  Date : 2022-05-15
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam14 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        solution2(arr, 5);
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

    public static int[] solution1(int[] arr, int divisor){
        int[] answer = Arrays.stream(arr).filter(x -> x % divisor ==0).toArray();
        Arrays.sort(answer);
        return answer.length == 0 ? new int[]{-1}: answer;
    }

    public static int[] solution2(int[] arr, int divisor){
        int count = 0;
        for(int a : arr){
            if(a%divisor==0)
                count++;
        }

        if(count == 0) return new int[]{-1};
        int[] answer = new int[count];
        for(int i=0; i<answer.length;i++){
            if(arr[i]%divisor==0)
                answer[i] = arr[i];
        }

        return answer;
    }

}
