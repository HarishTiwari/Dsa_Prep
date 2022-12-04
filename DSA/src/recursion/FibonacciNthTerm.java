package recursion;

public class FibonacciNthTerm {

    public long[] printFibb(int n){
        long first = 1;
        long second = 1;
        long[] result = new long[n];
        if(n==1){
            result[0] = 1;
            return result;
        }
        result[0] = first;
        result[1] = second;

        for(int i = 2 ; i < n ;i++){
            result[i] = first + second;
            first = second;
            second = result[i];
        }

        return result;
    }
}
