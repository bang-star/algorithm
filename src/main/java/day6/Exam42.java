package day6;

/*
 *  유형 : 연습문제
 *  문제 : 약수의 합
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12928
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 2
 * */

// 소수를 이용한 풀이(에라토스테네스의 체)
// 반복문을 이용한 풀이
public class Exam42 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution2(12));
        System.out.println(solution2(5));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution(int n) {
        prime = new boolean[3000 + 1];	// 3000이하
        get_prime();
        int sum = 0;
        if(!prime[n]) return n+1;
        else{
            for(int i=1; i<=n/2;i++){
                if(n%i==0)
                    sum += i;
            }
            return sum+n;
        }
    }

    public static int solution2(int n){
        int sum = 0;
        for(int i=1; i<=n/2;i++){
            if(n%i==0)
                sum += i;
        }
        return sum+n;
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

//

//
//
