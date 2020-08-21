package Mihayo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(" ");

        char opr = str[1].charAt(0);

        int son1 = str[0].charAt(0) - '0';
        int son2 = str[2].charAt(0) - '0';

        int mother1 = str[0].charAt(2) - '0';
        int mother2 = str[2].charAt(2) - '0';
        boolean negative = false;
        int up = 0, down = 0;

        switch (opr) {
            case '+':
                up = son1 * mother2 + son2 * mother1;
                down = mother1 * mother2;
                break;

            case '-':
                up = son1 * mother2 - son2 * mother1;
                down = mother1 * mother2;
                break;

            case '*':
                up = son1 * son2;
                down = mother1 * mother2;
                break;
            case '/':
                up = son1 * mother2;
                down = son2 * mother1;
                break;
        }

        //System.out.println(up + "    " + down);
        int gcd = gcd(up, down);
        //System.out.println("gcd" + gcd);
        int upperNum = up / gcd;
        int divid = down / gcd;

        if (upperNum == 0) {
            System.out.println(0);
        }
        if (upperNum%divid== 0) {
            System.out.println(upperNum/divid);
        } else {
            //System.out.println(upperNum + "    " + divid);
            if (divid < 0 || upperNum < 0) {
                System.out.println("-" + Math.abs(upperNum) + "/" + Math.abs(divid));
            } else {
                System.out.println(upperNum + "/" + divid);
            }
        }

    }

    public static int gcd(int u, int d) {
        return d == 0 ? u : gcd(d, u % d);
    }
}
