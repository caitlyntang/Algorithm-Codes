class InsertionSort {

    public void sort(int[] arr) {

        for (int i = 1; i < arr.length; ++i) {
            for (int k = i; k > 0; --k) {
                if (arr[k] < arr[k - 1]) {
                    swap(arr, k, k - 1);
                } else {
                    break;
                }
            }
        }
    }

    public void swap (int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}