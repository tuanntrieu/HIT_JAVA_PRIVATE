/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;

public class RunMain {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Rectangle(2, 3));
        list.add(new Circle(3.6));
        list.add(new Rectangle(5.5, 3.9));
        list.add(new Circle(8.6));
        list.add(new Rectangle(2.6, 3.7));
        list.add(new Circle(6.3));
        System.out.println("Dien tich, chu vi cac hinh la: ");
        for(Shape tmp:list){
            if(tmp instanceof Rectangle ){
                Rectangle tmp1=(Rectangle)tmp;
                System.out.println("Dien tich: "+tmp1.getArea()+", chu vi: "+tmp1.getPerimeter());
            }
            if(tmp instanceof Circle){
                Circle tmp1=(Circle)tmp;
                System.out.println("Dien tich: "+tmp1.getArea()+", chu vi: "+tmp1.getPerimeter());
            }
        }

    }
}
