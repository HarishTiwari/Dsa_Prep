package patterns;

public class Pattern17 {

    /*
            A
           ABA
          ABCBA
         ABCDCBA
     */

    public void fullTriangleAlphaSame(int n) {

        int k = n - 1;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= k - i && j <= k + i) {
                    if(j<k) {
                        System.out.print(ch);
                        ch++;
                    }else{
                        System.out.print(ch);
                        ch--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

