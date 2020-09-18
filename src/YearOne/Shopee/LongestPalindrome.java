package YearOne.Shopee;

import java.util.HashSet;
import java.util.Set;


public class LongestPalindrome {
    /**
     * @param s string字符串
     * @return int整型
     */
    public int longestPalindrome(String s) {
        // write code here
        int[] ans = new int[128];
        Set<Character> set = new HashSet<>();
        for (Character character : s.toCharArray()) {
            ans[character]++;
            set.add(character);
        }
        int sum = 0;
        for (Integer i : ans) {
            sum += i / 2 * 2;
            if (i % 2 == 1 && sum % 2 == 0) {
                sum++;
            }
        }

        return sum;
    }
}