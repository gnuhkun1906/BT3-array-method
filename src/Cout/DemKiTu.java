package Cout;

import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi string của bạn");
        String chuoi = sc.nextLine();
        System.out.println("Nhập vào kí tự bạn muốn tìm kiếm");
        char kiTu=sc.next(".").charAt(0);
        int count=0;
        boolean check=false;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i)==kiTu){
                check=true;
                count++;
            }
        }
        if (!check){
            System.out.println("đéo có đâu");
        }
        System.out.println("số lần xuất hiện của kí tự"+kiTu+"trong chuỗi là: "+count);
    }
}
