package Baidu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inp = s.nextInt();

        for (int i = 0; i < 100; i++) {
            if (Math.pow(2, i) <= inp && inp <= Math.pow(2, i + 1)) {
                System.out.println((int) (Math.pow(2, i + 1) - inp - 1));
                break;
            }
        }
    }
}
