package YearOne.Meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiffRoutes {
    public static void main(String[] args) {
        int N = 0;
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        s.nextLine();

        String[][] a = new String[N][2];
        for (int i = 0; i < N; i++) {
            String str = s.nextLine();
            String[] line = str.split(" ");
            a[i][0] = line[0];
            a[i][1] = line[1];
        }

        List<String> list = new ArrayList<>();
        list.add(a[0][0]);
//
//        HashSet<String> hs = new HashSet<>();
//        hs.add(a[0][0]);
        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            int index = find(list, a[i][1]);
            if (index != -1) {
                ++cnt;
                int len = list.size();
                for (int j = index; j < len; j++) {
                    list.remove(index);
                }
            }
            if (i < a.length - 1) {
                list.add(a[i + 1][0]);
            }
        }

//        Map<String,Integer> left = new HashMap<>();
//        Map<String,Integer> right = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            left.put(a[i][0],left.getOrDefault(a[i][0],0));
//            left.put(a[i][1],right.getOrDefault(a[i][1],0));
//        }
//
//        int leftMax = left.get(a[1][0]);
//        for(s:left.keySet()){
//
//        }


        System.out.println(cnt);
    }

    static int find(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return i;
            }
        }

        return -1;
    }
}
