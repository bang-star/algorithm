package day3;

/*
 *  문제 : 수박수박수박수박수박수?
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12922
 *  난이도 : 중하
 *  point : 2
 * */
public class Exam19 {
    public static void main(String[] args) {

        System.out.println(solution(4));
    }

    // N : 1 - 수
    // N : 2 - 수박
    // N : 3 - 수박수
    // N : 4 - 수박수박
    // 짝수이면 짝수 만큼 반복
    // 홀수이면 짝수 만큼 반복 + "수"

    public static String solution(int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n/2;i++){
            sb.append("수박");
        }
        if(n%2==1)
            sb.append("수");

        return sb.toString();
    }
}
