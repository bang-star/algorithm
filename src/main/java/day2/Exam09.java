package day2;

/*
 *  문제 : 핸드폰 번호 가리기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12948
 *  Date : 2022-05-14
 * */

public class Exam09 {
    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        String front = phone_number.substring(0, phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4);

        for(int i=0; i<phone_number.length()-4; i++){
            front = front.replace(phone_number.charAt(i), '*');
        }

        sb.append(front);
        sb.append(back);

        return sb.toString();
    }
}
