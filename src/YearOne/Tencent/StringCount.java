package YearOne.Tencent;

import java.util.*;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String s = scanner.nextLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<StringSort> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (String s : map.keySet()) {
            list.add(new StringSort(s, map.get(s)));
            set.add(map.get(s));
        }

        list.sort((a, b) -> a.cnt == b.cnt ? a.str.compareTo(b.str) : b.cnt - a.cnt);

        if (set.size() >= n) {
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i).str + " " + list.get(i).cnt);
            }
            for (int i = list.size() - n; i < list.size(); i++) {
                System.out.println(list.get(i).str + " " + list.get(i).cnt);
            }

        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i).str + " " + list.get(i).cnt);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i).str + " " + list.get(i).cnt);
            }
        }

    }

    static class StringSort {
        String str;
        int cnt;

        public StringSort(String strs, int cnts) {
            str = strs;
            cnt = cnts;
        }

    }
}
