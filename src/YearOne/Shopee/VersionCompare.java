package YearOne.Shopee;

import java.util.Scanner;

public class VersionCompare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int flag = 0;
        String[] str = s.nextLine().split(",");
        String[] v1 = str[0].split("\\.");
        String[] v2 = str[1].split("\\.");

        int i1, i2;
        for (int i = 0; i < Math.max(v1.length, v2.length); i++) {
            i1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            i2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (i1 != i2) {
                flag = i1 > i2 ? 1 : -1;
                break;
                //System.out.println(flag);
            }
        }
        System.out.println(flag);
    }
}
