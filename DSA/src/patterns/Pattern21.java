package patterns;

public class Pattern21 {

    /*

     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *

     */

    public void twoTrianglePattern(int n) {

        int k = n - 1;
        int l = k * 2;

        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < 2 * n; j++) {

                if (i < k) {
                    if (j >= i + 1 && j <= l - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (i > k) {
                    if (j >= l - i + 1 && j <= i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

