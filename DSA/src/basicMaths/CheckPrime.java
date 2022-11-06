package basicMaths;

public class CheckPrime {

    public String isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) return "No";
        return "Yes";
    }

    public String isPrimeOptimised(int n) {

        if(n==1)
            return "No";

        int sqrt = (int)Math.sqrt(n);
        System.out.println(n);
        System.out.println(sqrt);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
               return "No";
            }
        }
        return "Yes";
    }
}
