package Sina;

public class ReverseInt {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String ori = s.nextLine();
//
//        StringBuilder sb = new StringBuilder(ori);
//
//        System.out.println(sb.reverse().toString());

        int a = 8;
        int b = 6;
//        int tmp = a;
//        a=b;
//        b=tmp;

        // a = 1000
        // b = 0110
        // c = 1111
        // a ^ b = 1110=a
        // 1110 ^ 0110 = 1000 =a
        // 1000 ^ 1110 = 0110=b
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        float aa = 1.0f - 0.9f;
        float bb = 0.1f;
        System.out.println(aa == bb);
        System.out.println(Float.compare(aa, bb));
    }

}
