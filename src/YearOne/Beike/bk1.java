package YearOne.Beike;

import java.util.Scanner;

public class bk1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        s.nextLine();

        while (N-- > 0) {
            String str = s.nextLine();

            int l = 0, h = str.length() - 1, cnt = 0;
            while (l < h) {
                if (str.charAt(l) != str.charAt(h)) {
                    cnt++;
                }
                l++;
                h--;
            }

            System.out.println(cnt);
        }

    }
}
