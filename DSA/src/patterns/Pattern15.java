package patterns;

public class Pattern15 {

    /*
           ABCDE
           ABCD
           ABC
           AB
           A
     */

    public void rightDirectedTriangleAlphaReverse(int n) {

        for (int i = 0; i < n; i++) {
            char K = 'A';
            for (int j = 0; j <= n-1-i; j++) {
                System.out.print(K);
                K++;
            }
            System.out.println();
        }
    }
}

