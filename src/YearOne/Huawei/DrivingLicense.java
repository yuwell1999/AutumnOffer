package YearOne.Huawei;

import java.util.*;

public class DrivingLicense {
    //0,1,2,3,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isCollision = false;
        boolean isNegative = false;
        boolean isEqual = true;
        List<Integer> list = new LinkedList<>();
        int[] target = new int[]{0, 1, 2, 3, 4, 3, 2, 1, 5, 6, 5, 7, 8, 9, 8, 7, 5, 1, 0};


        Set<Character> set = new HashSet<Character>() {
            {
                add('A');
                add('B');
                add('C');
                add('D');
                add('E');
                add('F');
            }
        };

        String[] inp = s.nextLine().split("\\,");
        char[] inps = new char[inp.length];
        for (int i = 0; i < inp.length; i++) {
//            if(set.contains(inp[i].charAt(0))){
//                isCollision = true;
//            }
//
//            if(Integer.parseInt(inp[i])==-1){
//                isNegative = true;
//            }
            inps[i] = inp[i].charAt(0);
        }

        String[] numbers = inp.clone();
        for (String ss : numbers) {
            if (Integer.parseInt(ss) <= 9 && Integer.parseInt(ss) >= 0) {
                list.add(Integer.parseInt(ss));
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
            }
        }

//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        if (list.size() <= target.length) {
            for (int i = 0; i < target.length - 1; i++) {
                if (list.get(i) != target[i]) {
                    isEqual = false;
                }
            }
        }

        if (isEqual) {
            System.out.println("Success");
        }


        for (Character c : inps) {
            if (set.contains(c)) {
                //System.out.println("Collision");
                isCollision = true;
            }
        }


        if (isCollision) {
            System.out.println("Collision");
        }
    }
}

class Automation {
    private final String state = "start";
    private final Map<String, String[]> table = new HashMap<String, String[]>() {
        {
            put("start", new String[]{"start", "number", "end"});
            put("number", new String[]{"start", "number", "end"});
            put("end", new String[]{"start", "number", "end"});
        }
    };
    public int sign = 1;
    public long ans = 0;


}
