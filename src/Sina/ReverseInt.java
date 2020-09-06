package Sina;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ori = s.nextLine();

        StringBuilder sb = new StringBuilder(ori);

        System.out.println(sb.reverse().toString());
    }

}
