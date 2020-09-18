package YearOne.TAL;

import java.util.Scanner;

public class AmazingSubwayStation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bin = s.nextLine();

        String ten = Long.toString(Long.parseLong(bin, 2), 10);
        //System.out.println(four);
        //int ten = Integer.parseInt(bin,4);
        //System.out.println(ten);
        long sum = Long.parseLong(ten);
        long one = 1;
        int cnt = 0;
//        System.out.println(Math.log(4));
//        System.out.println(Math.log(4));
//        System.out.println((long)Math.ceil((Math.log(sum)/Math.log(4))));
        while (one < sum) {
            cnt++;
            one *= 4;
//            if(one == sum){
//                cnt ++;
//                System.out.println(cnt);
//
//            }else{
//
//            }
        }
        System.out.println(cnt);
    }
}
