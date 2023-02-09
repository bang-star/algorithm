package test.flying;

import java.util.ArrayList;

public class NO4 {

    static ArrayList<String> arr = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(5));
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if(n == 1)
            return "1";

        sb.append(makeAnt(n));
        return sb.toString();
    }

    public static String makeAnt(int num) {
        StringBuilder sb = new StringBuilder("1");
        String[] temp;

        for (int i = 1; i < num; i++) {
            temp = sb.toString().split("");

            String ant = temp[0];
            sb = new StringBuilder();
            int cnt = 0;

            for (int j = 0; j < temp.length; j++) {
                if (ant.equals(temp[j])) {
                    cnt++;
                } else {
                    sb.append(ant + "" + cnt);
                    ant = temp[j];
                    cnt = 1;
                }
            }

            if (cnt >= 1) {
                sb.append(ant + "" + cnt);
                cnt = 1;
            }
        }

        return sb.toString();
    }
}
