/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

public class MayBay extends PhuongTienDiChuyen {

    private String loaiNhienLieu;

    public MayBay() {
    }

    public MayBay(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public MayBay(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hagSanXuat) {
        super(loaiPhuongTien, hagSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    public void catCanh(){}
    public void haCanh(){}

    @Override
    public double layVanToc() {
        return 972.3f;
    }

    @Override
    public String toString() {
        return "MayBay{ " +super.toString()+ " loaiNhienLieu= " + loaiNhienLieu + ", Van toc: "+this.layVanToc()+"km/h }";
    }

    

}
