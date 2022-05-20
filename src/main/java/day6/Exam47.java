package day6;

/*
 *  유형 : 연습문제
 *  문제 : 소수 찾기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12921
 *  Date : 2022-05-19
 *  난이도 : 중상
 *  point : 8
 * */

// 에라토스 테네스의 체
public class Exam47 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution2(10));
        System.out.println(solution2(5));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution2(int n){
        prime = new boolean[n+1];
        get_prime();
        int count = 0;

        for(int i= 1; i<=n; i++){
            if(!prime[i]) count++;
        }

        return count;
    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;	// 이미 체크된 배열일 경우 skip
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
