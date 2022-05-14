package day1;

/*
 *  문제 : x만큼 간격이 있는 n개의 숫자
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12954
 * */


public class Exam11 {
    public static void main(String[] args) {
        System.out.println(solution(-4, 5));
        System.out.println(solution(-5, 10));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i<n;i++){
            answer[i] = num;
            System.out.println(answer[i]);
            num += x;
        }
        return answer;
    }
}
