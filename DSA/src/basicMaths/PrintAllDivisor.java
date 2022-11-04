package basicMaths;

public class PrintAllDivisor {

    public void divisors(int n) {
        int count = 1;
        while (count <= n) {
            if (n % count == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }

    public void divisorsOptimized(int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {

            if (n % i == 0) {
                int quo = n / i;
                if (quo != i) {
                    System.out.print(i + " " + quo + " ");
                } else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
