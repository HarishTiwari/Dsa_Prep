package recursion;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

//        PrintNtimes pNt = new PrintNtimes();
//        pNt.printNtimes(10);

//        PrintNTo1times pNt = new PrintNTo1times();
//        pNt.printNtimes(10);

//        FirstSumOfFirstNterms fN = new FirstSumOfFirstNterms();
//        FactorialOfNum fN = new FactorialOfNum();
//        FindFactorialTillN fN = new FindFactorialTillN();
//        for (Long x : fN.factorialNumbers(6)) {
//            System.out.print(x+" ");
//        }
//        long n = fN.fact(5);
//        System.out.println(n);

        ReverseArray rA = new ReverseArray();
        int[] arr = {5, 4, 3, 2, 1};
        int[] rev = rA.reverseArrayRecursion(arr);

        for(int x : rev){
            System.out.print(x + " ");
        }
    }
}
