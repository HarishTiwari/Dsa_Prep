package patterns;

public class Pattern13 {

    /*
           1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15
     */

    public void rightDirectedTriangleNum(int n) {

        int k = 1;

        for(int i = 0 ; i < n ; i++){
            for(int j=0 ; j<n ; j++){
                if(j<=i){
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}

