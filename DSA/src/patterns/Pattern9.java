package patterns;

public class Pattern9 {

    /*
            *
           ***
          *****
         *******
        *********
        *********
         *******
          *****
           ***
            *
     */

    public void createRombusPat(int n){

        int k = n-1;

        for(int i = 0 ; i < n*2 ; i++){
            for(int j=0 ; j < n*2-1; j++){

                if(i <= k){
                    if(j >= k-i && j<= k+i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j >= i-k-1 && j <= k*2-(i-k-1)){
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
