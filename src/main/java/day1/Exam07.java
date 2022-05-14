package day1;

/*
 *  문제 : 음양 더하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/76501
 * */

public class Exam07 {
    public static void main(String[] args) {
        int arr1[] = {4,7,12};
        boolean arr2[] = {true,false,true};
        System.out.println(solution(arr1, arr2));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i])
                sum += absolutes[i];
            else
                sum -= absolutes[i];
        }
        return sum;
    }
}
