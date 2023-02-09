//package test.flying;
//
//import java.util.Arrays;
//
//public class NO5 {
//
//    static int[][] answer;
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(solution(3, new int[][]{{1, 2}})));
//        System.out.println(Arrays.deepToString(solution(3, new int[][]{{1, 2}, {3, 3}})));
//    }
//
//    public static int[][] solution(int N, int[][] bus_stop) {
//        answer = new int[N][N];
//
//        for(int i=0; i<N; i++){
//            for(int j=0; j<N; j++) {
//                answer[i][j] = N;
//            }
//        }
//
//        // 1. Set Bus_stop
//        for (int[] pos : bus_stop) {
//            int X = pos[0] - 1;
//            int Y = pos[1] - 1;
//            answer[X][Y] = 0;
//        }
//
//        return answer;
//    }
//
//    private static void nearByPos(int X, int Y, int N) {
//        if(X >= N || Y >= N || X < 0 || Y < 0)
//            return;
//        else{
//            if (X - 1 >= 0) {                   // 상 : X - 1
//                nearByPos(X - 1, Y, value + 1, N);
//            }
//            if (Y - 1 >= 0 && answer[X][Y - 1] >= value) {                   // 좌 : Y - 1
//                answer[X][Y - 1] = value + 1;
//                nearByPos(X, Y - 1, value + 1, N);
//            }
//            if (X + 1 < N && answer[X + 1][Y] >= value) {        // 하 : X + 1
//                answer[X + 1][Y] = value + 1;
//                nearByPos(X + 1, Y, value + 1, N);
//            }
//            if (Y + 1 < N && answer[X][Y + 1] >= value) {        // 우 : Y + 1
//                answer[X][Y + 1] = value + 1;
//                nearByPos(X, Y + 1, value + 1, N);
//            }
//        }
//    }
//}
