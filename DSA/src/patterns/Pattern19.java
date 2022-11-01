package patterns;

public class Pattern19 {

    /*
            E
            ED
            EDC
            EDCB
            EDCBA
     */

    public void rightTriangleAlpha(int n) {
        for (int i = 0; i < n; i++) {
            int k = n - 1;
            char ch = (char)(65 + k);
            for (int j = 0; j < n; j++) {
                if(j<=i){
                    System.out.print(ch + " ");
                    ch--;
                }
            }
            System.out.println();
        }
    }
}

