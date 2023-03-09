package DelIndex;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,6};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the delete element : ");
        int delIndex=input.nextInt();
        int index=0;
        int newArray[]=new int[arr.length-1];
        for (int i = 0; i < arr.length ; i++) {
            if (delIndex==arr[i]){
                index=i;
            }
        }
        System.out.println("số cần xóa nằm ở vị trí "+ index);
        for (int i = index; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];

        }
        for (int i = 0; i < arr.length-1 ; i++) {
            newArray[i]=arr[i];
        }
        System.out.println("mảng mới là: "+ Arrays.toString(newArray));
    }
}
