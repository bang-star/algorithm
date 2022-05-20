package day6;

/*
 *  유형 : 월간 코드 챌린지 시즌2
 *  문제 : 약수의 개수와 덧셈
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/77884
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 2
 * */

// 소수를 이용한 풀이(에라토스테네스의 체)
public class Exam41 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution(int left, int right) {
        int sum = 0;
        int count = 0;
        prime = new boolean[right + 1];	// 배열 생성
        get_prime();

        for(int i= left; i<=right; i++){
            if(!prime[i]) count = 2;
            else count = divisor(i);

            sum += count % 2 ==0 ? i : -i;
        }

        return sum;
    }

    public static int divisor(int num){
        int count = 0;
        for(int i=1; i<=num;i++){
            if(num % i ==0)
                count++;
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

//

//
//
