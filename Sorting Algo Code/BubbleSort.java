/**
 * This class implements both BubbleSort and Optimized BubbleSort
 */
class BubbleSort {

    /**
     * Compare adjacent elements i and i+1, if (i > i + 1) swap
     * @param arr
     */
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    
    /**
     * Optimized bubble sort, if no swaps happen during a cycle, break
     * @param arr
     */
    public void optimizedSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void swap (int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
