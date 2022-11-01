package basicMaths;

public class MainClass {

    public static void main(String[] args) {
//        CountDigit cd = new CountDigit();
//        int n = cd.countDigits(28);

//        ReverseBits rb = new ReverseBits();
//        Long n = rb.reverseBits(11);

//        ReverseNumber rN = new ReverseNumber();
//        int n = rN.reverseNum(234);

//        PalindromeNumber pN = new PalindromeNumber();
//        boolean n  = pN.palindromeNum(121);

//        HCForGCD hcf = new HCForGCD();
//        Long l = new Long(5);
//        Long m = new Long(25);
//        Long[] ans = hcf.lcmAndGcd(l, m);
////        int n = hcf.hcfOrGCD(49, 7);
//        for (Long x : ans) {
//            System.out.print(x + " ");
//        }

        ArmstrongNumber aN = new ArmstrongNumber();
        boolean n = aN.armsNum(153);
        System.out.println(n);
    }
}
