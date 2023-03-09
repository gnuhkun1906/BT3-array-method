package Maxvalue;

public class MaxValue {
    public static void main(String[] args) {
        int arr[][]={
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };

        int maxValue=arr[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j]>maxValue){
                    maxValue=arr[i][j];
                }
            }
        }
            System.out.println("Max Value is :"+ maxValue);
    }
}
