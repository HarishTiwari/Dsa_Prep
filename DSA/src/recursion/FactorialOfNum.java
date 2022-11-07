package recursion;

public class FactorialOfNum {

    public long fact(long n) {

        if(n==1 || n==0)
            return 1;

        return n * fact(n-1);
    }
}
