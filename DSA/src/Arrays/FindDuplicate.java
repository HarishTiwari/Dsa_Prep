package Arrays;

import java.util.Arrays;

public class FindDuplicate {

    int[] arr;
    int n;

    FindDuplicate(int[] arr , int n){
        this.arr = arr;
        this.n = n;
    }

     public int findDuplicateNumber(){
//         Arrays.sort(arr);
//
//         for(int i=0 ; i < n ; i++) {
//             if(arr[i] == arr[i+1])
//                 return arr[i];
//         }
//
//         return -1;

         int i = 0 ;
         int j = n-1;

         while( i != j ){
             if(arr[i]==arr[j]){
                 return arr[i];
             }

             j--;
             if(i == j )
             {
                 i = i + 1;
                 j = n - 1;
             }

         }

         return -1;
    }
}
