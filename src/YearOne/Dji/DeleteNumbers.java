package YearOne.Dji;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        BigInteger b = new BigInteger(str);
        int K = s.nextInt();
        String ans = "";

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) - '0');
        }

        int cnt = 0;
        while (cnt < K) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    list.remove(i);
                    cnt++;
                    break;
                }

                if (i == list.size() - 2) {
                    list.removeLast();
                    cnt++;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.print(list.get(i));
            ans += list.get(i);
        }

        System.out.println(Integer.valueOf(ans));

        //System.out.println(removeAll(str, K));
    }

    public static String removeZero(String nums) {
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) != '0') {
                break;
            }
            nums = nums.substring(1);
        }

        return nums;
    }

    public static String removeAll(String nums, int K) {
        String n = nums;
        for (int i = 0; i < K; i++) {
            boolean flag = false;
            for (int j = 0; j < n.length() - 1; j++) {
                if (n.charAt(j) > n.charAt(j + 1)) {
                    n = n.substring(0, j) + n.substring(j + 1);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                n = n.substring(0, n.length() - 1);
            }
            n = removeZero(n);

        }
        if (n.length() == 0) {
            return "0";
        }

        return n;
    }
}
