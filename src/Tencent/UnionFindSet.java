package Tencent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UnionFindSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            int count = in.nextInt();
            int[] tmp = new int[count + 1];
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= count; ++j) {
                tmp[j] = in.nextInt();
                min = Math.min(tmp[j], min);
            }
            tmp[0] = min;
            list.add(tmp);
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            hs.put(i, i);
        }
        for (int i = 0; i < m; ++i) {
            int[] tmp = list.get(i);
            for (int j = 1; j < tmp.length; ++j) {
                int val = hs.get(tmp[j]);
                int pp = Math.min(val, tmp[0]);
                hs.put(tmp[j], pp);
            }
        }

        for (int i = 0; i < n; ++i) {
            hs.put(i, find(i, hs));
        }
        int cnt = 0;
        for (int i = 0; i < n; ++i) {
            if (find(hs.get(i), hs) == 0) {
                ++cnt;
            }
        }
        System.out.println(cnt);
    }

    public static int find(int x, HashMap<Integer, Integer> hs) {
        if (hs.get(x) == x) {
            return x;
        } else {
            return find(hs.get(x), hs);
        }
    }
}