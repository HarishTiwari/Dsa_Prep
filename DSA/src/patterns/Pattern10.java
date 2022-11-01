package patterns;

public class Pattern10 {

    /*
           *
           **
           ***
           ****
           *****
           ****
           ***
           **
           *
     */

    public void createRightDirectedTriangle(int n){
        int k = n -1;
        for(int i=0 ; i < 2*n - 1 ; i++){
            for(int j=0; j < n ; j++){

                if(i<=k){
                    if(j>=0 && j<=i){
                        System.out.print("*");
                    }else
                        System.out.print(" ");
                }else{
                    if(j>=0 && j<=2*k-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
