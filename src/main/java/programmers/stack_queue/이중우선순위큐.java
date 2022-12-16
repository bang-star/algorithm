package programmers.stack_queue;

import java.util.*;

/**
 * Point : 2
 */

public class 이중우선순위큐 {
    public static void main(String[] args) {
        String[] operations = new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] operations2 = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution2(operations)));
        System.out.println(Arrays.toString(solution2(operations2)));
    }

    private static int[] solution(String[] operations) {
        int[] answer = new int[]{0, 0};
        LinkedList<Integer> queue = new LinkedList<>();
        boolean continuity = false;

        StringTokenizer st;
        for (String operation : operations) {
            st = new StringTokenizer(operation, " ");
            String command = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            switch (command) {
                case "I":
                    queue.add(number);
                    continuity = false;
                    break;
                case "D": {
                    if(queue.isEmpty()) continue;

                    if(continuity) Collections.sort(queue);

                    if(number < 0) queue.pollFirst();
                    if(number > 0) queue.pollLast();

                    continuity = true;
                    break;
                }
            }
        }
        Collections.sort(queue);
        if(queue.isEmpty())
            return answer;
        else
        {
            int max = queue.pollLast();
            int min = queue.pollFirst();
            answer = new int[]{max, min};
            return answer;
        }
    }

    private static int[] solution2(String[] operations) {
        int[] answer = new int[]{0, 0};

        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        StringTokenizer st;
        for (String operation : operations) {
            st = new StringTokenizer(operation, " ");
            String command = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            switch (command) {
                case "I":
                    minPq.add(number);
                    maxPq.add(number);

                    break;
                case "D": {
                    if(minPq.isEmpty()) continue;

                    if(number < 0){ maxPq.remove(minPq.poll()); }
                    else { minPq.remove(maxPq.poll()); }

                    break;
                }
            }
        }

        if(minPq.isEmpty())
            return answer;
        else
        {
            int max = maxPq.poll();
            int min = minPq.poll();
            answer = new int[]{max, min};
            return answer;
        }
    }
}
