package test.zum;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NO2 {

    static PriorityQueue<Document> queue;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{1, 0, 5}, {2, 2, 2}, {3, 3, 1}, {4, 4, 1}, {5, 10, 2}})));
        System.out.println(Arrays.toString(solution(new int[][]{{1, 0, 3}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}})));
        System.out.println(Arrays.toString(solution(new int[][]{{1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}})));
    }

    public static int[] solution(int[][] data) {
        int[] answer = new int[data.length];
        int idx = 0;
        int maxTime = findMaxTime(data);

        queue = new PriorityQueue<>((o1, o2) -> {
            if(o1.page > o2.page)
                return 1;
            else if (o1.page == o2.page){
                return o1.seq - o2.seq;
            }else {
                return 0;
            }
        });

        int seq = 0;
        int timer = 0;
        Document target;
        for(int i=0; i<=maxTime+1; i++){

            if(queue.isEmpty() && data[idx][1] <= i){
                queue.add(Document.of(data[idx]));
                idx++;
            }else{
                if(queue.isEmpty()){
                   continue;
                }

                if(queue.peek().page-1 <= timer){
                    answer[seq++] = queue.poll().seq;
                    timer = 0;
                    continue;
                }else if(data[idx][1] <= i){
                    queue.add(Document.of(data[idx++]));
                }
            }
            timer++;
        }

        return answer;
    }

    public static int findMaxTime(int[][] data){
        int max = Integer.MIN_VALUE;

        for(int[] d : data){
            if(d[1] > max){
                max = d[1];
            }
        }

        return max;
    }

    public static Document findByRequestedTime(int curTime){
        return queue.stream().filter(q -> q.requestedTime == curTime).findFirst().orElse(null);
    }

    static class Document{
        int seq;
        int requestedTime;
        int page;

        public Document(int seq, int requestedTime, int page) {
            this.seq = seq;
            this.requestedTime = requestedTime;
            this.page = page;
        }

        public static Document of(int[] data){
            return new Document(data[0], data[1], data[2]);
        }
    }
}
