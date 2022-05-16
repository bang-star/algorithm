package day3;
/*
 *  문제 : 문자열 다루기 기본
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12918
 *  난이도 : 중하
 *  point : 11
 * */
public class Exam17 {
    public static void main(String[] args) {

        System.out.println(solution("a234"));;
        System.out.println(solution("1234"));;
    }

    static boolean solution(String s) {
        // 1. 문자열 길이 체크.
        // 2. 영문자 확인(정규식 표현)
        int length = s.length();
        if(length == 4 || length ==6){
            if(s.matches(".*[a-zA-Z].*")){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

}
