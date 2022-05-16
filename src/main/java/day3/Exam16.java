package day3;
/*
 *  문제 : 문자열 내 p와 y의 개수
 *  주소 : https://programmers.co.kr/learn/courses/30/lessons/12916
 *  난이도 : 중하
 *  point :4
 * */
public class Exam16 {
    public static void main(String[] args) {

        System.out.println(solution("pPoooyY"));;
        System.out.println(solution("Pyy"));;
    }

    static boolean solution(String s) {
        // 1. 문자열을 대문자 또는 소문자로 일치시킨다.
        // 2. p,y의 개수를 확인할 수 있는 변수 1개를 설정한다.
        // 3. p를 찾으면 ++, y를 찾으면 --
        int count = 0;
        for(char ch : s.toLowerCase().toCharArray()){
            switch (ch){
                case 'p': count++; break;
                case 'y': count--; break;
                default: break;
            }
        }
        return count==0 ? true: false;
    }

}
