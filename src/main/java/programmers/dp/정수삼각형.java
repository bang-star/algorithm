package programmers.dp;

/**
 * Point : 1
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/43105
 */

public class 정수삼각형 {

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println("actual: 30, expected: "+solution(triangle));
    }

    public static int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for(int i=1; i<triangle.length; i++){
            // 왼쪽 끝
            dp[i][0] = dp[i-1][0] + triangle[i][0];

            // 중간
            for(int j=1; j<=i; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
            }

            // 오른쪽 끝
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }

        for(int i=0; i<triangle.length; i++){
            answer = Math.max(answer, dp[triangle.length-1][i]);
        }

        return answer;
    }
}
