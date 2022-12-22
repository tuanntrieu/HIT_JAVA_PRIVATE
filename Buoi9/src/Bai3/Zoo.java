
package Bai3;

import java.util.ArrayList;

public class Zoo {
    public Zoo(){}
    public ArrayList<Chuong> DanhSachChuong =new ArrayList<>();
    public void themChuong(Chuong c){
        DanhSachChuong.add(c);
    }
    public void xoaChuong(Chuong c){
        DanhSachChuong.remove(c);
    }
}
