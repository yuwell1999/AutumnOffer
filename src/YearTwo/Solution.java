package YearTwo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final List<String> names1 = new ArrayList<String>() {
        {
            add("crazy");
            System.out.println("crazy");
            System.out.println(names1);
        }
    };

    private static final List<String> names = new ArrayList<String>() {
        {
            add("yuyue");
            System.out.println("yuyue");
            System.out.println(names);
        }
    };

    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println(names1);
        System.out.println(names);
    }
}
