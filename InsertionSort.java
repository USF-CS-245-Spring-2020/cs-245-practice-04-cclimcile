public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            int next = arr[i];
            int j = i  - 1;
            // Only is the temp is smaller than value at index, it pushes the numbers back to insert temp at that index
            while(j >= 0 && next < arr[j]){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = next;
        }

    }
}
