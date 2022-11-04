package basicMaths;

public class sumAllDivison {

    public long divisors(int n) {
        long result = 0;
        int count = 1;

        while (count <= n) {
            long sum = 0;
            for (int i = 1; i <= count; i++) {
                if (count % i == 0) {
                    sum += i;
                }

            }
            result += sum;
            count++;
        }
        return result;
    }

    public long divisorsOptimized(int n) {
        long result = 0;
        int count = 1;

        while (count <= n) {
            long sum = 0;
            int sqrt = (int) Math.sqrt(count);
            for (int i = 1; i <= sqrt; i++) {
                if (count % i == 0) {
                    if (i != sqrt) {
                        sum += i + count / i;
                    } else {
                        sum += i;
                    }
                }
            }
            result += sum;
            count++;
        }
        return result+5;
    }

    public long divisorsLinearOptimized(int n) {
        long result = 0;

        for(int i = 1 ; i <= n ; i++){
            result += n/i * i;
        }
        return result;
    }
}
