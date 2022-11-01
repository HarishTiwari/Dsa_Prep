package Arrays;

public class NextPermutation {
    int[] arr;

    NextPermutation(int[] arr){
        this.arr = arr;

    }

    public void nextPermutation(){

        int i = arr.length - 2;

        while(i>=0 && arr[i] >=arr[i+1])
            i--;

        if(i>=0){
            int j = arr.length - 1;

            while(j>=0 && arr[j] <= arr[i])
                j--;

            swap(arr , i , j);
        }

        reverse(arr,i+1);

    }

    private void reverse(int[] arr, int start) {
        int end = arr.length -1;
        while(start<arr.length){
            swap(arr, start , end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
