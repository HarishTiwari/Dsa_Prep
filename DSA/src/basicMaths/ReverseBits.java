package basicMaths;

public class ReverseBits {

    public Long reverseBits(long X) {

        String binary = "";
        long n = X;

        while (n != 0) {
            long unit = n % 2;
            binary = unit + binary;
            n = n / 2;
        }
        // System.out.println(Integer.toBinaryString(10));
        //System.out.println(Long.parseLong(binary));
        n = Long.parseLong(binary);

        String rev = "";

        while (n != 0) {
            long unit = n % 10;
            rev += unit;
            n = n / 10;
        }
       // System.out.println(rev);

        return Long.parseLong(rev,2);
    }
}
