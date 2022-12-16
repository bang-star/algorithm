package programmers.exercises;

/*
 *  문제 : 행렬의 덧셈
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12950
 * */

public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {{1,2},{2,3}};
        int[][] arr2 = new int[][] {{3,4},{5,6}};
        System.out.println(solution(arr1, arr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }

        return arr1;
    }
}
