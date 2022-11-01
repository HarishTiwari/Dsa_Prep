package Arrays;

public class ClosestNumber {

    public int findClosest(int[] arr , int target){

        int closest = Integer.MAX_VALUE;
        int element = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            int diff = Math.abs(target - arr[i]);
            if(closest >= diff) {
                closest = diff;
                if(arr[i] > element)
                element = arr[i];
            }
        }

        return element;
    }

    public int findClosestEfficient(int[] arr , int target){

        if(target <= arr[0])
            return arr[0];
        if(target >= arr[arr.length - 1])
            return arr[arr.length - 1];

        // Binary Search Logic
        int low = 0;
        int high = arr.length;
        int mid = 0 ;

        while(low < high){
            mid = (low + high)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] > target){

                if(mid > 0 && arr[mid - 1] < target)
                    return findDiff(target , arr[mid -1] , arr[mid]);

                high = mid;
            }
            else if(arr[mid] < target){

                if(mid < arr.length - 1 && arr[mid+1] > target)
                    return findDiff(target , arr[mid+1] , arr[mid]);

                low = mid + 1;
            }
        }

        return arr[mid];
    }

    private int findDiff(int target, int val1, int val2) {

        if(Math.abs(target - val1) >= Math.abs(target - val2))
            return val2;
        else
            return val1;
    }
}
