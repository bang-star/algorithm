package day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 *  문제 : 해시
 *  문제 : 완주하지 못한 선수
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
 *  난이도 : 중하
 *  point : 7
 * */

public class Exam20 {
    public static void main(String[] args) {
        String[] participants = new String[]{"kiki", "eden", "kiki3", "kiki2", "kiki1", "leo"};
        String[] completion = new String[]{"kiki3", "kiki1", "kiki2", "eden", "kiki"};

        long start = System.nanoTime();
        System.out.println(solution2(participants, completion));
        long end = System.nanoTime();

        System.out.println("수행시간: " + (end - start) + " ns");
    }

    // 554100
    public static String solution(String[] participants, String[] completion) {
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        for(String participant : participants){
            map.put(participant, map.getOrDefault(participant, 0)+1);
        }
        for(String participant : completion){
            map.put(participant, map.get(participant) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() != 0){
                sb.append(entry.getKey());
                break;
            }
        }

        return sb.toString();
    }

    // 수행시간: 553200 ns
    public static String solution2(String[] participants, String[] completion) {
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();
        for(String participant : participants){
            map.put(participant, map.getOrDefault(participant, 0)+1);
        }
        for(String participant : completion){
            map.remove(participant);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();      // 반복문을 사용하지 map을 출력하는 방법

        if(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            sb.append(entry.getKey());
        }
        return sb.toString();
    }

    // 59252400
    public static String solution1(String[] participants, String[] completion){
        for(int i=0; i< participants.length;i++){
            int finalI = i;
            if(!Arrays.stream(completion).anyMatch(x -> x == participants[finalI])){
                return participants[i];
            }
        }
        return participants[0];
    }
}
