package test.flying;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 문제: 배열의 회전
 */
public class NO1 {

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{7, 8, 10}, new int[]{10, 7, 8}));
        System.out.println(solution1(new int[]{4, 3, 2, 1}, new int[]{5, 4, 1, 2}));
    }

    public static boolean solution(int[] arrA, int[] arrB) {
        boolean answer = false;
        int first;

        for (int j = 0; j < arrA.length; j++) {
            first = arrA[0];

            for (int i = 0; i < arrA.length - 1; i++) {
                arrA[i] = arrA[i + 1];
            }

            arrA[arrA.length - 1] = first;

            if (Arrays.equals(arrA, arrB)) {
                answer = true;
                break;
            }
        }

        return answer;
    }

    public static boolean solution1(int[] arrA, int[] arrB) {
        HashSet<int[]> hashSet = new LinkedHashSet<>();
        hashSet.add(arrA);

        for (int i = 0; i < arrA.length; i++) {
            int[] temp = Arrays.copyOfRange(arrA, i+1, arrA.length);

            for(int j=0; j < i+1; j++){
                temp[arrA.length-1] = arrA[j];
            }

            hashSet.add(temp);
        }

        return hashSet.contains(arrB);
    }
}
