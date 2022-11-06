package Arrays;

public class MinimumNumberOfJumps {
    public int minOfJumps(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int jumps = 0;
        int l = arr.length - 1;
        int i = 0;
        while (i <= l) {
            if (arr[i] == 0 && i != l) {
                return -1;
            } else {
                int nextIndex = i + arr[i];
                if (nextIndex >= l) {
                    jumps++;
                    break;
                } else {
                    i = nextIndex;
                    jumps++;
                }
            }
        }
        return jumps;
    }
}
