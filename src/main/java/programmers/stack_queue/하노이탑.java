package programmers.stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Point : 2
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12946
 */

public class 하노이탑 {
    static List<int []> routes;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2)));
    }

    public static int[][] solution(int n){
        int[][] answer = {};
        routes = new LinkedList<>();

        hanoi(n, 1, 2, 3);
        answer = new int[routes.size()][2];
        for(int i=0; i < routes.size(); i++){
            int[] route = routes.get(i);
            answer[i] = route;
        }

        return answer;
    }

    public static void hanoi(int n, int start, int mid, int to){
        if(n==1)
            routes.add(new int[]{start, to});
        else{
            // STEP 1: N-1개가 A -> B
            hanoi(n-1, start, to, mid);
            // STEP 2: 1개를 A -> C
            routes.add(new int[]{start, to});
            // STEP 3: N-1개가 B -> C
            hanoi(n-1, mid, start, to);
        }
    }
}
