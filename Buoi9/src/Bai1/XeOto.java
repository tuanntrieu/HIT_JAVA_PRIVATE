
package Bai1;

public class XeOto extends PhuongTienDiChuyen{

    private String loaiNhienLieu;

    public XeOto(){
        
    }

    

    public XeOto(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hagSanXuat) {
        super(loaiPhuongTien, hagSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    
    @Override
    public double layVanToc() {
        return 70f;
    }
    @Override
    public String toString() {
        return "XeOto{" +super.toString()+ " loaiNhienLieu=" + loaiNhienLieu + ", Van toc: "+this.layVanToc()+"km/h }";
    }
}
