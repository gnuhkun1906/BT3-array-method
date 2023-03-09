package Max2;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[];
        int size;
        System.out.println("Enter the size of array");
        size= sc.nextInt();
        arr=new int[size];
        int max=arr[0];
        int max2=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter a element "+i+ ":");
            arr[i]= sc.nextInt();
            if (arr[i]>max){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Giá trị lớn thứ 2  là :"+max2);
    }
}
