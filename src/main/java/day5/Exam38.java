package day5;

/*
 *  유형 : 2021 카카오 채용연계형 인턴십
 *  문제 : 숫자 문자열과 영단어
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/81301
 *  Date : 2022-05-18
 *  난이도 : 중
 *  point : 3
 * */

public class Exam38 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(solution("AB"));
        System.out.println(solution("z"));
        System.out.println(solution("a B z"));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }


    public static int solution(String s) {
        String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }
}
