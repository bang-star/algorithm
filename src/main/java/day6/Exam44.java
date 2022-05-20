package day6;

/*
 *  유형 : 연습문제
 *  문제 : 최대공약수와 최소공배수
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12982
 *  Date : 2022-05-19
 *  난이도 : 중
 *  point : 5
 * */

// 유클리드 호제법
public class Exam44 {
    public static boolean prime[];

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution(3, 12));
        System.out.println(solution(2, 5));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int[] solution(int n, int m) {
        int[] result = new int[2];

        // 최대 공약수
        result[0] = gcd(n, m);
        result[1] = (n*m)/result[0];
        return result;
    }

    public static int gcd(int n, int m){
        if(m == 0){
            return n;
        }else{
            return gcd(m, n%m);
        }

    }

}
