package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Count frequencies in the element
 * Example 1:
 * Input: arr[] = {10,5,10,15,10,5};
 * Output: 10  3
 * 5  2
 * 15  1
 * Explanation: 10 occurs 3 times in the array
 * 5 occurs 2 times in the array
 * 15 occurs 1 time in the array
 * <p>
 * Example2:
 * Input: arr[] = {2,2,3,4,4,2};
 * Output: 2  3
 * 3  1
 * 4  2
 * Explanation: 2 occurs 3 times in the array
 * 3 occurs 1 time in the array
 * 4 occurs 2 time in the array
 */

public class CountFrequencyInArray {

    public void countFrequency(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.print(arr[i] + " " + count);
            System.out.println();

        }

    }

    public void countFrequencyOptimised(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevCount = map.get(arr[i]);
                map.put(arr[i], 1 + prevCount);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue());
            System.out.println();
        }
    }
}