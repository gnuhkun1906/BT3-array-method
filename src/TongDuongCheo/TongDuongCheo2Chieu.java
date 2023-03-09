package TongDuongCheo;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[][];
        System.out.println("Enter the Row of array");
        int row = sc.nextInt();
        System.out.println("Enter the Colum of array");
        int colum = sc.nextInt();
        arr = new double[row][colum];
        double sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter the elemnt " + i + "." + j);
                arr[i][j]= sc.nextDouble();
                if (i==j){
                   sum+=arr[i][j];
                }
            }
        }
        System.out.println("array: "+ Arrays.deepToString(arr));
        System.out.println("Sum :" + sum);

    }
}
