package MinValue;

import java.util.Arrays;
import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Array :" + Arrays.toString(arr));
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("The smallest element of the list is: " + minValue);
    }
}
