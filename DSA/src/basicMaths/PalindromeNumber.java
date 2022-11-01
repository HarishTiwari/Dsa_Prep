package basicMaths;

public class PalindromeNumber {

    public boolean palindromeNum(int n) {
        int num = n;
        int rev = 0;
        while (n != 0) {
            int unit = n % 10;
            rev = rev * 10 + unit;
            n = n / 10;
        }

        return rev == num;
    }
}
