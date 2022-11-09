package strings;

public class PalindromeString {

    int isPalindrome(String S) {

        //String rev = reverseString(S);
        String rev = reverseStringRecursion(S);
        //System.out.println(rev);

        if (S.equals(rev)) return 1;
        else return 0;
    }

    private String reverseString(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    private String reverseStringRecursion(String str) {

        if (str.length() == 1 || str.length() == 0) {
            return str;
        }

        return reverseStringRecursion(str.substring(1)) + "" + str.charAt(0);
    }
}
