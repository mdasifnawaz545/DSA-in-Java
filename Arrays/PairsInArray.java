package Arrays;

public class PairsInArray {

    public static int[] calculatePair(int arr[]) {
        int newArr[] = new int[arr.length * arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                newArr[k++] = arr[i];
                newArr[k++] = arr[j];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6};
        System.out.println("Pair of this array is ");
        int pairArr[] = calculatePair(arr);
        for (int i = 0; i < pairArr.length; i += 2) {
            System.out.println(pairArr[i] + " " + pairArr[i + 1]);
        }
    }
}
