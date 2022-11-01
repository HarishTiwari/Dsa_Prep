package patterns;

public class Pattern8 {

    /*
        *********
         *******
          *****
           ***
            *
     */

    public void createDownFullTrianglePat(int n){

        int k = n-1;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 2*n-1 ; j++){
                if(j>=i && j<=k*2-i){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
