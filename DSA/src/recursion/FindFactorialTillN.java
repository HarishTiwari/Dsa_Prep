package recursion;

import com.sun.jdi.LongValue;

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

    public ArrayList<Long> factorialNumbersOptimised(long N) {

        ArrayList<Long> ans = new ArrayList<>();

        Long fact = Long.valueOf(1);
        for(long i = 1 ; i <= N ; i++){

            fact *= i;
            if(fact <= N){
                ans.add(fact);
            }else{
                break;
            }
        }
        return ans;
    }
}
