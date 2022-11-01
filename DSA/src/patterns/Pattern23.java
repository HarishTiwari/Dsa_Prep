package patterns;

public class Pattern23 {

    /*

     4 4 4 4 4 4 4
     4 3 3 3 3 3 4
     4 3 2 2 2 3 4
     4 3 2 1 2 3 4
     4 3 2 2 2 3 4
     4 3 3 3 3 3 4
     4 4 4 4 4 4 4

     */

//    public void circularNumPattern(int n) {
//        int size = 2 * n - 1;
//        int start = 0;
//        int end = size - 1;
//        int[][] a = new int[size][size];
//        while (n != 0) //4
//        {
//
//            for (int i = start; i <= end; i++) {
//                for (int j = start; j <= end; j++) {
//                    if (i == start || i == end || j == start || j == end) {
//                        a[i][j] = n;
//                    }
//                }
//            }
//            ++start;
//            --end;
//            --n;
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//
//                System.out.print(a[i][j] + " ");
//            }
//
//            System.out.println(" ");
//        }
//    }

    public void circularNumPattern(int n) {
        int size = 2 * n - 1;
        int start = 0;
        int end = size - 1;

        int[][] a = new int[size][size];

        while (n != 0) {

            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i == start || i == end || j == start || j == end) {
                        a[i][j] = n;
                    }
                }

            }
            start++;
            end--;
            n--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println(" ");
        }
    }
}

