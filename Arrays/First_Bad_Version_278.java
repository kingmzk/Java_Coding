public class First_Bad_Version_278 {

    public static int firstBadVersion(boolean[] arr, int len) {
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        boolean[] arr = {false, false, false, false, false, false, false, true, true, true, true};
        int len = arr.length;

        int result = firstBadVersion(arr, len);
        System.out.println("First bad version is at index: " + result);
    }
}
