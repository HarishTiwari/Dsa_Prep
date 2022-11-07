package recursion;

import java.util.ArrayList;

public class FindFactorialTillN {

    public ArrayList<Long> factorialNumbers(long N) {

        ArrayList<Long> ans = new ArrayList<>();

        long i = 1;
        while (i <= N) {
            long fact = fact(i);
            if (fact <= N) {
                ans.add(fact);
            } else {
                break;
            }
            i++;
        }
        return ans;
    }

    private long fact(long n) {
        if (n == 1 || n == 0) return 1;

        return n * fact(n - 1);
    }
}
