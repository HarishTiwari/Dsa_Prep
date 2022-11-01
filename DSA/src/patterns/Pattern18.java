package patterns;

public class Pattern18 {

    /*
            E
            DE
            CDE
            BCDE
            ABCDE
     */

    public void rightTriangleAlpha(int n) {
        for (int i = 0; i < n; i++) {
            int k = n - 1 - i;
            char ch = (char)(65 + k);
            for (int j = 0; j < n; j++) {
                if(j<=i){
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }
}

