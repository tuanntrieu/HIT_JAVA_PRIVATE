
package Bai1;

public abstract class PhuongTienDiChuyen {
    private String loaiPhuongTien;
    private HangSanXuat hagSanXuat;
    
    public PhuongTienDiChuyen(){
        
    }

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hagSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hagSanXuat = hagSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHagSanXuat() {
        return hagSanXuat;
    }

    public void setHagSanXuat(HangSanXuat hagSanXuat) {
        this.hagSanXuat = hagSanXuat;
    }
    public String layTenHangSanXuat(){
        return this.hagSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        
    }
    public void tangToc(){
        
    }

    @Override
    public String toString() {
        return "loaiPhuongTien=" + loaiPhuongTien + ", "+hagSanXuat;
    }
    public void dungLai(){
        
    }
    public abstract double layVanToc();
}
