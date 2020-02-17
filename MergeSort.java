//MergeSort does logn merge steps as each merge step doubles the arr sz + it does n work each merge step thus, O(nlogn)

public class MergeSort implements SortingAlgorithm {

    public void mergeSort(int[] arr){

        int len = arr.length;
        if(len < 2){
            return;
        }

        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        // Populates the left array
        for(int i = 0; i < mid - 1; i++){
            left[i] = arr[i];
        }
        // Populates the right array
        for(int j = mid; j < len - 1; j++){
            right[j - mid] = arr[j];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    void merge(int[] left, int[] right, int[] arr){

        int merge_index = 0;
        int left_index = 0;
        int right_index = 0;

        // Sorts the array
        while(left_index < left.length && right_index < right.length){
            if (left[left_index] <= right[right_index]) {
                arr[merge_index++] = left[left_index++];
            } else {
                arr[merge_index++] = right[right_index++];
            }
        }

        // If all the elements of right has been used, populates the rest of the arr with elements of left
        while(left_index < left.length){
            arr[merge_index++] = left[left_index++];
        }
        // If all the elements of lefts has been used, populates the rest of the arr with elements of right
        while(right_index < right.length){
            arr[merge_index++] = right[right_index++];
        }

    }

    public void sort(int [] arr){
        mergeSort(arr);
    }
}
