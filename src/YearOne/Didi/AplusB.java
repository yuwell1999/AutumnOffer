package YearOne.Didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        List<int[]> list = new ArrayList<>();

        if (n % 2 == 1) {
            System.out.println(0);
        }

        for (int a = 1; a <= 9; a++) {
            for (int c = 0; c <= 9; c++) {
                for (int b = 0; b <= 9; b++) {

                    int abc = 100 * a + 10 * b + c;
                    int acc = 100 * a + 11 * c;
                    if (abc + acc == n) {
                        list.add(new int[]{Math.min(abc, acc), Math.max(abc, acc)});
                    }
                }
            }
        }

        if (list.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(list.size());

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
            }
        }
    }
}
