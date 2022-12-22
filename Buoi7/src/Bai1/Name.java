/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 84944
 */
public class Name {

    public static Scanner sc = new Scanner(System.in);

    public static void search() {
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        ArrayList<String> listName = new ArrayList<String>();
        sc.nextLine();
        System.out.println("Nhap vao danh sach ten");
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            listName.add(a);
        }
        System.out.println(listName);
    }

    public static void main(String[] args) {
        search();
    }

}
