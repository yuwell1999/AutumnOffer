package YearOne.Autel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] strs = new String[n];
        s.nextLine();
        for (int i = 0; i < n; i++) {
            strs[i] = s.nextLine();
        }

        Map<Integer, String> hm = new HashMap<>();
        int[] values = new int[n];
        int index = 0;
        for (String ss : strs) {
            hm.put(ss.length(), ss);
            values[index] = ss.length();
            index++;
        }

        String[] dict = strs.clone();
        String[] len = strs.clone();
        //System.out.println(strs[2]);

        Arrays.sort(strs);
//        for(String aa:strs){
//            System.out.print(aa+" ");
//        }
        for (int i = 0; i < strs.length - 1; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println(strs[strs.length - 1]);

        Arrays.sort(values);
//        for(Integer i:values){
//            System.out.print(hm.get(i)+" ");
//        }
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(hm.get(values[i]) + " ");
        }
        System.out.print(hm.get(values[values.length - 1]));
    }
}
