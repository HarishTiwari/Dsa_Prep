package patterns;

public class Pattern7 {

    /*
        *
       ***
      *****
     *******
    *********
     */

    public void createFullTrianglePat(int n){
        int k = n -1;
        for (int i=0 ; i < n ; i++){
            for (int j=0 ; j < n*2-1; j++){
                if(j>=k-i && j<=k*2+i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
