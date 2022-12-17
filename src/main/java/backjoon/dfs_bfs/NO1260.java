package backjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NO1260 {

    static int[][] arr;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 탐색을 시작할 정점의 번호

        // 인접행렬 생성
        arr = new int[N+1][N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N+1];
        dfs(V);

        sb.append("\n");
        visited = new boolean[N+1];
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs(int v){
        visited[v] = true;
        sb.append(v).append(" ");

        if(v == arr.length) return;

        for(int i=1; i<arr.length; i++){
            if(arr[v][i] == 1 && visited[i] == false)
                dfs(i);
        }
    }

    public static void bfs(int v){
        visited[v] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        sb.append(v).append(" ");

        while (!queue.isEmpty()){
            int temp = queue.poll();
            for(int i=0; i<arr.length; i++){
                if(arr[temp][i] == 1 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }

}
