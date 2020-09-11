package Net;

import java.util.LinkedList;
import java.util.List;

public class String2Number {
    public static void main(String[] args) {
        int N = 2;
        String S = "011235";
        System.out.println(split_into_list(N, S));
    }

    public static int split_into_list(int N, String S) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(S.substring(i, i + 1)));
        }
        int index = N;

        while (index < S.length()) {
            int tmp = list.get(list.size() - 1) + list.get(list.size() - 2);
            String str = String.valueOf(tmp);
            if (Integer.parseInt(S.substring(index, str.length() + index + 1)) != tmp) {
                System.out.println("no");
            } else {
                list.add(tmp);
                index += str.length();
            }
        }

        return 1;
    }
}
