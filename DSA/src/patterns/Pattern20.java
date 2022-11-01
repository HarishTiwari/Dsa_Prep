package patterns;

public class Pattern20 {

    /*
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     */

    public void whiteSpaceRhombus(int n) {

        int k = n - 1;

        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {

                if (i <= k) {
                    if (j >= n - i && j <= n + (i - 1)) {
                        System.out.print(" ");
                    } else
                        System.out.print("*");
                } else if (i > n) {
                    if (j >= i - k && j <= (n + 2 * k - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j >= n - i + 1 && j <= n + (i - 2)) {
                        System.out.print(" ");
                    } else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

