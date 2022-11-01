package patterns;

public class Pattern4 {

    /*
        1
        22
        333
        4444
        55555
     */

    public void createNumTrianglePat(int n){
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=n ; j++){
                if(j<=i)
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
