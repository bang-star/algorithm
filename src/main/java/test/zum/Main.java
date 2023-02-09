package test.zum;

import java.io.IOException;

public class Main {

    public static int[] histograms;

    public static void main(String[] args) throws IOException {

        System.out.println(solution(new int[]{2, 2, 2, 3}));
    }

    public static long solution(int[] histogram) {
        int N = histogram.length;  // 직사각형의 개수
        histograms = histogram;

        return getArea(N);
    }

    public static long getArea(int len) {
        int[] stack = new int[len];	// 스택 배열
        int sSize = 0;	// 요소의 개수(사이즈)
        int top = -1;	// top을 가리키는 변수

        long maxArea = 0;

        for(int i = 0; i < len; i++) {

            while(sSize > 0 && histograms[stack[top]] >= histograms[i]) {
                int height = histograms[stack[top--]];
                sSize--;

                long width = sSize == 0 ? i : i - 1 - stack[top];

                maxArea = Math.max(maxArea, height * width);
            }

            stack[++top] = i;
            sSize++;

        }

        while(sSize > 0) {
            int height = histograms[stack[top--]];
            sSize--;

            long width = sSize == 0 ? len: len - 1 - stack[top];
            maxArea = Math.max(maxArea, width * height);
        }

        return maxArea;

    }

}
