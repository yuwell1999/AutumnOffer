package Tencent;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CommonLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arrn = new int[n];
        //List<Integer> listn = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            //listn.add(s.nextInt());
            arrn[i] = s.nextInt();
        }
        //s.nextLine();

        int m = s.nextInt();
        int[] arrm = new int[m];
        //List<Integer> listm = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            arrm[i] = s.nextInt();
            //listm.add(s.nextInt());
        }

//        for(int i=0;i<n;i++){
//            System.out.println(arrn[i]);
//        }
        List<Integer> list = new LinkedList<>();

//        for(int i=0;i<listm.size();i++){
//            int tmp = listm.get(i);
//            if(listn.contains(tmp)){
//                list.add(tmp);
//            }
//        }
        int nptr = 0;
        int mprt = 0;
        while (nptr < n && mprt < m) {
            //if(listn.get(nptr)==listm.get(mprt)){
            if (arrn[nptr] == arrm[mprt]) {

                //list.add(listn.get(nptr));
                list.add(arrn[nptr]);
                nptr++;
                mprt++;
                // }else if(listn.get(nptr)<listm.get(mprt)){
            } else if (arrn[nptr] < arrm[mprt]) {
                mprt++;
            } else {
                nptr++;
            }
        }
//        int [] ans = new int[list.size()];
//        list.toArray((int)ans);
        Integer[] ans = list.toArray(new Integer[list.size()]);
        //Arrays.sort(ans, Collections.reverseOrder());
        ///int[] ans = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
