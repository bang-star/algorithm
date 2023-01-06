package programmers.dfs_bfs;

public class 타겟_넘버 {
    static int[] numbers;
    static int target;
    static int answer;

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,1,1,1};
        int[] arr2 = new int[]{4,1,2,1};

        System.out.println("actual: 3, expected: "+solution(arr1, 3));
        System.out.println("actual: 4, expected: "+solution(arr2, 4));
    }

    public static int solution(int[] numbers, int target){
        answer = 0;
        타겟_넘버.numbers = numbers;
        타겟_넘버.target = target;

        dfs(0, 0);

        return answer;
    }

    public static void dfs(int idx, int sum){
        if(idx == numbers.length)
        {
            if(target == sum)
                answer++;

            return;
        }

        dfs(idx+1, sum + numbers[idx]);
        dfs(idx+1, sum - numbers[idx]);
    }
}
