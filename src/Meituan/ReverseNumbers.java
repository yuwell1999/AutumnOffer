package Meituan;

import java.util.*;

public class ReverseNumbers {
        public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Set<int[]> set = new LinkedHashSet<>();

        for(int i=1;i<=N;i++){
            if(i==getReverse(i)*4){
                //System.out.println(i);
                set.add(new int[]{Math.min(i,getReverse(i)),Math.max(i,getReverse(i))});
            }
        }

        System.out.println(set.size());
        for(int[] a:set){
            System.out.println(a[0]+" "+a[1]);
        }
    }

    public static int getReverse(int n){
        int ans = 0;
        while(n>0){
            ans =ans*10+n%10;
            n /= 10;
        }

        return ans;
    }
//    public static void main(String[] args) {
//        int n;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();

//        List<int[]> list  = new ArrayList<>();
//        int cnt = 0;
//        for(int i =1;i<=n;i++){
//            String str = new StringBuilder(Integer.toString(i)).reverse().toString();
//
//            int j=0;
//            while(j<str.length()&&str.charAt(j)==0){
//                j++;
//            }
//
//            int t= Integer.valueOf(str.substring(j,str.length()));
//
//            if(i*4==t){
//                list.add(new int[]{i,t});
//            }
//        }
//
//        System.out.println(list.size());
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i)[0]+" " + list.get(i)[1]);
//        }
//        if (n < 2178) {
//            System.out.println(0);
//        } else if (n < 8712) {
//            System.out.println(1);
//            System.out.println(2178 + " " + 8712);
//        } else if (n >= 8712 && n < 219978) {
//            System.out.println(2);
//            System.out.println(2178 + " " + 8712);
//            System.out.println(21978 + " " + 87912);
//        } else if (n >= 219978 && n < 2199978) {
//            System.out.println(3);
//            System.out.println(2178 + " " + 8712);
//            System.out.println(21978 + " " + 87912);
//            System.out.println(219978 + " " + 879912);
//        } else if (n >= 2199978) {
//            System.out.println(4);
//            System.out.println(2178 + " " + 8712);
//            System.out.println(21978 + " " + 87912);
//            System.out.println(219978 + " " + 879912);
//            System.out.println(2199978 + " " + 8799912);
//        }
//    }
}

/**
 * 4
 * 2178 8712
 * 21978 87912
 * 219978 879912
 * 2199978 8799912
 */
