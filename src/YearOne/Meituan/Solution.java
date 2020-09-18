package YearOne.Meituan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Solution {
    /**
     * return the max length of the subarray
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxSubarrayCanbeMerged(int[] arr) {
        // write code here
        Set<Integer> hs = new HashSet<>();
        for (Integer i : arr) {
            hs.add(i);
        }

        int[] arr1 = new int[hs.size()];

        // 把set放进arr1中
        int j = 0;
        for (Integer ii : hs) {
            arr1[j] = ii;
            j++;
        }

        Arrays.sort(arr1);
        int cnt = 1;
        int tmp = 1;
        for (int i = 0; i < arr1.length - 1; i++) {

            if (arr1[i + 1] - arr1[i] == 1) {
                //cnt++;
                tmp++;
            } else {
                //tmp = 0;
                //cnt = 0;

                //cnt = Math.max(cnt,tmp);
                tmp = 1;

            }
            cnt = Math.max(cnt, tmp);
        }


        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 3, 2, 6, 4, 3};
        System.out.println(Solution.maxSubarrayCanbeMerged(arr));
    }
}