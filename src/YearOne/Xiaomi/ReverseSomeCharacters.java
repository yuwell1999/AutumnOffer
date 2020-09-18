package YearOne.Xiaomi;

import java.util.Scanner;

public class ReverseSomeCharacters {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String reverse(String sourceStr, String changeStr) {
//        StringBuilder stringBuilder = new StringBuilder(changeStr);
//        if(changeStr==stringBuilder.reverse().toString()){
//            return sourceStr;
//        }
//        String returnS = sourceStr;
//        StringBuilder sb=null;
//        while(sourceStr.contains(changeStr)){
//            int index = sourceStr.indexOf(changeStr);
//            String str1 = sourceStr.substring(0,index);
//            String str2 = sourceStr.substring(index+changeStr.length(),sourceStr.length());
//            // abcdef
//            // bcd
//            // index = 1
//            //
//            sb = new StringBuilder(changeStr);
//            returnS = str1+sb.reverse().toString()+str2;
//            sourceStr = returnS;
//        }
//        return sourceStr;
        int cnt = sourceStr.length();
        int i = 0;
        String rev = new StringBuilder(changeStr).reverse().toString();
        while (sourceStr.contains(changeStr) && i < cnt) {
            sourceStr = sourceStr.replaceAll(changeStr, rev);
            i++;
        }
        return sourceStr;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _sourceStr;
        try {
            _sourceStr = in.nextLine();
        } catch (Exception e) {
            _sourceStr = null;
        }

        String _changeStr;
        try {
            _changeStr = in.nextLine();
        } catch (Exception e) {
            _changeStr = null;
        }

        res = reverse(_sourceStr, _changeStr);
        System.out.println(res);
    }
}
