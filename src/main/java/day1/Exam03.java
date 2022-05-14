package day1;

/*
 *  문제 : 가운데 글자 가져오기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12903
 *  Date : 2022-05-13
 * */

public class Exam03 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    private static String solution(String s) {
        int length = s.length();

        if(length % 2 != 0){
            return s.substring(length/2, length/2+1);
        }else{
            return s.substring(length/2-1,length/2+1);
        }
    }
}
