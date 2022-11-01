package patterns;

public class Pattern14 {

    /*
           A
           AB
           ABC
           ABCD
           ABCDE
     */

    public void rightDirectedTriangleAlpha(int n) {

        for (int i = 0; i < n; i++) {
            char K = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(K);
                K++;
            }
            System.out.println();
        }
    }
}

