package patterns;

public class Pattern3 {

    /*
        1
        12
        123
        1234
        12345
     */

    public void createNumTrianglePat(int n){
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <=n ; j++){
                if(j<=i)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
