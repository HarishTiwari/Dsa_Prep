package recursion;

public class PrintNtimes {

    public void printNtimes(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNtimes(n - 1);
        System.out.print(n + " ");
    }
}
