package Arrays;

public class JumpArray {

    public int[] arr;
    public int n;

    public JumpArray(int[] arr , int n) {
        this.arr = arr;
        this.n = n;
    }

    public int minJumps(){
        int i = 0 ;
        int count=0;

        while(i < n){
            int jump = arr[i];
            i = i + jump;
            count++;

            if(i >=n-1){
                return count;
            }

            if(i==0){
                return -1;
            }
        }

        return count;
    }
}
