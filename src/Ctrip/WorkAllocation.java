package Ctrip;

import java.util.Arrays;
import java.util.Scanner;

public class WorkAllocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] ps = null;
        ps = s.nextLine().split(" ");

        int[] p = new int[ps.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = Integer.valueOf(ps[i]);
        }

        String[] ts = null;
        ts = s.nextLine().split(" ");

        int[] tasks = new int[ts.length];
        for (int i = 0; i < ts.length; i++) {
            tasks[i] = Integer.valueOf(ts[i]);
        }

        Arrays.sort(p);
        Arrays.sort(tasks);

        int ptrP = 0;
        int ptrT = 0;
        int cnt = 0;

//        for(ptrT=0;ptrT<tasks.length;ptrT++){
//
//        }
        while (ptrP < p.length && ptrT < tasks.length) {
            if (p[ptrP] <= tasks[ptrT]) {
                cnt++;
                ptrP++;
                ptrT++;
            } else {
                ptrT++;
            }
        }

        System.out.println(cnt);
    }
}
