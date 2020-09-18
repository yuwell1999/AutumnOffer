package YearOne.Test;

public class Test {
    public static void main(String[] args) {
        isPalindrome("race a car");
    }

    public static void isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        for (Character c : s.toCharArray()) {
            if (c <= 'Z' && c >= 'A' || c <= 'z' && c >= 'a') {
                sb.append(c);
                sb1.append(c);
            }
        }

        System.out.println(sb1.reverse().toString().toLowerCase());
        System.out.println(sb.toString().toLowerCase());
        //return (sb.reverse().toString().toLowerCase()).equals(sb.toString().toLowerCase());
    }
}
