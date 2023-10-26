class SelectionSort {

    /**
     * Find the smallest element in the array
     * if smallest element is not at the current position i
     * swap element at i and the smallest element
     * @param arr
     */
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; i++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                swap(arr, i, min);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
