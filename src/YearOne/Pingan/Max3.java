package YearOne.Pingan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        //System.out.println(a+b+c);
        if (max3(a, b + c, c) + max3(a, b, b + c) == 0) {
            System.out.println("ERROR");
        } else {
            double sum = (double) max3(a + b, b, c) / (double) (max3(a, b + c, c) + max3(a, b, b + c));
            DecimalFormat df = new DecimalFormat(".00");
            //System.out.println(df.format(sum));
            System.out.println(String.format("%.2f", sum));
        }
    }

    public static int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
