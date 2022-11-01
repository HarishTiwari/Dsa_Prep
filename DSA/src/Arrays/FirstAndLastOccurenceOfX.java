package Arrays;

import java.util.ArrayList;

public class FirstAndLastOccurenceOfX {

    //This Approach will take O(n) time complexity
    public ArrayList<Long> firstAndLastOccurence(int[] arr, int key) {

        ArrayList<Long> result = new ArrayList<>();

        if (arr.length == 0 || arr.length == 1) {
            result.add((long) -1);
            result.add((long) -1);
            return result;
        }

        int start = 0;
        int end = arr.length - 1;
        while (arr[start] != key)
            start++;

        while (arr[end] != key)
            end--;

        result.add((long) start);
        result.add((long) end);

        return result;
    }

    // O(nlogn) time complexity approach
    public ArrayList<Long> firstAndLastOccurenceUsingBinarySearch(int[] arr, int key) {

        ArrayList<Long> result = new ArrayList<>();

        if (arr.length == 0 || arr.length == 1) {
            result.add((long) -1);
            result.add((long) -1);
            return result;
        }

        // Calling Binary Search Method
        int first = binarySearchForFindingFirstOccurence(arr, key);
        int last = binarySearchForFindingLastOccurence(arr, key);

        result.add((long) first);
        result.add((long) last);

        return result;
    }

    private int binarySearchForFindingLastOccurence(int[] arr, int key) {
        if (arr.length == 0)
            return -1;

        if (arr.length == 1 && arr[0] == key)
            return 0;

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

    private int binarySearchForFindingFirstOccurence(int[] arr, int key) {

        if (arr.length == 0)
            return -1;

        if (arr.length == 1 && arr[0] == key)
            return 0;

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

}
