package TAL;

import java.util.Scanner;

public class FrogJump {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long[][] inp = new long[t][3];
        for (int i = 0; i < t; i++) {
            inp[i][0] = s.nextLong();
            inp[i][1] = s.nextLong();
            inp[i][2] = s.nextLong();
            s.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(step(inp[i][0], inp[i][1], inp[i][2]));
        }
        //System.out.println(step(1,10,5));
        //System.out.println(inp[t-1][2]);

    }

    public static long step(long a, long b, long num) {
        long ans = 0;
//        for(int i=0;i<num;i++){
//            if(i%2==0){
//                ans += a;
//            }else{
//                ans -= b;
//            }
//        }
        long res = (num % 2);
        ans += 0.5 * (num - res) * (a - b);
        ans += res * a;

        return ans;
    }
}
