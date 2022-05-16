package day3;
/*
*  문제 : 내적
*  주소 : https://programmers.co.kr/learn/courses/30/lessons/70128
*  난이도 : 중하
*  point : 1
* */
public class Exam15 {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {-3, -1, 0, 2};
        solution(a, b);
    }

    public static int solution(int[] a, int[] b) {
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum += a[i] * b[i];
        }
        return sum;
    }
}
