package YearOne.Vivo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dependencies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();

        //System.out.println(compileSeq(inp));
        //System.out.println(nums[3]);
        String str = compileSeq(inp);
        String[] strs = str.trim().split(" ");
        int[] ans = new int[strs.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Integer.valueOf(strs[i]);
        }

        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i] + ",");
        }
        System.out.print(ans[ans.length - 1]);
    }

    public static String compileSeq(String input) {
        String[] inps = input.split(",");
        int[] nums = new int[inps.length];
        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inps[i]);
        }
        StringBuilder sb = new StringBuilder();
        int start = 0;
        sb.append(0);
        sb.append(" ");
        hs.add(start);

        while (nums[start] != -1) {
            sb.append(nums[start]);
            sb.append(" ");
            start = nums[start];
            hs.add(start);
        }
        sb = new StringBuilder(sb.reverse().toString() + " ");
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(i)) {
                sb.append(i);
                sb.append(" ");
            }
        }
        //sb.append(0);
        return sb.toString();
        //return null;
    }
}
