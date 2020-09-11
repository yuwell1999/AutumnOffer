package Net;

import java.util.Scanner;

public class DataCompress {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();

        System.out.println(compress(inp));

    }

    public static String compress(String inp) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean flag = false;


        while (i < inp.length()) {
            char c = inp.charAt(i);
            int cnt = 0;
            while (i < inp.length() && c == inp.charAt(i)) {
                cnt++;
                i++;
            }

//            if (cnt > 55) {
//                sb
//                        .append('0')
//                        .append('Z')
//                        .append(c);
//                cnt -= 55;
//                flag = true;
//
//            }
            while (cnt >= 55) {
                sb
                        .append('0')
                        .append('Z')
                        .append(c);
                cnt -= 55;
                flag = true;
            }

            if (cnt < 4) {
                for (int k = 0; k < cnt; k++) {
                    sb.append(c);
                }
            } else {
                char tmp = ' ';
                //char tmp = (char) ('a' + cnt - 4);
                if (cnt <= 29) {
                    tmp = (char) ('a' + cnt - 4);
                } else {
                    tmp = (char) ('A' + cnt - 30);
                }
                sb
                        .append('0')
                        .append(tmp)
                        .append(c);
//                if(!flag){
//                    sb.append(c);
//                }
            }
        }

        //System.out.println(sb.toString());
        return sb.toString();
    }
}
