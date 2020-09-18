//package YearOne.Net;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class NumberRearrange {
//    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        int N = s.nextInt();
//        long A = s.nextLong();
//        long B = s.nextLong();
//
//        //System.out.println(N+A+B);
//        Map<Integer,Integer> hm = new HashMap<>();
//
//        while(B>0){
//            int tmp = 0;
//            tmp = (int)(B%10);
//            B /= 10;
//            hm.put(tmp,hm.getOrDefault(tmp,0)+1);
//        }
//
//        //System.out.println(hm.get(6));
//        int ans = 0;
//        for(int i=0;i<10;i++){
//            if(hm.getOrDefault(i,0)>0){
//                int sum = hm.getOrDefault(i,0);
//                for(int j=0;j<sum;j++){
//                    ans += i;
//                    ans *= 10;
//                }
//            }
//        }
//        ans /= 10;
//
//        //System.out.println(ans);
//        if(A<ans){
//            System.out.println(ans);
//        }else{
//            System.out.println(-1);
//        }
//    }
//}
package YearOne.Net;

import java.util.Scanner;

class NumberRearrange {

    public static boolean ok(int k, int[] visit) {
        for (int i = k; i <= 9; i++) {
            if (visit[i] >= 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String A = in.nextLine();
        String B = in.nextLine();

        int[] visit = new int[10];
        for (int i = 0; i < n; ++i) {
            visit[B.charAt(i) - '0']++;
        }

        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (; i < A.length(); ++i) {
            int index = A.charAt(i) - '0';
            if (visit[index] > 0 && (i < A.length() - 1 && ok(A.charAt(i + 1) - '0', visit))) {
                sb.append(A.charAt(i));
                --visit[index];
            } else {
                for (int j = index + 1; j <= 9; ++j) {
                    if (visit[j] >= 1) {
                        sb.append(j);
                        visit[j] -= 1;
                        break;
                    }

                }
                break;
            }
        }


        for (int j = 0; j <= 9; ++j) {
            while (visit[j] > 0) {
                sb.append(j);
                visit[j]--;
            }
        }
        System.out.println(sb);
    }


}

