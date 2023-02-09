package test.flying;

public class NO2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 3}, {3, 1}, {3, 5}, {2, 5}, {5, 3}}));
    }

    public static int solution(int[][] p) {
        int answer = 0;

        boolean[][] points = new boolean[1000][1000];

        for(int i=0; i<p.length; i++) {
            int A = p[i][0];
            int B = p[i][1];

            points[A][B] = true;
            if(points[B][A]){
                answer++;
            }
        }

        return answer;
    }
}
