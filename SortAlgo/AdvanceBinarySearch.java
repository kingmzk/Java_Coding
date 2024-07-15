import java.util.*;

public class AdvanceBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 2, 3 };
        int target = 2;

        Arrays.sort(arr);  // Sort the array first
        List<Integer> ans = findAllOccurrences(arr, target);

        System.out.println(ans);
    }

    public static List<Integer> findAllOccurrences(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();

        int firstOccurrence = binarySearch(arr, target, true);
        if (firstOccurrence == -1) {
            return result; // target not found
        }

        int lastOccurrence = binarySearch(arr, target, false);

        for (int i = firstOccurrence; i <= lastOccurrence; i++) {
            result.add(i);
        }

        return result;
    }

    public static int binarySearch(int[] arr, int target, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;  // Look on the left side
                } else {
                    low = mid + 1;   // Look on the right side
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
