package Arrays;

import java.util.HashMap;

public class SubarrayWithSum0 {

    int[] arr;
    int n;

    SubarrayWithSum0(int[] arr , int n){
        this.n = n;
        this.arr = arr;
    }

    public boolean findSum(){
        if(n<0)
            return false;

        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < n ; i++){

            sum += arr[i];

            // {4 , 2 , -3 , 1 , 6 }

            if(arr[i]== 0 || sum==0 ||map.containsKey(sum) )
                return true;

            map.put(sum , arr[i]);
        }

        return false;

    }
}
