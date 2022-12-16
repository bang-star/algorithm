package programmers.dp;

/**
 * Point : 8
 * URL : https://school.programmers.co.kr/learn/courses/30/lessons/12902
 */
public class 타일링3xN {
    public static void main(String[] args) {
        System.out.println("expected: 11, actual: "+solution(4));
    }

    public static int solution(int n){
        int answer = 0;
        int mod = 1_000_000_007;
        long[] dp = new long[5001];

        dp[0] = 1;
        dp[2] = 3;

        for(int i=4; i<=n; i+=2){

            dp[i] = dp[i-2] * 3;

            for(int j = i-4; j>=0; j-=2){
                dp[i] += dp[j] * 2;
            }
            dp[i] = dp[i] % mod;
        }

        answer = (int) dp[n];
        return answer;
    }
}
