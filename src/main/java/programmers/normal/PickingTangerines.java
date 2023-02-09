package programmers.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PickingTangerines {

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new TreeMap<>();

        for (int t : tangerine) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> keys = new ArrayList<>(map.entrySet());
        keys.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));

        for (Map.Entry<Integer, Integer> entry : keys) {
            if(k <= 0)
                break;
            else{
                answer++;
                k -= entry.getValue();
            }
        }

        return answer;
    }
}
