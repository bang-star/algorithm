package programmers.dfs_bfs;

import java.util.*;

/**
 *  Point : 3
 *  URL : https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */

public class 게임맵최단거리 {

    public static void main(String[] args) {
        int[][] maps = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        int[][] maps2 = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };


        System.out.println("actual: 11, expected: " + solution(maps));
        System.out.println("actual: -1, expected: " + solution(maps2));
    }

    public static int solution(int[][] maps) {
        int answer = 0;

        int[][] arrows = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        int[][] count = new int[maps.length][maps[0].length];

        Queue<Position> queue = new LinkedList<>();
        queue.add(Position.of(0, 0));
        count[0][0] = 1;

        while (!queue.isEmpty()) {
            Position cur = queue.poll();
            int curCount = count[cur.y][cur.x];

            // 위치 파악(상, 하, 좌, 우)
            for (int i = 0; i < 4; i++) {
                int x = cur.x + arrows[i][0];
                int y = cur.y + arrows[i][1];
                Position p = Position.of(x, y);

                // 맵을 벗어난 경우
                if (p.x < 0 || p.y < 0 || p.x == maps[0].length || p.y == maps.length)
                    continue;

                // 벽에 부딪힌 경우
                if (maps[p.y][p.x] == 0)
                    continue;

                count[p.y][p.x] = curCount + 1;
                // 지난 길은 다시 돌아길 이유가 없기 때문에 벽으로 변경
                maps[p.y][p.x] = 0;
                queue.add(p);
            }
        }

        answer=count[maps.length-1][maps[0].length-1];

        return answer == 0 ? -1 : answer;
    }

    static class Position {
        int x, y;

        private Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Position of(int x, int y) {
            return new Position(x, y);
        }
    }

}
