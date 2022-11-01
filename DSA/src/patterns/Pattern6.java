package patterns;

public class Pattern6 {

    /*
        12345
        1234
        123
        12
        1
     */

    public void createDownTrianglePat(int n){
        for(int i = 0 ; i <n ; i++){
            for(int j = 0 ; j <n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
