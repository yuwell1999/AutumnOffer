package YearOne.Yonyou;

import java.util.Arrays;

public class ArrayMergeAndSort {
    /**
     * @param one int整型一维数组 数组一
     * @param two int整型一维数组 数组二
     * @return int整型一维数组
     */
    public int[] merge(int[] one, int[] two) {
        // write code here
        Arrays.sort(one);
        Arrays.sort(two);

        int[] sum = new int[one.length + two.length];

        for (int i = 0; i < one.length; i++) {
            sum[i] = one[i];
        }

        for (int i = 0; i < two.length; i++) {
            sum[i + one.length] = two[i];
        }

        Arrays.sort(sum);

        return sum;
    }
}
