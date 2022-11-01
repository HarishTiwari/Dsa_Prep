package patterns;

public class Pattern22 {

    /*

     ****
     *  *
     *  *
     ****

     */

    public void rectanglePattern(int n) {

        for(int i=0 ; i<n; i++){
            for(int j=0 ; j<n;j++){
                if(i !=0 && i != n-1){
                    if(j!=0 && j != n-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

