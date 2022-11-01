package Arrays;

import java.util.Arrays;

/*
This is the class to find the second largest element in an array

arr[] = { 1, 3,5,6,7,8 }
o/p = 7
 */
public class SecondLargest {

    // approach using arrays.sort
    // time complexity is Arrays.sort() is O(nlogn)
    // This approach will not work in the case for duplicate element.
    public int findSecondLargest(int[] arr){

        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public int findSecondLargestEfficient(int[] arr){
        int secondLargest = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                secondLargest = max;
                max = arr[i];
            }
            if(arr[i] < max && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

}
