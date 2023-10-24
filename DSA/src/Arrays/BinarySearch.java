package Arrays; // package name

public class BinarySearch {

    public boolean binarySearchUsingRecursion(int[] arr, int key) {

        if (arr.length == 0)
            return false;

        if (arr.length == 1 && arr[0] == key)
            return true;

        return binarySearchUsingRecursion(arr, key, 0, arr.length - 1);
    }

    private boolean binarySearchUsingRecursion(int[] arr, int key, int low, int high) {

        // Base condition
        if (low > high)
            return false;

        int mid = (high + low) / 2;

        if (arr[mid] < key)
            return binarySearchUsingRecursion(arr, key, mid + 1, high);
        else if (arr[mid] > key)
            return binarySearchUsingRecursion(arr, key, low, mid - 1);
        else
            return true;
    }

    public boolean binarySearchUsingIterationMethod(int[] arr, int key) {

        if (arr.length == 0)
            return false;

        if (arr.length == 1 && arr[0] == key)
            return true;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (high + low) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
