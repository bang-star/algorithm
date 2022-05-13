package first;

/*
 *  문제 : 평균 구하기
 *  URL : https://programmers.co.kr/learn/courses/30/lessons/12944
 * */

public class Exam08 {
    public static void main(String[] args) {
        int arr1[] = {4,7,12};
        System.out.println(solution(arr1));
    }

    public static double solution(int[] arr) {
        double sum = 0;
        for(int number : arr){
            sum += number;
        }
        return sum / arr.length;
    }
}
