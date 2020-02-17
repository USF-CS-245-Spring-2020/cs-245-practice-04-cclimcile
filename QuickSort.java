import java.util.*;

public class QuickSort implements SortingAlgorithm {

    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    void quickSort(int arr[], int start, int end){
        if(start < end){
            int pivot_index = partition(arr, start, end);
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }
    }

    int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int pivot_index = start;

        // Marks out where the pivot index should be
        for(int i = start; i < end; i++){
            if(arr[i] <= pivot) {
                swap(arr, i, pivot_index);
                pivot_index += 1;
            }
        }
        swap(arr, pivot_index, end);

        return pivot_index;
    }


    public void sort(int [] arr){
        quickSort(arr, 0, arr.length - 1);
    }
}
