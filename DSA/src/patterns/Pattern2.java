package patterns;

public class Pattern2 {

    /*
        *
        **
        ***
        ****
        *****
     */

    public void createTrianglePat(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j<=i)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
