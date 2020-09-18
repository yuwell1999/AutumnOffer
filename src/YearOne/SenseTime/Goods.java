package YearOne.SenseTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Goods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G') {
                list1.add(i);
            }
            if (str.charAt(i) == 'o') {
                list2.add(i);
            }
            if (str.charAt(i) == 'd') {
                list3.add(i);
            }
        }

        int cnt = 0;
        int i = 0, j = 0, k = 0;

        while (i < list1.size() && j < list2.size() && k < list3.size()) {
            int v1 = list1.get(i);
            int v2 = list2.get(j);
            int v3 = list3.get(k);

            if (v1 < v2 && j < list2.size() - 1 && list2.get(j + 1) < v3) {
                ++cnt;
                ++i;
                j += 2;
                ++k;
            } else if (v1 > v2 || (v2 < v3 && j < list2.size() - 1 && list2.get(j + 1) > v3)) {
                ++j;
            } else if (v2 > v3) {
                ++k;
            }
        }

        System.out.println(cnt);
    }
}

