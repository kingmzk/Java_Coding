public class MergeSort {
    private int[] arr;
    private int[] tempMergeArr;
    private int length;

    public static void main(String[] args) {
        int inputArr[] = {56, 45, 89, 9, 56, 67, 12, 32, 45, 100, 10, 6, 8, 3, 100};

        MergeSort ms = new MergeSort();
        ms.sort(inputArr);

        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int[] inputArr) {
        this.arr = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divide(0, length - 1);
    }

    private void divide(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = (lowerIndex + higherIndex) / 2;

            // Recursively sort first and second halves
            divide(lowerIndex, middle);
            divide(middle + 1, higherIndex);

            // Merge the sorted halves
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeArray(int lowerIndex, int middle, int higherIndex) {
        // Copying both parts into the temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = arr[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        // Copy the smallest values from either the left or the right side back to the original array
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                arr[k] = tempMergeArr[i];
                i++;
            } else {
                arr[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }

        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            arr[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
