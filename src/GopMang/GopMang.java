package GopMang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int size;

        System.out.println("Enter the size of array1 :");
        size=sc.nextInt();
      int arr1[]=new int[size];
      int arr2[]=new int[size];
        int arr3[]=new int[arr1.length+ arr2.length];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("Enter the element : " +(i+1)+": ");
            arr1[i]=sc.nextInt();
            arr3[i]=arr1[i];
        }
        System.out.println("abc"+Arrays.toString(arr3));
        System.out.println("arr1 : "+ Arrays.toString(arr1));
        System.out.println("Enter the size of array2 :");
        size=sc.nextInt();
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("Enter the element : " +(i+1)+": ");
            arr2[i]=sc.nextInt();
        }
        System.out.println("arr2 : "+ Arrays.toString(arr2));


        for (int i = 0; i < arr2.length ; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println("arr3 :" + Arrays.toString(arr3));
    }
}
