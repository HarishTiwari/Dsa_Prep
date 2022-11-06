package recursion;

public class PrintNTo1times {

    public void printNtimes(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNtimes(n - 1);
    }
}
