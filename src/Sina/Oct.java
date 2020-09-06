package Sina;

import java.util.Scanner;

// 83.33%
public class Oct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ori = s.nextInt();

        //Integer.toString(62,8);
        StringBuilder sb = new StringBuilder();
        while (ori != 0) {
            sb.append(ori % 8);
            ori /= 8;
        }

        String res = sb.reverse().toString();
        //String res = Integer.toString(64,8);
        int cnt = 0;

        for (char c : res.toCharArray()) {
            if (c == '0') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
