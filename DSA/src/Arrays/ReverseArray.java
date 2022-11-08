package Arrays;

public class ReverseArray {

    public int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public int[] reverseArrayRecursion(int[] arr) {

        return reverseArrayRecursion(arr, 0, arr.length - 1);
    }

    public int[] reverseArrayRecursion(int[] arr, int start, int end) {

        if (start >= end) {
            return arr;
        }

        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        return reverseArrayRecursion(arr, start + 1, end - 1);
    }
}
