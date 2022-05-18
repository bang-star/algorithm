package day5;

/*
 *  유형 : 연습문제(스택, 재귀함수 등)
 *  문제 : 두 개 뽑아서 더하기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/68644
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 5
 * */

import java.util.*;

public class Exam32 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[]arr = new int[]{2,1,3,4,1};
        System.out.println(solution(arr));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int[] numbers) {
        // numbers의 길이는 2 이상 100 이하
        Set<Integer> set = new HashSet<>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length-1;i++){
            for(int j=i+1; j<numbers.length;j++){
                int val = numbers[i] + numbers[j];
                if(!set.contains(val))
                    set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(i->i).toArray();
    }

    public static int[] solution2(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                int val = numbers[i] + numbers[j];
                if(!list.contains(val))
                    list.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }

    public static int[] solution3(int[] numbers){
        int[] answer = new int[numbers.length+1];
        int idx = 0;
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                int val = numbers[i] + numbers[j];
                if(Arrays.stream(answer).anyMatch(value -> value != val))
                    answer[idx++] = val;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
