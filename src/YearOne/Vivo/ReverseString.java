package YearOne.Vivo;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //StringBuilder sb= new StringBuilder(str);
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (ok(str, i)) {
                System.out.println(new StringBuilder(str).delete(i, i + 1).toString());
                flag = false;
            }
            if (!flag) {
                break;
            }
        }

        if (flag) {
            System.out.println("false");
        }
    }

    public static boolean ok(String s, int pos) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        return sb1.delete(pos, pos + 1).reverse().toString().equals(sb2.delete(pos, pos + 1).toString());
    }
}
