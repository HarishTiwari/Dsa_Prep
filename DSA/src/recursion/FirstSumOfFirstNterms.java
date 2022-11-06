package recursion;

public class FirstSumOfFirstNterms {

    public long sumOfSeries(long n) {

        if (n == 1) {
            return 1;
        }
        long prevSum = sumOfSeries(n - 1);
        long ans = prevSum + (long) Math.pow(n, 3);
        return ans;
    }

    public long sumOfSeriesFormula(long n) {

        long ans = n * (n + 1) / 2;

        return ans * ans;
    }
}
