package basicMaths;

public class CountDigit {

    public int countDigits(int N) {

        int n = N;
        int count = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem != 0 && N % rem == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }
}
