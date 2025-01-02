package Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static int search(int arr[], int key) {

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                position = i;
                break;
                // It is only for the thing is that is the value is matched than no need of checking the value further because it is already got .
            }
            else
                position = -1;
        }
        return position;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Key to search : ");
        int key = scn.nextInt();
        int position = search(arr, key);
        System.out.println(position);
    }
}