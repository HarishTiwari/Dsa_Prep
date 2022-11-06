package recursion;

public class MainClass {
    public static void main(String[] args) {

//        PrintNtimes pNt = new PrintNtimes();
//        pNt.printNtimes(10);

//        PrintNTo1times pNt = new PrintNTo1times();
//        pNt.printNtimes(10);

        FirstSumOfFirstNterms fN = new FirstSumOfFirstNterms();
        long n = fN.sumOfSeriesFormula(5);
        System.out.println(n);

    }
}
