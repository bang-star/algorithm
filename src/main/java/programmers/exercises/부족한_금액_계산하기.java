package programmers.exercises;

/*
 *  문제 : 부족한 금액 계산하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/82612
 * */

public class 부족한_금액_계산하기 {

    public static void main(String[] args) {
        char ch = '\0';
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 0; i<count; i++){
            sum = sum + (price *(i+1));
        }
        if(money > sum)
            return 0;
        return sum - money;
    }
}
