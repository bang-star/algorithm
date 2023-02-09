package test.flying;

public class NO3 {

    public static void main(String[] args) {
        System.out.println(solution("44335550555666"));
        System.out.println(solution("9666775553"));
        System.out.println(solution("2220281"));
        System.out.println(solution("99999999999"));
    }

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char target = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (target == chars[i]) {
                count++;
            } else {
                char ch = calculate(target, Math.min(count, 2));
                if(ch != 0){
                    sb.append(ch);
                }

                target = chars[i];
                count = 0;
            }
        }

        sb.append(calculate(target, count));

        return sb.toString();
    }

    public static char calculate(char num, int count) {
        switch (num) {
            case '1':
                if (count == 0) {
                    return '.';
                } else if(count == 1){
                    return 'Q';
                } else
                    return 'Z';
            case '2':
                return (char) ('A' + count);
            case '3':
                return (char) ('D' + count);
            case '4':
                return (char) ('G' + count);
            case '5':
                return (char) ('J' + count);
            case '6':
                return (char) ('M' + count);
            case '7':
                if(count == 0)
                    return 'P';
                else if (count == 1) {
                    return 'R';
                }else
                    return 'S';
            case '8':
                return (char) ('T' + count);
            case '9':
                return (char) ('W' + count);
            default:
                return Character.MIN_VALUE;
        }
    }

}
