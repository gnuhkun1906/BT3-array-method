package PushIndex;

import java.util.Arrays;
import java.util.Scanner;

public class pushIndex {
    public static void main(String[] args) {
        int arr[] = {1, 9, 6, 7, 5, 2, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number push in the array : ");
        int number = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần push");
        int index = scanner.nextInt();
        int newArray[] = new int[arr.length + 1];
        System.out.println("array : " + Arrays.toString(arr));
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = number;
        System.out.println("mảng mối là:" + Arrays.toString(newArray));
    }
}
