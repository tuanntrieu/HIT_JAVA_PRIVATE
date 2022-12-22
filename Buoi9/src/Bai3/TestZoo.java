/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

public class TestZoo {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ZooService zooService=new ZooService();

        do {
            System.out.println("MENU\n"
                    + "1. Them chuong\n"
                    + "2. Xoa chuong\n"
                    + "3. Them con vat\n"
                    + "4. Xoa con vat\n"
                    + "5.Xem tat ca cac con vat\n"
                    + "6.Thoat");
            System.out.println("Nhap lua chon");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    zooService.ThemChuong(zoo);
                    break;
                }
                case 2:{
                    zooService.XoaChuong(zoo);
                    break;
                }
                case 3: {
                    zooService.ThemConVat(zoo);
                    break;
                }
                case 4:{
                    zooService.xoaConVat(zoo);
                    break;
                }
                case 5:{
                    zooService.XemTatCa(zoo);
                    break;
                }
                case 6:{
                    return;
                }
                default:{
                    System.out.println("Khong co trong chuong trinh");
                }
            }
        } while (true);
    }
}
