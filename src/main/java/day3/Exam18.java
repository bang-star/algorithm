package day3;

import java.util.Arrays;

/*
 *  문제 : 서울에서 김서방 찾기
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12919
 *  난이도 : 중하
 *  point :2
 * */
public class Exam18 {
    public static void main(String[] args) {
        String[] str = new String[]{"Jane", "Kim"};
        System.out.println(solution(str));;
    }

    public static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                sb.append(i);
                break;
            }
        }

        sb.append("에 있다");
        return sb.toString();
    }

}
