package programmers.dp;

/**
 * point : 9
 * problem : https://school.programmers.co.kr/learn/courses/30/lessons/12900
 */

public class 타일링2xN {
    public static void main(String[] args) {
        System.out.println("expected: 5, actual: "+solution(4));
    }

    public static int solution(int n){
        int answer = 0;
        int mod = 1_000_000_007;
        int[] dp = new int[60_000];

        dp[2] = 2;
        dp[3] = 3;

        for(int i=4; i<dp.length; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % mod;
            if(i == n)
                return dp[i];
        }

        answer = dp[n];
        return answer;
    }
}
