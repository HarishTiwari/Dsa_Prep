package patterns;

public class Pattern12 {

    /*
           1      1
           12    21
           123  321
           12344321
     */

    public void rightAndLeftTriangleNum(int n) {
        int l = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j <= n * 2 - 1; j++) {
                if (j <= i) {
                    System.out.print(k+" ");
                } else if (j >= l - i) {
                    System.out.print(k+" ");
                } else {
                    System.out.print("  ");
                }

                if (j < n) {
                    k++;
                } else {
                    k--;
                }
                if (k == n + 1) {
                    k--;
                }
            }
            System.out.println();
        }
    }
}

