package Arrays;

public class SubArray {
    public static void findMaxSubArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum sum of Subarray is : " + max);
    }

    public static void subArray(int arr[]) {
        int totalSubArray = 0;
        int newArr[] = new int[(arr.length * ((arr.length + 1) / 2))];
        int sum = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] +" ");
//                    sum+=arr[k];
//                }
//                System.out.println();
//                totalSubArray++;
//                newArr[n++]=sum;
//                sum=0;

                //More Optimised Way to find out the maximum of the sum of the array.
                sum += arr[j];
                newArr[n++] = sum;
            }
            sum = 0;
        }
//        System.out.println("Total Subarray is : "+totalSubArray);
//
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.println(newArr[i]);
//        }
        findMaxSubArray(newArr);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}
