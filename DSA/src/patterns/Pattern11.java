package patterns;

public class Pattern11 {

    /*
           1
           01
           101
           0101
           10101
     */

    public void rightDirected0or1Triangle(int n){

        for(int i=0; i<n ; i++){
            for(int j=0 ; j<=i ; j++){
                if(i==j) {
                    System.out.print("1");
                }
                else if(i%2==0 && j%2==0){
                    System.out.print("1");
                }
                else if(i%2!=0 && j%2!=0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        }

    }

