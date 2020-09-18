package YearOne.Yonyou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DictOrderSort {
    /**
     * @param array string字符串一维数组
     * @return string字符串一维数组
     */
    public String[] quick_sort(String[] array) {
        // write code here
        int[] nums = new int[array.length];

        //Collections.sort(array,new Comparator<String>(){
        List<String> list = new ArrayList<>();
        for (String str : array) {
            list.add(str);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] c1 = o1.toCharArray();
                char[] c2 = o2.toCharArray();
                int i = 0;
                while (i < c1.length && i < c2.length) {
                    if (c1[i] > c2[i]) {
                        return 1;
                    } else if (c1[i] < c2[i]) {
                        return -1;
                    } else {
                        i++;
                    }
                }

                if (i == c1.length) {
                    return -1;
                }

                if (i == c2.length) {
                    return 1;
                }
                return 0;
            }
        });

        return list.toArray(list.toArray(new String[list.size()]));
    }

//    public int string2Num(String str){
//        Stack<Integer> stack = new Stack<>();
//        for(Character c:str.toCharArray()){
//            stack.push(c-'a');
//        }
//
//        int ans = 0;
//        while(!stack.empty()){
//            ans += stack.pop();
//            ans *= 10;
//        }
//
//        return ans;
//    }
}