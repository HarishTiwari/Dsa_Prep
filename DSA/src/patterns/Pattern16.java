package patterns;

public class Pattern16 {

    /*
            A
            BB
            CCC
            DDDD
            EEEEE
     */

    public void rightDirectedTriangleAlphaSame(int n) {

        char K = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(K);
            }
            System.out.println();
            K++;
        }
    }
}

