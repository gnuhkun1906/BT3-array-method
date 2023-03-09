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
        int newArray[]=new int[arr.length];
        System.out.println("array : "+Arrays.toString(arr));
        if (index <=-1 && index >= arr.length - 1) {
            System.out.println("Không chèn đc phần tử");
            System.out.println("vui lòng nhập lại vị trí cần chèn");
            index= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (index==i){
                arr[i]=number;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            newArray[i]=arr[i];
        }
        System.out.println("mảng mới là: "+ Arrays.toString(newArray));
    }
}
