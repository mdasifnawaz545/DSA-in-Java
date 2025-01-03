package Arrays;

public class BinarySearch {
    public static int search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (key == arr[mid]) return mid;
            else if (key < arr[mid]) end = mid - 1;
            else start = mid + 1;
            // The main thing of this binary search code is to also update the index of the mid on each divide and conquer process.
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {34, 56, 59, 87, 89, 96, 98};
        int key = 87;
        int position = search(arr, key) + 1;
        System.out.println(position);
    }
}
