package Arrays.Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
