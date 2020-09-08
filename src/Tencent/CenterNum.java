package Tencent;

import java.util.Arrays;
import java.util.Scanner;

public class CenterNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //long [] res = new long[]{2,3,6,5,1,4};
        long[] res = new long[n];
        for (long i = 0; i < n; i++) {
            res[(int) i] = s.nextLong();
        }
        long[] ans = res.clone();
        Arrays.sort(ans);
        long min = ans[ans.length / 2 - 1];
        long max = ans[ans.length / 2];
        //System.out.println(min + " "+max);

        for (int i = 0; i < res.length; i++) {
            System.out.println(getMiddle(res, i, max, min));
        }
        //System.out.println(getMiddle(res,res[4]));

    }

    public static long getMiddle(long[] arr, long index, long max, long min) {

//        List<Long> list =Arrays.asList(arr);
//        list.remove(n);
//
//        Long[] ans = list.toArray(new Long[list.size()]);
//        Arrays.sort(ans);
//        return ans[ans.length/2];
//        if(n<arr[(int)(n+1)/2]){
//            return arr[(int)(n+1)/2];
//        }else if(n>arr[(int)(n+1)/2]){
//            return arr[(int)(n-1)/2];
//        }
//        return 0;
        if (arr[(int) index] <= min) {
            return max;
        } else {
            return min;
        }
    }
}
