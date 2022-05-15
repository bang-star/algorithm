package day2;

/*
 *  문제 : 부족한 금액 계산하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/82612
 *  Date : 2022-05-14
 * */

public class Exam12 {

    // 원래 이용료는 price원
    // 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기
    // 100원, 200, 300

    public static void main(String[] args) {
        System.out.println(solution1(3, 20, 4));
    }

    /* 반복문 풀이 방법 */
    public static long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 0; i<count; i++){
            sum = sum + (price *(i+1));
        }

        return money > sum? 0 : sum - money;
    }

    /* 등차수열의 합 */
    public static long solution1(int price, int money, int count) {
        long sum = (count*(2*price + (count-1)*price))/2;

        return money > sum? 0 : sum - money;
    }
}
