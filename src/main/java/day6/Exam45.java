package day6;

/*
 *  유형 : 정렬
 *  문제 : K번째수
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12940
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 5
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Exam45 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}}));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int from = -1;
        int to = -1;
        int k = -1;
        for(int i=0;i<commands.length;i++){
            from = commands[i][0];
            to = commands[i][1];
            k = commands[i][2];
            int[] temp = Arrays.copyOfRange(array, from-1, to);
            Arrays.sort(temp);
            list.add(temp[k-1]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
